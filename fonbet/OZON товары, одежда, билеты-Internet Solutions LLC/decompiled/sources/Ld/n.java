package Ld;

import Bd.b;
import be.C5655a;
import fe.C6535n;
import fe.C6546z;
import fe.InterfaceC6534m;
import fe.InterfaceC6536o;
import ie.C7056e;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import me.C8136a;
import org.jetbrains.annotations.NotNull;
import sd.C9669k;
import td.C9819J;
import vd.InterfaceC10304a;
import vd.InterfaceC10306c;
import wd.L;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6535n f16799a;

    public n(@NotNull C7056e storageManager, @NotNull L moduleDescriptor, @NotNull r classDataFinder, @NotNull j annotationAndConstantLoader, @NotNull Fd.j packageFragmentProvider, @NotNull C9819J notFoundClasses, @NotNull InterfaceC6534m.a.C1011a contractDeserializer, @NotNull ke.r kotlinTypeChecker, @NotNull C8136a typeAttributeTranslators) {
        InterfaceC6536o.a configuration = InterfaceC6536o.a.f63243a;
        yd.i errorReporter = yd.i.f106571b;
        b.a lookupTracker = b.a.f3547a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        qd.m n11 = moduleDescriptor.n();
        C9669k c9669k = n11 instanceof C9669k ? (C9669k) n11 : null;
        s sVar = s.f16809a;
        C9669k c9669k2 = c9669k;
        K k11 = K.f71697a;
        InterfaceC10304a interfaceC10304a = (c9669k2 == null || (interfaceC10304a = c9669k2.p0()) == null) ? InterfaceC10304a.C2230a.f102849a : interfaceC10304a;
        InterfaceC10306c interfaceC10306c = (c9669k2 == null || (interfaceC10306c = c9669k2.p0()) == null) ? InterfaceC10306c.b.f102851a : interfaceC10306c;
        int i11 = Rd.h.f25024b;
        this.f16799a = new C6535n(storageManager, moduleDescriptor, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, errorReporter, sVar, k11, notFoundClasses, contractDeserializer, interfaceC10304a, interfaceC10306c, Rd.h.a(), kotlinTypeChecker, new C5655a(storageManager, k11), typeAttributeTranslators.a(), C6546z.f63270a);
    }

    @NotNull
    public final C6535n a() {
        return this.f16799a;
    }
}
