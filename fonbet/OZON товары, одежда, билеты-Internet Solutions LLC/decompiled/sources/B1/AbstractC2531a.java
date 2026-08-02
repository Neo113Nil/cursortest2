package B1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2531a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7735q f2091a;

    private AbstractC2531a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2531a(Function2 function2) {
        this.f2091a = (C7735q) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer>, kotlin.jvm.internal.q] */
    @NotNull
    public final Function2<Integer, Integer, Integer> a() {
        return this.f2091a;
    }
}
