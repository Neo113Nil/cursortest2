package androidx.emoji2.text;

/* loaded from: classes2.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;
    private final int[] mEmojiAsDefaultStyleExceptions;
    private androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;
    private final androidx.emoji2.text.MetadataRepo mMetadataRepo;
    private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    private interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    private static boolean hasInvalidSelection(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    EmojiProcessor(androidx.emoji2.text.MetadataRepo metadataRepo, androidx.emoji2.text.EmojiCompat.SpanFactory spanFactory, androidx.emoji2.text.EmojiCompat.GlyphChecker glyphChecker, boolean z, int[] iArr, java.util.Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private void initExclusions(java.util.Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            java.lang.String str = new java.lang.String(iArr, 0, iArr.length);
            process(str, 0, str.length(), 1, true, new androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback(str));
        }
    }

    int getEmojiMatch(java.lang.CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    int getEmojiMatch(java.lang.CharSequence charSequence, int i) {
        androidx.emoji2.text.EmojiProcessor.ProcessorSm processorSm = new androidx.emoji2.text.EmojiProcessor.ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int codePointAt = java.lang.Character.codePointAt(charSequence, i2);
            int check = processorSm.check(codePointAt);
            androidx.emoji2.text.TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (check == 1) {
                i2 += java.lang.Character.charCount(codePointAt);
                i4 = 0;
            } else if (check == 2) {
                i2 += java.lang.Character.charCount(codePointAt);
            } else if (check == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i) {
                    i3++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i) {
            return i4 == 0 ? 0 : 2;
        }
        return 1;
    }

    int getEmojiStart(java.lang.CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            androidx.emoji2.text.EmojiSpan[] emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) spanned.getSpans(i, i + 1, androidx.emoji2.text.EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback) process(charSequence, java.lang.Math.max(0, i - 16), java.lang.Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback(i))).start;
    }

    int getEmojiEnd(java.lang.CharSequence charSequence, int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            androidx.emoji2.text.EmojiSpan[] emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) spanned.getSpans(i, i + 1, androidx.emoji2.text.EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback) process(charSequence, java.lang.Math.max(0, i - 16), java.lang.Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback(i))).end;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        ((androidx.emoji2.text.SpannableBuilder) r10).endBatchEdit();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:49:0x000c, B:52:0x0011, B:54:0x0015, B:56:0x0024, B:8:0x0037, B:10:0x0041, B:12:0x0044, B:14:0x0048, B:16:0x0054, B:18:0x0057, B:23:0x0066, B:29:0x0074, B:30:0x0082, B:32:0x0095, B:5:0x002c), top: B:48:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:49:0x000c, B:52:0x0011, B:54:0x0015, B:56:0x0024, B:8:0x0037, B:10:0x0041, B:12:0x0044, B:14:0x0048, B:16:0x0054, B:18:0x0057, B:23:0x0066, B:29:0x0074, B:30:0x0082, B:32:0x0095, B:5:0x002c), top: B:48:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    java.lang.CharSequence process(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z) {
        androidx.emoji2.text.UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
        int i4;
        int i5;
        androidx.emoji2.text.UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2;
        androidx.emoji2.text.EmojiSpan[] emojiSpanArr;
        boolean z2 = charSequence instanceof androidx.emoji2.text.SpannableBuilder;
        if (z2) {
            ((androidx.emoji2.text.SpannableBuilder) charSequence).beginBatchEdit();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof android.text.Spannable)) {
                    unprecomputeTextOnModificationSpannable = (!(charSequence instanceof android.text.Spanned) || ((android.text.Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, androidx.emoji2.text.EmojiSpan.class) > i2) ? null : new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable(charSequence);
                    if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(i, i2, androidx.emoji2.text.EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                        for (androidx.emoji2.text.EmojiSpan emojiSpan : emojiSpanArr) {
                            int spanStart = unprecomputeTextOnModificationSpannable.getSpanStart(emojiSpan);
                            int spanEnd = unprecomputeTextOnModificationSpannable.getSpanEnd(emojiSpan);
                            if (spanStart != i2) {
                                unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                            }
                            i = java.lang.Math.min(spanStart, i);
                            i2 = java.lang.Math.max(spanEnd, i2);
                        }
                    }
                    i4 = i;
                    i5 = i2;
                    if (i4 != i5 && i4 < charSequence.length()) {
                        if (i3 != Integer.MAX_VALUE && unprecomputeTextOnModificationSpannable != null) {
                            i3 -= ((androidx.emoji2.text.EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), androidx.emoji2.text.EmojiSpan.class)).length;
                        }
                        unprecomputeTextOnModificationSpannable2 = (androidx.emoji2.text.UnprecomputeTextOnModificationSpannable) process(charSequence, i4, i5, i3, z, new androidx.emoji2.text.EmojiProcessor.EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, this.mSpanFactory));
                        if (unprecomputeTextOnModificationSpannable2 == null) {
                            return unprecomputeTextOnModificationSpannable2.getUnwrappedSpannable();
                        }
                        if (z2) {
                            ((androidx.emoji2.text.SpannableBuilder) charSequence).endBatchEdit();
                        }
                        return charSequence;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((androidx.emoji2.text.SpannableBuilder) charSequence).endBatchEdit();
                }
            }
        }
        unprecomputeTextOnModificationSpannable = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable((android.text.Spannable) charSequence);
        if (unprecomputeTextOnModificationSpannable != null) {
            while (r5 < r4) {
            }
        }
        i4 = i;
        i5 = i2;
        if (i4 != i5) {
            if (i3 != Integer.MAX_VALUE) {
                i3 -= ((androidx.emoji2.text.EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), androidx.emoji2.text.EmojiSpan.class)).length;
            }
            unprecomputeTextOnModificationSpannable2 = (androidx.emoji2.text.UnprecomputeTextOnModificationSpannable) process(charSequence, i4, i5, i3, z, new androidx.emoji2.text.EmojiProcessor.EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, this.mSpanFactory));
            if (unprecomputeTextOnModificationSpannable2 == null) {
            }
        }
        return charSequence;
    }

    private <T> T process(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z, androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<T> emojiProcessCallback) {
        int i4;
        androidx.emoji2.text.EmojiProcessor.ProcessorSm processorSm = new androidx.emoji2.text.EmojiProcessor.ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int codePointAt = java.lang.Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        loop0: while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int check = processorSm.check(codePointAt);
                if (check == 1) {
                    i4 += java.lang.Character.charCount(java.lang.Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = java.lang.Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                } else if (check == 2) {
                    i += java.lang.Character.charCount(codePointAt);
                    if (i < i2) {
                        codePointAt = java.lang.Character.codePointAt(charSequence, i);
                    }
                } else if (check == 3) {
                    if (z || !hasGlyph(charSequence, i4, i, processorSm.getFlushMetadata())) {
                        i5++;
                        z2 = emojiProcessCallback.handleEmoji(charSequence, i4, i, processorSm.getFlushMetadata());
                    }
                }
            }
        }
        if (processorSm.isInFlushableState() && i5 < i3 && z2 && (z || !hasGlyph(charSequence, i4, i, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, i4, i, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }

    static boolean handleOnKeyDown(android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        boolean delete;
        if (i != 67) {
            if (i == 112) {
                delete = delete(editable, keyEvent, true);
            }
            return false;
        }
        delete = delete(editable, keyEvent, false);
        if (delete) {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private static boolean delete(android.text.Editable editable, android.view.KeyEvent keyEvent, boolean z) {
        androidx.emoji2.text.EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (androidx.emoji2.text.EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = android.text.Selection.getSelectionStart(editable);
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexBackward(editable, selectionStart, java.lang.Math.max(i, 0));
                min = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.findIndexForward(editable, selectionEnd, java.lang.Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = java.lang.Math.max(selectionStart - i, 0);
                min = java.lang.Math.min(selectionEnd + i2, editable.length());
            }
            androidx.emoji2.text.EmojiSpan[] emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) editable.getSpans(max, min, androidx.emoji2.text.EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (androidx.emoji2.text.EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    max = java.lang.Math.min(spanStart, max);
                    min = java.lang.Math.max(spanEnd, min);
                }
                int max2 = java.lang.Math.max(max, 0);
                int min2 = java.lang.Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    private static boolean hasModifiers(android.view.KeyEvent keyEvent) {
        return !android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private boolean hasGlyph(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i, i2, typefaceEmojiRasterizer.getSdkAdded()));
        }
        return typefaceEmojiRasterizer.getHasGlyph() == 2;
    }

    static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private androidx.emoji2.text.MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private androidx.emoji2.text.MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final androidx.emoji2.text.MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        private static boolean isEmojiStyle(int i) {
            return i == 65039;
        }

        private static boolean isTextStyle(int i) {
            return i == 65038;
        }

        ProcessorSm(androidx.emoji2.text.MetadataRepo.Node node, boolean z, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        int check(int i) {
            androidx.emoji2.text.MetadataRepo.Node node = this.mCurrentNode.get(i);
            int i2 = 2;
            if (this.mState != 2) {
                if (node == null) {
                    i2 = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i)) {
                i2 = reset();
            } else if (!isEmojiStyle(i)) {
                if (this.mCurrentNode.getData() != null) {
                    i2 = 3;
                    if (this.mCurrentDepth == 1) {
                        if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                            this.mFlushNode = this.mCurrentNode;
                            reset();
                        } else {
                            i2 = reset();
                        }
                    } else {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    }
                } else {
                    i2 = reset();
                }
            }
            this.mLastCodepoint = i;
            return i2;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        androidx.emoji2.text.TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        androidx.emoji2.text.TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        boolean isInFlushableState() {
            return this.mState == 2 && this.mCurrentNode.getData() != null && (this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint());
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (java.util.Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        static int findIndexBackward(java.lang.CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!java.lang.Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!java.lang.Character.isSurrogate(charAt)) {
                        i2--;
                    } else {
                        if (java.lang.Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z = true;
                    }
                }
                return i;
            }
        }

        static int findIndexForward(java.lang.CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!java.lang.Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!java.lang.Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else {
                        if (java.lang.Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    private static class EmojiProcessAddSpanCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.UnprecomputeTextOnModificationSpannable> {
        private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
        public androidx.emoji2.text.UnprecomputeTextOnModificationSpannable spannable;

        EmojiProcessAddSpanCallback(androidx.emoji2.text.UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, androidx.emoji2.text.EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            android.text.Spannable spannableString;
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                if (charSequence instanceof android.text.Spannable) {
                    spannableString = (android.text.Spannable) charSequence;
                } else {
                    spannableString = new android.text.SpannableString(charSequence);
                }
                this.spannable = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable(spannableString);
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i, i2, 33);
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public androidx.emoji2.text.UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }
    }

    private static class EmojiProcessLookupCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback getResult() {
            return this;
        }

        EmojiProcessLookupCallback(int i) {
            this.mOffset = i;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i3 = this.mOffset;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.start = i;
            this.end = i2;
            return false;
        }
    }

    private static class MarkExclusionCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback> {
        private final java.lang.String mExclusion;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback getResult() {
            return this;
        }

        MarkExclusionCallback(java.lang.String str) {
            this.mExclusion = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!android.text.TextUtils.equals(charSequence.subSequence(i, i2), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }
}
