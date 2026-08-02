package com.bbflight.background_downloader;

import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bbflight.background_downloader.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0682z0 {
    public static final a Companion = new a();

    /* renamed from: com.bbflight.background_downloader.z0$a */
    public static final class a {

        /* renamed from: com.bbflight.background_downloader.z0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0051a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC0680y0.values().length];
                try {
                    EnumC0680y0 enumC0680y0 = EnumC0680y0.a;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    EnumC0680y0 enumC0680y02 = EnumC0680y0.a;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static EnumC0678x0 a(Context context, EnumC0680y0 permissionType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissionType, "permissionType");
            int ordinal = permissionType.ordinal();
            return ordinal != 0 ? ordinal != 1 ? EnumC0678x0.b : Build.VERSION.SDK_INT < 29 ? ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 ? EnumC0678x0.b : EnumC0678x0.a : EnumC0678x0.b : Build.VERSION.SDK_INT >= 33 ? ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0 ? EnumC0678x0.b : EnumC0678x0.a : EnumC0678x0.b;
        }
    }
}
