package Ve0;

import Sc.o;
import android.content.Context;
import com.yandex.runtime.image.AnimatedImageProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.InterfaceC10545a;
import xe0.AbstractC10762a;

/* loaded from: classes3.dex */
public final class a extends AbstractC10762a<AnimatedImageProvider> {
    @NotNull
    public final AnimatedImageProvider c(@NotNull InterfaceC10545a animationSource) {
        Intrinsics.checkNotNullParameter(animationSource, "animationSource");
        if (animationSource instanceof InterfaceC10545a.C2257a) {
            Context b11 = b();
            ((InterfaceC10545a.C2257a) animationSource).getClass();
            AnimatedImageProvider fromAsset = AnimatedImageProvider.fromAsset(b11, null);
            Intrinsics.checkNotNullExpressionValue(fromAsset, "fromAsset(...)");
            return fromAsset;
        }
        if (animationSource instanceof InterfaceC10545a.c) {
            ((InterfaceC10545a.c) animationSource).getClass();
            a();
            throw null;
        }
        if (animationSource instanceof InterfaceC10545a.d) {
            AnimatedImageProvider fromResource = AnimatedImageProvider.fromResource(b(), ((InterfaceC10545a.d) animationSource).f());
            Intrinsics.checkNotNullExpressionValue(fromResource, "fromResource(...)");
            return fromResource;
        }
        if (!(animationSource instanceof InterfaceC10545a.b)) {
            throw new o();
        }
        AnimatedImageProvider fromByteArray = AnimatedImageProvider.fromByteArray(((InterfaceC10545a.b) animationSource).d());
        Intrinsics.checkNotNullExpressionValue(fromByteArray, "fromByteArray(...)");
        return fromByteArray;
    }
}
