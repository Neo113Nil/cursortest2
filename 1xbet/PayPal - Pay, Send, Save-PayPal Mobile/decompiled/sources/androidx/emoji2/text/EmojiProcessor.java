package androidx.emoji2.text;

/* loaded from: classes3.dex */
final class EmojiProcessor {
    private final androidx.emoji2.text.EmojiCompat.SpanFactory Camera2StreamConfigurationMap;
    private final int[] getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    final androidx.emoji2.text.MetadataRepo getHighSpeedVideoFpsRangesFor;
    private androidx.emoji2.text.EmojiCompat.GlyphChecker getHighSpeedVideoSizes;

    /* loaded from: classes7.dex */
    interface EmojiProcessCallback<T> {
        boolean getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer);

        T getHighSpeedVideoFpsRangesFor();
    }

    EmojiProcessor(androidx.emoji2.text.MetadataRepo metadataRepo, androidx.emoji2.text.EmojiCompat.SpanFactory spanFactory, androidx.emoji2.text.EmojiCompat.GlyphChecker glyphChecker, boolean z, int[] iArr, java.util.Set<int[]> set) {
        this.Camera2StreamConfigurationMap = spanFactory;
        this.getHighSpeedVideoFpsRangesFor = metadataRepo;
        this.getHighSpeedVideoSizes = glyphChecker;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = iArr;
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr2 : set) {
            java.lang.String str = new java.lang.String(iArr2, 0, iArr2.length);
            getHighResolutionOutputSizeshNQ4ISI(str, 0, str.length(), 1, true, new androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback(str));
        }
    }

    final int Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i) {
        androidx.emoji2.text.EmojiProcessor.ProcessorSm processorSm = new androidx.emoji2.text.EmojiProcessor.ProcessorSm(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int codePointAt = java.lang.Character.codePointAt(charSequence, i2);
            int highSpeedVideoFpsRangesFor = processorSm.getHighSpeedVideoFpsRangesFor(codePointAt);
            androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer = processorSm.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            if (highSpeedVideoFpsRangesFor == 1) {
                i2 += java.lang.Character.charCount(codePointAt);
                i4 = 0;
            } else if (highSpeedVideoFpsRangesFor == 2) {
                i2 += java.lang.Character.charCount(codePointAt);
            } else if (highSpeedVideoFpsRangesFor == 3) {
                typefaceEmojiRasterizer = processorSm.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
                if (typefaceEmojiRasterizer.getCompatAdded() <= i) {
                    i3++;
                }
            }
            if (typefaceEmojiRasterizer != null && typefaceEmojiRasterizer.getCompatAdded() <= i) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (!processorSm.getHighSpeedVideoFpsRangesFor() || processorSm.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.getCompatAdded() > i) {
            return i4 == 0 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        ((androidx.emoji2.text.SpannableBuilder) r10).endBatchEdit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        if (r0 == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.lang.CharSequence getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z) {
        androidx.emoji2.text.UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
        androidx.emoji2.text.EmojiSpan[] emojiSpanArr;
        boolean z2 = charSequence instanceof androidx.emoji2.text.SpannableBuilder;
        if (z2) {
            ((androidx.emoji2.text.SpannableBuilder) charSequence).beginBatchEdit();
        }
        try {
            if (z2 || (charSequence instanceof android.text.Spannable)) {
                unprecomputeTextOnModificationSpannable = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable((android.text.Spannable) charSequence);
            } else {
                unprecomputeTextOnModificationSpannable = (!(charSequence instanceof android.text.Spanned) || ((android.text.Spanned) charSequence).nextSpanTransition(i + (-1), i2 + 1, androidx.emoji2.text.EmojiSpan.class) > i2) ? null : new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable(charSequence);
            }
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
            int i4 = i;
            int i5 = i2;
            if (i4 != i5 && i4 < charSequence.length()) {
                if (i3 != Integer.MAX_VALUE && unprecomputeTextOnModificationSpannable != null) {
                    i3 -= ((androidx.emoji2.text.EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), androidx.emoji2.text.EmojiSpan.class)).length;
                }
                androidx.emoji2.text.UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = (androidx.emoji2.text.UnprecomputeTextOnModificationSpannable) getHighResolutionOutputSizeshNQ4ISI(charSequence, i4, i5, i3, z, new androidx.emoji2.text.EmojiProcessor.EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, this.Camera2StreamConfigurationMap));
                if (unprecomputeTextOnModificationSpannable2 != null) {
                    android.text.Spannable spannable = unprecomputeTextOnModificationSpannable2.Camera2StreamConfigurationMap;
                    if (z2) {
                        ((androidx.emoji2.text.SpannableBuilder) charSequence).endBatchEdit();
                    }
                    return spannable;
                }
            }
        } catch (java.lang.Throwable th) {
            if (z2) {
                ((androidx.emoji2.text.SpannableBuilder) charSequence).endBatchEdit();
            }
            throw th;
        }
    }

    final <T> T getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z, androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<T> emojiProcessCallback) {
        int i4;
        androidx.emoji2.text.EmojiProcessor.ProcessorSm processorSm = new androidx.emoji2.text.EmojiProcessor.ProcessorSm(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        int codePointAt = java.lang.Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        loop0: while (true) {
            int i6 = codePointAt;
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int highSpeedVideoFpsRangesFor = processorSm.getHighSpeedVideoFpsRangesFor(i6);
                if (highSpeedVideoFpsRangesFor == 1) {
                    i4 += java.lang.Character.charCount(java.lang.Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        i6 = java.lang.Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                } else if (highSpeedVideoFpsRangesFor == 2) {
                    i += java.lang.Character.charCount(i6);
                    if (i < i2) {
                        i6 = java.lang.Character.codePointAt(charSequence, i);
                    }
                } else if (highSpeedVideoFpsRangesFor == 3) {
                    if (z || !getHighSpeedVideoFpsRanges(charSequence, i4, i, processorSm.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges)) {
                        z2 = emojiProcessCallback.getHighSpeedVideoFpsRanges(charSequence, i4, i, processorSm.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges);
                        i5++;
                    }
                    codePointAt = i6;
                }
            }
        }
        if (processorSm.getHighSpeedVideoFpsRangesFor() && i5 < i3 && z2 && (z || !getHighSpeedVideoFpsRanges(charSequence, i4, i, processorSm.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges))) {
            emojiProcessCallback.getHighSpeedVideoFpsRanges(charSequence, i4, i, processorSm.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges);
        }
        return emojiProcessCallback.getHighSpeedVideoFpsRangesFor();
    }

    static boolean getHighSpeedVideoSizes(android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        boolean highSpeedVideoFpsRanges;
        if (i != 67) {
            if (i == 112) {
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(editable, keyEvent, true);
            }
            return false;
        }
        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(editable, keyEvent, false);
        if (highSpeedVideoFpsRanges) {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    static boolean getHighSpeedVideoSizes(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = android.text.Selection.getSelectionStart(editable);
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    max = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.getHighResolutionOutputSizeshNQ4ISI(editable, selectionStart, java.lang.Math.max(i, 0));
                    min = androidx.emoji2.text.EmojiProcessor.CodepointIndexFinder.Camera2StreamConfigurationMap(editable, selectionEnd, java.lang.Math.max(i2, 0));
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
        }
        return false;
    }

    private boolean getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.getHighSpeedVideoSizes.hasGlyph(charSequence, i, i2, typefaceEmojiRasterizer.getSdkAdded()));
        }
        return typefaceEmojiRasterizer.getHasGlyph() == 2;
    }

    /* loaded from: classes7.dex */
    static final class ProcessorSm {
        private int Camera2StreamConfigurationMap;
        private final int[] getHighResolutionOutputSizeshNQ4ISI;
        androidx.emoji2.text.MetadataRepo.Node getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        androidx.emoji2.text.MetadataRepo.Node getHighSpeedVideoSizes;
        private final androidx.emoji2.text.MetadataRepo.Node getInputFormats;
        private int getInputSizeshNQ4ISI = 1;
        private final boolean getOutputFormats;

        ProcessorSm(androidx.emoji2.text.MetadataRepo.Node node, boolean z, int[] iArr) {
            this.getInputFormats = node;
            this.getHighSpeedVideoSizes = node;
            this.getOutputFormats = z;
            this.getHighResolutionOutputSizeshNQ4ISI = iArr;
        }

        final int getHighSpeedVideoFpsRangesFor(int i) {
            android.util.SparseArray<androidx.emoji2.text.MetadataRepo.Node> sparseArray = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            androidx.emoji2.text.MetadataRepo.Node node = sparseArray == null ? null : sparseArray.get(i);
            int i2 = 2;
            if (this.getInputSizeshNQ4ISI == 2) {
                if (node != null) {
                    this.getHighSpeedVideoSizes = node;
                    this.getHighSpeedVideoFpsRangesFor++;
                } else {
                    if (i != 65038) {
                        if (i != 65039) {
                            if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges != null) {
                                if (this.getHighSpeedVideoFpsRangesFor == 1) {
                                    if (Camera2StreamConfigurationMap()) {
                                        this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
                                        this.getInputSizeshNQ4ISI = 1;
                                        this.getHighSpeedVideoSizes = this.getInputFormats;
                                        this.getHighSpeedVideoFpsRangesFor = 0;
                                    } else {
                                        this.getInputSizeshNQ4ISI = 1;
                                        this.getHighSpeedVideoSizes = this.getInputFormats;
                                        this.getHighSpeedVideoFpsRangesFor = 0;
                                    }
                                } else {
                                    this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
                                    this.getInputSizeshNQ4ISI = 1;
                                    this.getHighSpeedVideoSizes = this.getInputFormats;
                                    this.getHighSpeedVideoFpsRangesFor = 0;
                                }
                                i2 = 3;
                            }
                        }
                    }
                    this.getInputSizeshNQ4ISI = 1;
                    this.getHighSpeedVideoSizes = this.getInputFormats;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                }
                this.Camera2StreamConfigurationMap = i;
                return i2;
            }
            if (node != null) {
                this.getInputSizeshNQ4ISI = 2;
                this.getHighSpeedVideoSizes = node;
                this.getHighSpeedVideoFpsRangesFor = 1;
                this.Camera2StreamConfigurationMap = i;
                return i2;
            }
            this.getInputSizeshNQ4ISI = 1;
            this.getHighSpeedVideoSizes = this.getInputFormats;
            this.getHighSpeedVideoFpsRangesFor = 0;
            i2 = 1;
            this.Camera2StreamConfigurationMap = i;
            return i2;
        }

        final boolean getHighSpeedVideoFpsRangesFor() {
            if (this.getInputSizeshNQ4ISI != 2 || this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges == null) {
                return false;
            }
            return this.getHighSpeedVideoFpsRangesFor > 1 || Camera2StreamConfigurationMap();
        }

        private boolean Camera2StreamConfigurationMap() {
            if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.isDefaultEmoji() || this.Camera2StreamConfigurationMap == 65039) {
                return true;
            }
            if (this.getOutputFormats) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    return true;
                }
                if (java.util.Arrays.binarySearch(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    static final class CodepointIndexFinder {
        private CodepointIndexFinder() {
        }

        static int getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence, int i, int i2) {
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

        static int Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i, int i2) {
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

    /* loaded from: classes7.dex */
    static class EmojiProcessAddSpanCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.UnprecomputeTextOnModificationSpannable> {
        public androidx.emoji2.text.UnprecomputeTextOnModificationSpannable getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.emoji2.text.EmojiCompat.SpanFactory getHighSpeedVideoFpsRangesFor;

        EmojiProcessAddSpanCallback(androidx.emoji2.text.UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, androidx.emoji2.text.EmojiCompat.SpanFactory spanFactory) {
            this.getHighResolutionOutputSizeshNQ4ISI = unprecomputeTextOnModificationSpannable;
            this.getHighSpeedVideoFpsRangesFor = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            android.text.Spannable spannableString;
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                if (charSequence instanceof android.text.Spannable) {
                    spannableString = (android.text.Spannable) charSequence;
                } else {
                    spannableString = new android.text.SpannableString(charSequence);
                }
                this.getHighResolutionOutputSizeshNQ4ISI = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable(spannableString);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setSpan(this.getHighSpeedVideoFpsRangesFor.createSpan(typefaceEmojiRasterizer), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final /* bridge */ /* synthetic */ androidx.emoji2.text.UnprecomputeTextOnModificationSpannable getHighSpeedVideoFpsRangesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* loaded from: classes7.dex */
    static class EmojiProcessLookupCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback> {
        private final int getHighSpeedVideoFpsRangesFor;
        public int getHighSpeedVideoSizes = -1;
        public int getHighResolutionOutputSizeshNQ4ISI = -1;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final /* bridge */ /* synthetic */ androidx.emoji2.text.EmojiProcessor.EmojiProcessLookupCallback getHighSpeedVideoFpsRangesFor() {
            return this;
        }

        EmojiProcessLookupCallback(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i3 = this.getHighSpeedVideoFpsRangesFor;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            return false;
        }
    }

    /* loaded from: classes7.dex */
    static class MarkExclusionCallback implements androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback<androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback> {
        private final java.lang.String Camera2StreamConfigurationMap;

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final /* bridge */ /* synthetic */ androidx.emoji2.text.EmojiProcessor.MarkExclusionCallback getHighSpeedVideoFpsRangesFor() {
            return this;
        }

        MarkExclusionCallback(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i, int i2, androidx.emoji2.text.TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!android.text.TextUtils.equals(charSequence.subSequence(i, i2), this.Camera2StreamConfigurationMap)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(android.text.Editable editable, android.view.KeyEvent keyEvent, boolean z) {
        androidx.emoji2.text.EmojiSpan[] emojiSpanArr;
        if (!android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (emojiSpanArr = (androidx.emoji2.text.EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
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
}
