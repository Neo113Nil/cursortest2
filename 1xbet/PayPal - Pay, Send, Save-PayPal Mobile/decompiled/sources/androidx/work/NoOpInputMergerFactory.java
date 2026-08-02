package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/NoOpInputMergerFactory;", "Landroidx/work/InputMergerFactory;", "<init>", "()V", "", "className", "", "createInputMerger", "(Ljava/lang/String;)Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoOpInputMergerFactory extends androidx.work.InputMergerFactory {
    public static final androidx.work.NoOpInputMergerFactory INSTANCE = new androidx.work.NoOpInputMergerFactory();

    private NoOpInputMergerFactory() {
    }

    @Override // androidx.work.InputMergerFactory
    public final /* bridge */ /* synthetic */ androidx.work.InputMerger createInputMerger(java.lang.String str) {
        return (androidx.work.InputMerger) m9466createInputMerger(str);
    }

    /* renamed from: createInputMerger, reason: collision with other method in class */
    public final java.lang.Void m9466createInputMerger(java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "");
        return null;
    }
}
