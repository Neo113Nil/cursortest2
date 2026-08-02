package dagger.internal;

/* loaded from: classes17.dex */
public final class MembersInjectors {
    public static <T> dagger.MembersInjector<T> noOp() {
        return dagger.internal.MembersInjectors.NoOpMembersInjector.INSTANCE;
    }

    enum NoOpMembersInjector implements dagger.MembersInjector<java.lang.Object> {
        INSTANCE;

        @Override // dagger.MembersInjector
        public final void injectMembers(java.lang.Object obj) {
            dagger.internal.Preconditions.checkNotNull(obj, "Cannot inject members into a null reference");
        }
    }

    private MembersInjectors() {
    }
}
