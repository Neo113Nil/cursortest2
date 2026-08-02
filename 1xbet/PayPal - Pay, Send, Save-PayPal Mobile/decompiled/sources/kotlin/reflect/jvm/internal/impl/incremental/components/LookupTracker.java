package kotlin.reflect.jvm.internal.impl.incremental.components;

/* loaded from: classes5.dex */
public interface LookupTracker {
    boolean getRequiresPosition();

    void record(java.lang.String str, kotlin.reflect.jvm.internal.impl.incremental.components.Position position, java.lang.String str2, kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind scopeKind, java.lang.String str3);

    public static final class DO_NOTHING implements kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker {
        public static final kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING INSTANCE = new kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker.DO_NOTHING();

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public final boolean getRequiresPosition() {
            return false;
        }

        private DO_NOTHING() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public final void record(java.lang.String str, kotlin.reflect.jvm.internal.impl.incremental.components.Position position, java.lang.String str2, kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind scopeKind, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeKind, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        }
    }
}
