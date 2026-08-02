package Cd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9857w;

/* renamed from: Cd.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2747h extends Q {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f4757m = 0;

    public static final InterfaceC9857w i(@NotNull InterfaceC9857w functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        Sd.f name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (j(name)) {
            return (InterfaceC9857w) Zd.e.b(functionDescriptor, C2745f.f4755a);
        }
        return null;
    }

    public static boolean j(@NotNull Sd.f fVar) {
        Set set;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        set = Q.f4737e;
        return set.contains(fVar);
    }
}
