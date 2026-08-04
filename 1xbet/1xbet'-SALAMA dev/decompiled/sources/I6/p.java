package I6;

import A1.W;
import D6.E;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends t6.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f3753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p065i6.i f3755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Function1 function1, Object obj, p065i6.i iVar) {
        super(1);
        this.f3753a = function1;
        this.f3754b = obj;
        this.f3755c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        W wA = a.a(this.f3753a, this.f3754b, null);
        if (wA != null) {
            E.k(this.f3755c, wA);
        }
        return p044f6.i.f13014a;
    }
}
