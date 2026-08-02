package Q1;

import Ij.C3261b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Q1.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3842k extends AbstractC7737t implements Function1<InterfaceC3841j, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3841j f22894b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3843l f22895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3842k(InterfaceC3841j interfaceC3841j, C3843l c3843l) {
        super(1);
        this.f22894b = interfaceC3841j;
        this.f22895c = c3843l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(InterfaceC3841j interfaceC3841j) {
        String concat;
        InterfaceC3841j interfaceC3841j2 = interfaceC3841j;
        StringBuilder e11 = C3261b.e(this.f22894b == interfaceC3841j2 ? " > " : "   ");
        this.f22895c.getClass();
        if (interfaceC3841j2 instanceof C3832a) {
            StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
            C3832a c3832a = (C3832a) interfaceC3841j2;
            sb2.append(c3832a.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(c3832a.b());
            sb2.append(')');
            concat = sb2.toString();
        } else if (interfaceC3841j2 instanceof I) {
            StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
            I i11 = (I) interfaceC3841j2;
            sb3.append(i11.c().length());
            sb3.append(", newCursorPosition=");
            sb3.append(i11.b());
            sb3.append(')');
            concat = sb3.toString();
        } else if (interfaceC3841j2 instanceof H) {
            concat = interfaceC3841j2.toString();
        } else if (interfaceC3841j2 instanceof C3839h) {
            concat = interfaceC3841j2.toString();
        } else if (interfaceC3841j2 instanceof C3840i) {
            concat = interfaceC3841j2.toString();
        } else if (interfaceC3841j2 instanceof J) {
            concat = interfaceC3841j2.toString();
        } else if (interfaceC3841j2 instanceof C3845n) {
            ((C3845n) interfaceC3841j2).getClass();
            concat = "FinishComposingTextCommand()";
        } else if (interfaceC3841j2 instanceof C3838g) {
            ((C3838g) interfaceC3841j2).getClass();
            concat = "DeleteAllCommand()";
        } else {
            String B11 = kotlin.jvm.internal.N.b(interfaceC3841j2.getClass()).B();
            if (B11 == null) {
                B11 = "{anonymous EditCommand}";
            }
            concat = "Unknown EditCommand: ".concat(B11);
        }
        e11.append(concat);
        return e11.toString();
    }
}
