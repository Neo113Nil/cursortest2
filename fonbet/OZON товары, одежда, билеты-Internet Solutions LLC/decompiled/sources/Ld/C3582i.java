package Ld;

import Ld.AbstractC3579f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ld.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3582i<A, C> extends AbstractC3579f.a<A> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final HashMap f16770a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap f16771b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final HashMap f16772c;

    public C3582i(@NotNull HashMap memberAnnotations, @NotNull HashMap propertyConstants, @NotNull HashMap annotationParametersDefaultValues) {
        Intrinsics.checkNotNullParameter(memberAnnotations, "memberAnnotations");
        Intrinsics.checkNotNullParameter(propertyConstants, "propertyConstants");
        Intrinsics.checkNotNullParameter(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f16770a = memberAnnotations;
        this.f16771b = propertyConstants;
        this.f16772c = annotationParametersDefaultValues;
    }

    @NotNull
    public final Map<B, C> a() {
        return this.f16772c;
    }

    @NotNull
    public final Map<B, List<A>> b() {
        return this.f16770a;
    }

    @NotNull
    public final Map<B, C> c() {
        return this.f16771b;
    }
}
