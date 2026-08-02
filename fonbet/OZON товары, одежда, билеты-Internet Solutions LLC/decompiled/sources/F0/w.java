package F0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", l = {455}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class w extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f8359d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f8360e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2990k f8361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(C2990k c2990k, kotlin.coroutines.d<? super w> dVar) {
        super(2, dVar);
        this.f8361f = c2990k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        w wVar = new w(this.f8361f, dVar);
        wVar.f8360e = obj;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
        return ((w) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
        /*
            r4 = this;
            Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
            int r1 = r4.f8359d
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f8360e
            x1.c r1 = (x1.InterfaceC10628c) r1
            Sc.s.b(r5)
            goto L2e
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            Sc.s.b(r5)
            java.lang.Object r5 = r4.f8360e
            x1.c r5 = (x1.InterfaceC10628c) r5
            r1 = r5
        L21:
            x1.o r5 = x1.EnumC10640o.Initial
            r4.f8360e = r1
            r4.f8359d = r2
            java.lang.Object r5 = r1.i0(r5, r4)
            if (r5 != r0) goto L2e
            return r0
        L2e:
            x1.m r5 = (x1.C10638m) r5
            boolean r5 = I0.C3176c0.i(r5)
            r5 = r5 ^ r2
            F0.k r3 = r4.f8361f
            r3.b0(r5)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
