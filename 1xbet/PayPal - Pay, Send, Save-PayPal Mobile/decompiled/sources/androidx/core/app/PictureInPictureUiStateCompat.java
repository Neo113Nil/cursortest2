package androidx.core.app;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u0003\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\u0004\u0010\b"}, d2 = {"Landroidx/core/app/PictureInPictureUiStateCompat;", "", "", "isStashed", "isTransitioningToPip", "<init>", "(ZZ)V", "Z", "()Z", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PictureInPictureUiStateCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.core.app.PictureInPictureUiStateCompat.Companion INSTANCE = new androidx.core.app.PictureInPictureUiStateCompat.Companion(null);
    private final boolean isStashed;
    private final boolean isTransitioningToPip;

    public PictureInPictureUiStateCompat(boolean z, boolean z2) {
        this.isStashed = z;
        this.isTransitioningToPip = z2;
    }

    /* renamed from: isStashed, reason: from getter */
    public final boolean getIsStashed() {
        return this.isStashed;
    }

    /* renamed from: isTransitioningToPip, reason: from getter */
    public final boolean getIsTransitioningToPip() {
        return this.isTransitioningToPip;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/core/app/PictureInPictureUiStateCompat$Companion;", "", "<init>", "()V", "Landroid/app/PictureInPictureUiState;", "uiState", "Landroidx/core/app/PictureInPictureUiStateCompat;", "fromPictureInPictureUiState", "(Landroid/app/PictureInPictureUiState;)Landroidx/core/app/PictureInPictureUiStateCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.core.app.PictureInPictureUiStateCompat fromPictureInPictureUiState(android.app.PictureInPictureUiState uiState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiState, "");
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                return new androidx.core.app.PictureInPictureUiStateCompat(uiState.isStashed(), uiState.isTransitioningToPip());
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                return new androidx.core.app.PictureInPictureUiStateCompat(uiState.isStashed(), false);
            }
            return new androidx.core.app.PictureInPictureUiStateCompat(false, false);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.core.app.PictureInPictureUiStateCompat fromPictureInPictureUiState(android.app.PictureInPictureUiState pictureInPictureUiState) {
        return INSTANCE.fromPictureInPictureUiState(pictureInPictureUiState);
    }
}
