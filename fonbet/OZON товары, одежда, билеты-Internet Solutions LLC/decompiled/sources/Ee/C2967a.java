package Ee;

import De.C2867j;
import Sc.r;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;

/* renamed from: Ee.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2967a {
    public static final void a(@NotNull d dVar, @NotNull AbstractC10711a abstractC10711a) {
        try {
            d b11 = Wc.b.b(dVar);
            r.Companion companion = r.INSTANCE;
            C2867j.b(Unit.f71690a, b11);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            abstractC10711a.resumeWith(s.a(th2));
            throw th2;
        }
    }

    public static final void b(@NotNull Function2 function2, AbstractC10711a abstractC10711a, @NotNull AbstractC10711a abstractC10711a2) {
        try {
            d b11 = Wc.b.b(Wc.b.a(abstractC10711a, abstractC10711a2, function2));
            r.Companion companion = r.INSTANCE;
            C2867j.b(Unit.f71690a, b11);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            abstractC10711a2.resumeWith(s.a(th2));
            throw th2;
        }
    }
}
