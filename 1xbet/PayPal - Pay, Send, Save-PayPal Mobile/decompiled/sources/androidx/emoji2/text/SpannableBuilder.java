package androidx.emoji2.text;

/* loaded from: classes3.dex */
public final class SpannableBuilder extends android.text.SpannableStringBuilder {
    private final java.util.List<androidx.emoji2.text.SpannableBuilder.WatcherWrapper> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Class<?> getHighSpeedVideoFpsRanges;

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ android.text.Editable append(char c) {
        return append(c);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ android.text.Editable append(java.lang.CharSequence charSequence) {
        return append(charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ android.text.Editable append(java.lang.CharSequence charSequence, int i, int i2) {
        return append(charSequence, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(char c) throws java.io.IOException {
        return append(c);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence) throws java.io.IOException {
        return append(charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence charSequence, int i, int i2) throws java.io.IOException {
        return append(charSequence, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable delete(int i, int i2) {
        return delete(i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable insert(int i, java.lang.CharSequence charSequence) {
        return insert(i, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable insert(int i, java.lang.CharSequence charSequence, int i2, int i3) {
        return insert(i, charSequence, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int i, int i2, java.lang.CharSequence charSequence) {
        return replace(i, i2, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ android.text.Editable replace(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4) {
        return replace(i, i2, charSequence, i3, i4);
    }

    private SpannableBuilder(java.lang.Class<?> cls, java.lang.CharSequence charSequence) {
        super(charSequence);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        androidx.core.util.Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.getHighSpeedVideoFpsRanges = cls;
    }

    private SpannableBuilder(java.lang.Class<?> cls, java.lang.CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        androidx.core.util.Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.getHighSpeedVideoFpsRanges = cls;
    }

    public static androidx.emoji2.text.SpannableBuilder create(java.lang.Class<?> cls, java.lang.CharSequence charSequence) {
        return new androidx.emoji2.text.SpannableBuilder(cls, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return new androidx.emoji2.text.SpannableBuilder(this.getHighSpeedVideoFpsRanges, this, i, i2);
    }

    private androidx.emoji2.text.SpannableBuilder.WatcherWrapper getHighSpeedVideoSizes(java.lang.Object obj) {
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherWrapper = this.getHighResolutionOutputSizeshNQ4ISI.get(i);
            if (watcherWrapper.Camera2StreamConfigurationMap == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    public final void beginBatchEdit() {
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void endBatchEdit() {
        Camera2StreamConfigurationMap();
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            this.getHighResolutionOutputSizeshNQ4ISI.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            this.getHighResolutionOutputSizeshNQ4ISI.get(i).getHighSpeedVideoFpsRangesFor.incrementAndGet();
        }
    }

    private void Camera2StreamConfigurationMap() {
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            this.getHighResolutionOutputSizeshNQ4ISI.get(i).getHighSpeedVideoFpsRangesFor.decrementAndGet();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence) {
        getHighResolutionOutputSizeshNQ4ISI();
        super.replace(i, i2, charSequence);
        Camera2StreamConfigurationMap();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4) {
        getHighResolutionOutputSizeshNQ4ISI();
        super.replace(i, i2, charSequence, i3, i4);
        Camera2StreamConfigurationMap();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int i, java.lang.CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder insert(int i, java.lang.CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final android.text.SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, java.lang.Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    static class WatcherWrapper implements android.text.TextWatcher, android.text.SpanWatcher {
        final java.lang.Object Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger(0);

        WatcherWrapper(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = obj;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            ((android.text.TextWatcher) this.Camera2StreamConfigurationMap).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            ((android.text.TextWatcher) this.Camera2StreamConfigurationMap).onTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            ((android.text.TextWatcher) this.Camera2StreamConfigurationMap).afterTextChanged(editable);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
            if (this.getHighSpeedVideoFpsRangesFor.get() <= 0 || !(obj instanceof androidx.emoji2.text.EmojiSpan)) {
                ((android.text.SpanWatcher) this.Camera2StreamConfigurationMap).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
            if (this.getHighSpeedVideoFpsRangesFor.get() <= 0 || !(obj instanceof androidx.emoji2.text.EmojiSpan)) {
                ((android.text.SpanWatcher) this.Camera2StreamConfigurationMap).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.getHighSpeedVideoFpsRangesFor.get() <= 0 || !(obj instanceof androidx.emoji2.text.EmojiSpan)) {
                if (android.os.Build.VERSION.SDK_INT < 28) {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                        ((android.text.SpanWatcher) this.Camera2StreamConfigurationMap).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                    }
                }
                i5 = i;
                i6 = i3;
                ((android.text.SpanWatcher) this.Camera2StreamConfigurationMap).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(java.lang.Object obj) {
        androidx.emoji2.text.SpannableBuilder.WatcherWrapper highSpeedVideoSizes;
        if (obj != null) {
            if (this.getHighSpeedVideoFpsRanges == obj.getClass() && (highSpeedVideoSizes = getHighSpeedVideoSizes(obj)) != null) {
                obj = highSpeedVideoSizes;
            }
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(java.lang.Object obj) {
        androidx.emoji2.text.SpannableBuilder.WatcherWrapper highSpeedVideoSizes;
        if (obj != null) {
            if (this.getHighSpeedVideoFpsRanges == obj.getClass() && (highSpeedVideoSizes = getHighSpeedVideoSizes(obj)) != null) {
                obj = highSpeedVideoSizes;
            }
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(java.lang.Object obj) {
        androidx.emoji2.text.SpannableBuilder.WatcherWrapper highSpeedVideoSizes;
        if (obj != null) {
            if (this.getHighSpeedVideoFpsRanges == obj.getClass() && (highSpeedVideoSizes = getHighSpeedVideoSizes(obj)) != null) {
                obj = highSpeedVideoSizes;
            }
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, java.lang.Class<T> cls) {
        if (this.getHighSpeedVideoFpsRanges == cls) {
            androidx.emoji2.text.SpannableBuilder.WatcherWrapper[] watcherWrapperArr = (androidx.emoji2.text.SpannableBuilder.WatcherWrapper[]) super.getSpans(i, i2, androidx.emoji2.text.SpannableBuilder.WatcherWrapper.class);
            T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, watcherWrapperArr.length));
            for (int i3 = 0; i3 < watcherWrapperArr.length; i3++) {
                tArr[i3] = watcherWrapperArr[i3].Camera2StreamConfigurationMap;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        if (cls == null || this.getHighSpeedVideoFpsRanges == cls) {
            cls = androidx.emoji2.text.SpannableBuilder.WatcherWrapper.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void removeSpan(java.lang.Object obj) {
        androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherWrapper;
        if (obj != null) {
            if (this.getHighSpeedVideoFpsRanges == obj.getClass()) {
                watcherWrapper = getHighSpeedVideoSizes(obj);
                if (watcherWrapper != null) {
                    obj = watcherWrapper;
                }
                super.removeSpan(obj);
                if (watcherWrapper == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.remove(watcherWrapper);
                    return;
                }
                return;
            }
        }
        watcherWrapper = null;
        super.removeSpan(obj);
        if (watcherWrapper == null) {
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        if (obj != null) {
            if (this.getHighSpeedVideoFpsRanges == obj.getClass()) {
                androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherWrapper = new androidx.emoji2.text.SpannableBuilder.WatcherWrapper(obj);
                this.getHighResolutionOutputSizeshNQ4ISI.add(watcherWrapper);
                obj = watcherWrapper;
            }
        }
        super.setSpan(obj, i, i2, i3);
    }
}
