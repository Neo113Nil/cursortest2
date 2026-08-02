package org.betup.ui.fragment.home.compose;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeCountdownText.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeCountdownFormat;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "formatHms", "", "remainingMs", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeCountdownFormat {
    public static final int $stable = 0;
    public static final HomeCountdownFormat INSTANCE = new HomeCountdownFormat();

    private HomeCountdownFormat() {
    }

    public final String formatHms(long remainingMs) {
        long coerceAtLeast = RangesKt.coerceAtLeast(remainingMs / 1000, 0L);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(coerceAtLeast / 3600), Long.valueOf((coerceAtLeast % 3600) / 60), Long.valueOf(coerceAtLeast % 60)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
