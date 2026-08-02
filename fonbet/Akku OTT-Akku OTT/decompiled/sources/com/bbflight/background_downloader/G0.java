package com.bbflight.background_downloader;

import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.annotation.RequiresApi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nSharedStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedStorage.kt\ncom/bbflight/background_downloader/SharedStorageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
/* loaded from: classes3.dex */
public final class G0 {
    public static final Regex a = new Regex("^/+");
    public static final Regex b = new Regex("/$");

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[F0.values().length];
            try {
                F0[] f0Arr = F0.a;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                F0[] f0Arr2 = F0.a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                F0[] f0Arr3 = F0.a;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                F0[] f0Arr4 = F0.a;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                F0[] f0Arr5 = F0.a;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                F0[] f0Arr6 = F0.a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(F0 f0) {
        switch (a.$EnumSwitchMapping$0[f0.ordinal()]) {
            case 1:
                String DIRECTORY_DOCUMENTS = Environment.DIRECTORY_DOCUMENTS;
                Intrinsics.checkNotNullExpressionValue(DIRECTORY_DOCUMENTS, "DIRECTORY_DOCUMENTS");
                return DIRECTORY_DOCUMENTS;
            case 2:
                String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS;
                Intrinsics.checkNotNullExpressionValue(DIRECTORY_DOWNLOADS, "DIRECTORY_DOWNLOADS");
                return DIRECTORY_DOWNLOADS;
            case 3:
                String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
                Intrinsics.checkNotNullExpressionValue(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
                return DIRECTORY_PICTURES;
            case 4:
                String DIRECTORY_MOVIES = Environment.DIRECTORY_MOVIES;
                Intrinsics.checkNotNullExpressionValue(DIRECTORY_MOVIES, "DIRECTORY_MOVIES");
                return DIRECTORY_MOVIES;
            case 5:
                String DIRECTORY_MUSIC = Environment.DIRECTORY_MUSIC;
                Intrinsics.checkNotNullExpressionValue(DIRECTORY_MUSIC, "DIRECTORY_MUSIC");
                return DIRECTORY_MUSIC;
            case 6:
                return "";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @RequiresApi(29)
    public static final Uri b(F0 f0) {
        Uri contentUri;
        switch (a.$EnumSwitchMapping$0[f0.ordinal()]) {
            case 1:
                Uri contentUri2 = MediaStore.Files.getContentUri("external_primary");
                Intrinsics.checkNotNullExpressionValue(contentUri2, "getContentUri(...)");
                return contentUri2;
            case 2:
                contentUri = MediaStore.Downloads.getContentUri("external_primary");
                Intrinsics.checkNotNullExpressionValue(contentUri, "getContentUri(...)");
                return contentUri;
            case 3:
                Uri contentUri3 = MediaStore.Images.Media.getContentUri("external_primary");
                Intrinsics.checkNotNullExpressionValue(contentUri3, "getContentUri(...)");
                return contentUri3;
            case 4:
                Uri contentUri4 = MediaStore.Video.Media.getContentUri("external_primary");
                Intrinsics.checkNotNullExpressionValue(contentUri4, "getContentUri(...)");
                return contentUri4;
            case 5:
                Uri contentUri5 = MediaStore.Audio.Media.getContentUri("external_primary");
                Intrinsics.checkNotNullExpressionValue(contentUri5, "getContentUri(...)");
                return contentUri5;
            case 6:
                Uri contentUri6 = MediaStore.Files.getContentUri("external");
                Intrinsics.checkNotNullExpressionValue(contentUri6, "getContentUri(...)");
                return contentUri6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String c(String fileName) {
        String substringAfterLast;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        substringAfterLast = StringsKt__StringsKt.substringAfterLast(fileName, ".", "");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(substringAfterLast);
        return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
    }
}
