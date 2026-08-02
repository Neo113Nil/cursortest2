package o1;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492b extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1492b(String str, int i7) {
        super(str);
        this.f15547a = i7;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i7 = this.f15547a;
        synchronized (this) {
            switch (i7) {
            }
            return this;
        }
    }
}
