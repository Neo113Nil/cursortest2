package com.bbflight.background_downloader;

import android.content.Context;
import android.os.Build;
import androidx.preference.PreferenceManager;
import com.bbflight.background_downloader.B;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@SourceDebugExtension({"SMAP\nHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Helpers.kt\ncom/bbflight/background_downloader/HelpersKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,254:1\n567#2:255\n552#2,6:256\n*S KotlinDebug\n*F\n+ 1 Helpers.kt\ncom/bbflight/background_downloader/HelpersKt\n*L\n207#1:255\n207#1:256,6\n*E\n"})
/* renamed from: com.bbflight.background_downloader.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0633a0 {

    /* renamed from: com.bbflight.background_downloader.a0$a */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[B.values().length];
            try {
                B.a aVar = B.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                B.a aVar2 = B.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                B.a aVar3 = B.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                B.a aVar4 = B.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                B.a aVar5 = B.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(Context context, B baseDirectory) {
        Path path;
        Path path2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseDirectory, "baseDirectory");
        if (PreferenceManager.getDefaultSharedPreferences(context).getInt("com.bbflight.background_downloader.config.useExternalStorage", -1) == 0) {
            File externalFilesDir = context.getExternalFilesDir(null);
            File externalCacheDir = context.getExternalCacheDir();
            if (externalFilesDir == null || externalCacheDir == null) {
                return null;
            }
            int i = a.$EnumSwitchMapping$0[baseDirectory.ordinal()];
            if (i == 1) {
                String path3 = externalFilesDir.getPath();
                Intrinsics.checkNotNullExpressionValue(path3, "getPath(...)");
                return path3;
            }
            if (i == 2) {
                String path4 = externalCacheDir.getPath();
                Intrinsics.checkNotNullExpressionValue(path4, "getPath(...)");
                return path4;
            }
            if (i == 3) {
                return androidx.compose.runtime.changelist.d.b(externalFilesDir.getPath(), "/Support");
            }
            if (i == 4) {
                return androidx.compose.runtime.changelist.d.b(externalFilesDir.getPath(), "/Library");
            }
            if (i == 5) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        if (Build.VERSION.SDK_INT < 26) {
            int i2 = a.$EnumSwitchMapping$0[baseDirectory.ordinal()];
            if (i2 == 1) {
                return androidx.compose.runtime.changelist.d.b(context.getDataDir().getPath(), "/app_flutter");
            }
            if (i2 == 2) {
                String path5 = context.getCacheDir().getPath();
                Intrinsics.checkNotNullExpressionValue(path5, "getPath(...)");
                return path5;
            }
            if (i2 == 3) {
                String path6 = context.getFilesDir().getPath();
                Intrinsics.checkNotNullExpressionValue(path6, "getPath(...)");
                return path6;
            }
            if (i2 == 4) {
                return androidx.compose.runtime.changelist.d.b(context.getFilesDir().getPath(), "/Library");
            }
            if (i2 == 5) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        int i3 = a.$EnumSwitchMapping$0[baseDirectory.ordinal()];
        if (i3 == 1) {
            String path7 = context.getDataDir().getPath();
            Intrinsics.checkNotNullExpressionValue(path7, "getPath(...)");
            path = Paths.get(path7, (String[]) Arrays.copyOf(new String[]{"app_flutter"}, 1));
            Intrinsics.checkNotNullExpressionValue(path, "get(...)");
            return path.toString();
        }
        if (i3 == 2) {
            String path8 = context.getCacheDir().getPath();
            Intrinsics.checkNotNullExpressionValue(path8, "getPath(...)");
            return path8;
        }
        if (i3 == 3) {
            String path9 = context.getFilesDir().getPath();
            Intrinsics.checkNotNullExpressionValue(path9, "getPath(...)");
            return path9;
        }
        if (i3 != 4) {
            if (i3 == 5) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        String path10 = context.getFilesDir().getPath();
        Intrinsics.checkNotNullExpressionValue(path10, "getPath(...)");
        path2 = Paths.get(path10, (String[]) Arrays.copyOf(new String[]{"Library"}, 1));
        Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        return path2.toString();
    }

    public static final long b(Map<String, ? extends List<String>> responseHeaders, M0 task) {
        long longValue;
        String str;
        Long longOrNull;
        String str2;
        Long longOrNull2;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(task, "task");
        List<String> list = responseHeaders.get(RtspHeaders.CONTENT_LENGTH);
        if (list == null || (str2 = list.get(0)) == null || (longOrNull2 = StringsKt.toLongOrNull(str2)) == null) {
            List<String> list2 = responseHeaders.get("content-length");
            Long longOrNull3 = (list2 == null || (str = list2.get(0)) == null) ? null : StringsKt.toLongOrNull(str);
            longValue = longOrNull3 != null ? longOrNull3.longValue() : -1L;
        } else {
            longValue = longOrNull2.longValue();
        }
        if (longValue != -1) {
            return longValue;
        }
        Map<String, String> map = task.e;
        Map<String, String> map2 = task.e;
        String str3 = map.get(RtspHeaders.RANGE);
        if (str3 == null && (str3 = map2.get(SessionDescription.ATTR_RANGE)) == null) {
            str3 = "";
        }
        Pair<Long, Long> c = c(str3);
        if (c.getSecond() != null) {
            Long second = c.getSecond();
            Intrinsics.checkNotNull(second);
            return (second.longValue() - c.getFirst().longValue()) + 1;
        }
        String str4 = map2.get("Known-Content-Length");
        if (str4 != null && (longOrNull = StringsKt.toLongOrNull(str4)) != null) {
            return longOrNull.longValue();
        }
        String str5 = map2.get("known-content-length");
        Long longOrNull4 = str5 != null ? StringsKt.toLongOrNull(str5) : null;
        if (longOrNull4 != null) {
            return longOrNull4.longValue();
        }
        return -1L;
    }

    public static final Pair<Long, Long> c(String rangeStr) {
        Intrinsics.checkNotNullParameter(rangeStr, "rangeStr");
        MatchResult find$default = Regex.find$default(new Regex("bytes=(\\d*)-(\\d*)"), rangeStr, 0, 2, null);
        if (find$default == null) {
            return new Pair<>(0L, null);
        }
        Long longOrNull = StringsKt.toLongOrNull(find$default.getGroupValues().get(1));
        return new Pair<>(Long.valueOf(longOrNull != null ? longOrNull.longValue() : 0L), StringsKt.toLongOrNull(find$default.getGroupValues().get(2)));
    }
}
