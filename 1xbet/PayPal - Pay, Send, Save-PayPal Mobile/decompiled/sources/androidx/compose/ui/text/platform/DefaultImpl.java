package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/platform/DefaultImpl;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "<init>", "()V", "Landroidx/compose/runtime/State;", "", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/runtime/State;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/State;", "getFontLoaded", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultImpl implements androidx.compose.ui.text.platform.EmojiCompatStatusDelegate {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    public DefaultImpl() {
        this.getHighSpeedVideoFpsRangesFor = androidx.emoji2.text.EmojiCompat.isConfigured() ? getHighSpeedVideoFpsRangesFor() : null;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public final androidx.compose.runtime.State<java.lang.Boolean> getFontLoaded() {
        androidx.compose.ui.text.platform.ImmutableBool immutableBool;
        androidx.compose.runtime.State<java.lang.Boolean> state = this.getHighSpeedVideoFpsRangesFor;
        if (state != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(state);
            return state;
        }
        if (!androidx.emoji2.text.EmojiCompat.isConfigured()) {
            immutableBool = androidx.compose.ui.text.platform.EmojiCompatStatus_androidKt.getHighSpeedVideoSizes;
            return immutableBool;
        }
        androidx.compose.runtime.State<java.lang.Boolean> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoFpsRangesFor);
        return highSpeedVideoFpsRangesFor;
    }

    private final androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor() {
        androidx.emoji2.text.EmojiCompat emojiCompat = androidx.emoji2.text.EmojiCompat.get();
        if (emojiCompat.getLoadState() != 1) {
            final androidx.compose.runtime.MutableState mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
            emojiCompat.registerInitCallback(new androidx.emoji2.text.EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public final void onInitialized() {
                    mutableStateOf$default.setValue(java.lang.Boolean.TRUE);
                    this.getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.text.platform.ImmutableBool(true);
                }

                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public final void onFailed(java.lang.Throwable throwable) {
                    androidx.compose.ui.text.platform.ImmutableBool immutableBool;
                    androidx.compose.ui.text.platform.DefaultImpl defaultImpl = this;
                    immutableBool = androidx.compose.ui.text.platform.EmojiCompatStatus_androidKt.getHighSpeedVideoSizes;
                    defaultImpl.getHighSpeedVideoFpsRangesFor = immutableBool;
                }
            });
            return mutableStateOf$default;
        }
        return new androidx.compose.ui.text.platform.ImmutableBool(true);
    }
}
