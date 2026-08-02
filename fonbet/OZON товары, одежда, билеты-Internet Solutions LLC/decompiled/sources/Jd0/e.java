package Jd0;

import We.E;
import android.content.Context;
import androidx.recyclerview.widget.m;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrlFactory;
import ru.ozon.app.android.pikazon.imagePathHandler.ImagePathHandlerConfig;
import ru.ozon.app.android.pikazon.interceptors.WebPHeaderInterceptor;
import ru.ozon.app.android.pikazon.processors.ImageSourceProcessor;
import ru.ozon.app.android.pikazon.resources.PikazonResourceManagerImpl;

/* loaded from: classes3.dex */
public final class e {

    private static final class a implements ImageSourceProcessor {
        @Override // ru.ozon.app.android.pikazon.processors.ImageSourceProcessor
        public final Object transform(Object source, Context context) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(context, "context");
            if (source instanceof String) {
                return ContextExtKt.loadIconByString(context, (String) source);
            }
            return null;
        }
    }

    @NotNull
    public static void a() {
        Pikazon.Companion companion = Pikazon.INSTANCE;
        E.a aVar = new E.a();
        aVar.a(new WebPHeaderInterceptor());
        E e11 = new E(aVar);
        ImagePathHandlerConfig imagePathHandlerConfig = new ImagePathHandlerConfig(C7714v.b0(new Regex("cdn[0-9]+\\.ozone\\.ru"), new Regex("ir\\.ozone\\.ru"), new Regex("ir[0-9]+\\.ozone\\.ru")), true);
        PikazonResourceManagerImpl pikazonResourceManagerImpl = new PikazonResourceManagerImpl();
        Set h11 = e0.h(new a());
        f fVar = new f();
        String format = String.format(Locale.getDefault(), "%s/%s+%s", Arrays.copyOf(new Object[]{"ozonapp_android", "15.3", "2281"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        companion.bind(e11, pikazonResourceManagerImpl, imagePathHandlerConfig, new Pikazon.Config("50,100,200,350,500,800,1000", 0, h11, (PikazonUrlFactory) null, (PikazonPerformanceAvailabilityChecker) fVar, new Pikazon.NetworkConfiguration(format, true), false, false, m.e.DEFAULT_DRAG_ANIMATION_DURATION, (DefaultConstructorMarker) null)).setImagePreviewEnabled(true).addPerformanceListener(new g());
    }
}
