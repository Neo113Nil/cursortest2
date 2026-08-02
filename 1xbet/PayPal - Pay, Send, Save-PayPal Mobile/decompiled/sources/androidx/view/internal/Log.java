package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/internal/Log;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Log {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.internal.Log.Companion INSTANCE = new androidx.view.internal.Log.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/navigation/internal/Log$Companion;", "", "<init>", "()V", "", "tag", "message", "", "i", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final void i(java.lang.String tag, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
