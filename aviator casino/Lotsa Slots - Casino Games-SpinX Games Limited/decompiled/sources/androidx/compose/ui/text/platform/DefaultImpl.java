package androidx.compose.ui.text.platform;

/* compiled from: EmojiCompatStatus.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/DefaultImpl;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "()V", "fontLoaded", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "loadState", "getFontLoadState", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultImpl implements androidx.compose.ui.text.platform.EmojiCompatStatusDelegate {
    private androidx.compose.runtime.State<java.lang.Boolean> loadState;

    public DefaultImpl() {
        this.loadState = androidx.emoji2.text.EmojiCompat.isConfigured() ? getFontLoadState() : null;
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public androidx.compose.runtime.State<java.lang.Boolean> getFontLoaded() {
        androidx.compose.ui.text.platform.ImmutableBool immutableBool;
        androidx.compose.runtime.State<java.lang.Boolean> state = this.loadState;
        if (state != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(state);
            return state;
        }
        if (!androidx.emoji2.text.EmojiCompat.isConfigured()) {
            immutableBool = androidx.compose.ui.text.platform.EmojiCompatStatus_androidKt.Falsey;
            return immutableBool;
        }
        androidx.compose.runtime.State<java.lang.Boolean> fontLoadState = getFontLoadState();
        this.loadState = fontLoadState;
        kotlin.jvm.internal.Intrinsics.checkNotNull(fontLoadState);
        return fontLoadState;
    }

    private final androidx.compose.runtime.State<java.lang.Boolean> getFontLoadState() {
        androidx.emoji2.text.EmojiCompat emojiCompat = androidx.emoji2.text.EmojiCompat.get();
        if (emojiCompat.getLoadState() != 1) {
            final androidx.compose.runtime.MutableState mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            emojiCompat.registerInitCallback(new androidx.emoji2.text.EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onInitialized() {
                    mutableStateOf$default.setValue(true);
                    this.loadState = new androidx.compose.ui.text.platform.ImmutableBool(true);
                }

                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onFailed(java.lang.Throwable throwable) {
                    androidx.compose.ui.text.platform.ImmutableBool immutableBool;
                    androidx.compose.ui.text.platform.DefaultImpl defaultImpl = this;
                    immutableBool = androidx.compose.ui.text.platform.EmojiCompatStatus_androidKt.Falsey;
                    defaultImpl.loadState = immutableBool;
                }
            });
            return mutableStateOf$default;
        }
        return new androidx.compose.ui.text.platform.ImmutableBool(true);
    }
}
