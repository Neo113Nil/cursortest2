package p174z5;

import A1.x0;
import A5.m;
import java.util.HashMap;
import p078l.k;
import p150v0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A5.s f18531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f18532b;

    public s(k kVar) {
        x0 x0Var = new x0(this, 25);
        A5.s sVar = new A5.s(kVar, "flutter/textinput", m.f675a, null);
        this.f18531a = sVar;
        sVar.b(x0Var);
    }

    public static HashMap a(String str, int i7, int i8, int i9, int i10) {
        HashMap mapM = p031e1.k.m("text", str);
        a.k(i7, mapM, "selectionBase", i8, "selectionExtent");
        a.k(i9, mapM, "composingBase", i10, "composingExtent");
        return mapM;
    }
}
