package com.chartboost.sdk.impl;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.chartboost.sdk.events.ChartboostError;
import com.ironsource.U3;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class cc {

    public static final class a extends ContinuationImpl {
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return cc.b((URL) null, this);
        }
    }

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public long g;
        public /* synthetic */ Object h;
        public int i;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.i |= Integer.MIN_VALUE;
            return cc.c(null, this);
        }
    }

    public static final void b() {
        int i;
        Set a2 = i6.a();
        if (a2 == null) {
            mb.e("Device codec capabilities - Unable to retrieve", null, 2, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = a2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.startsWith$default((String) next, "video/", false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(StringsKt.removePrefix((String) obj, (CharSequence) "video/"));
        }
        mb.a("Device codec capabilities - Video: [" + CollectionsKt.joinToString$default(CollectionsKt.sorted(arrayList2), ", ", null, null, 0, null, null, 62, null) + U3.j.e, (Throwable) null, 2, (Object) null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:113|114|115|116|(3:142|143|76)(9:118|119|120|121|122|123|124|125|(2:129|(6:131|132|95|96|(7:98|14|15|(0)(0)|18|19|(0)(0))|87)(1:133))(2:127|128))|91|(1:93)(2:102|(1:104)(1:105))|94|95|96|(0)|87) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0405, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0406, code lost:
    
        r3 = r0;
        r9 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0360 A[Catch: Exception -> 0x0401, TryCatch #13 {Exception -> 0x0401, blocks: (B:15:0x035a, B:17:0x0360, B:30:0x0386, B:33:0x038d), top: B:14:0x035a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0386 A[Catch: Exception -> 0x0401, TryCatch #13 {Exception -> 0x0401, blocks: (B:15:0x035a, B:17:0x0360, B:30:0x0386, B:33:0x038d), top: B:14:0x035a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015e A[Catch: Exception -> 0x029b, TRY_ENTER, TryCatch #8 {Exception -> 0x029b, blocks: (B:67:0x0120, B:69:0x015e, B:72:0x0165, B:110:0x018a), top: B:66:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0354  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x011a -> B:66:0x0120). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(URL url, Continuation continuation) {
        b bVar;
        int i;
        int i2;
        w6 f;
        Iterator it;
        Throwable e;
        b bVar2;
        URL url2;
        String str;
        Throwable th;
        int i3;
        Object a2;
        int i4;
        Object obj;
        String str2;
        b bVar3;
        ChartboostError internal;
        Object a3;
        Object obj2;
        int i5;
        URL url3;
        b bVar4;
        int i6;
        long length;
        URL url4;
        b bVar5;
        List a4;
        List a5;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i7 = bVar.i;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.i = i7 - Integer.MIN_VALUE;
                Object obj3 = bVar.h;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.i;
                String str3 = U3.j.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    i2 = 0;
                    f = b4.b.b().f();
                    it = CollectionsKt.listOf((Object[]) new Long[]{Boxing.boxLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH), Boxing.boxLong(PlaybackStateCompat.ACTION_SET_REPEAT_MODE), Boxing.boxLong(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED), Boxing.boxLong(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), Boxing.boxLong(2097152L)}).iterator();
                    e = null;
                    bVar2 = bVar;
                    url2 = url;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    long j = bVar.g;
                    int i8 = bVar.f;
                    it = (Iterator) bVar.e;
                    Throwable th2 = (Throwable) bVar.d;
                    f = (w6) bVar.c;
                    URL url5 = (URL) bVar.b;
                    try {
                        ResultKt.throwOnFailure(obj3);
                        obj2 = ((Result) obj3).getValue();
                        str2 = U3.j.d;
                        i5 = i8;
                        bVar2 = bVar;
                        url2 = url5;
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            url3 = url2;
                            bVar4 = bVar2;
                            i6 = i5;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str2 = U3.j.d;
                    }
                    if (Result.m8085isFailureimpl(obj2)) {
                        try {
                            e = Result.m8082exceptionOrNullimpl(obj2);
                            mb.e("Failed to download first " + j + " bytes from " + url2 + ": " + e, null, 2, null);
                            i2 = i5;
                            str3 = str2;
                        } catch (Exception e4) {
                            e = e4;
                            url5 = url2;
                            bVar = bVar2;
                            i8 = i5;
                        }
                    } else {
                        if (Result.m8085isFailureimpl(obj2)) {
                            obj2 = null;
                        }
                        File file = (File) obj2;
                        if (file == null) {
                            mb.e("Downloaded file is null for " + j + " bytes from " + url2, null, 2, null);
                        } else {
                            if (file.exists()) {
                                i6 = i5;
                                try {
                                    length = file.length();
                                } catch (Exception e5) {
                                    e = e5;
                                    url3 = url2;
                                    bVar4 = bVar2;
                                    i8 = i6;
                                    url5 = url3;
                                    bVar = bVar4;
                                    if (e instanceof ChartboostError.Load) {
                                    }
                                    str = str2;
                                    mb.b(str + internal.getCode() + "] Exception occurred while trying to extract codecs with " + j + " bytes from " + url5, internal);
                                    i2 = i8;
                                    url2 = url5;
                                    bVar2 = bVar3;
                                    mb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                    bVar2.b = url2;
                                    bVar2.c = e;
                                    bVar2.d = null;
                                    bVar2.e = null;
                                    bVar2.f = i2;
                                    bVar2.i = 2;
                                    a2 = f.a(url2, -1L, bVar2);
                                    if (a2 != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                                if (length == 0) {
                                    try {
                                        mb.e("Downloaded file is empty", null, 2, null);
                                        e = th2;
                                        str3 = str2;
                                        i2 = i6;
                                    } catch (Exception e6) {
                                        e = e6;
                                        url5 = url2;
                                        bVar = bVar2;
                                        i8 = i6;
                                    }
                                } else {
                                    try {
                                        try {
                                            try {
                                                mb.a("Downloaded " + length + " bytes to " + file.getAbsolutePath(), (Throwable) null, 2, (Object) null);
                                                String absolutePath = file.getAbsolutePath();
                                                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                                a4 = a(absolutePath);
                                            } catch (Exception e7) {
                                                e = e7;
                                                url4 = url2;
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            bVar5 = bVar2;
                                            url5 = url4;
                                            bVar = bVar5;
                                            i8 = 1;
                                            if (e instanceof ChartboostError.Load) {
                                            }
                                            str = str2;
                                            mb.b(str + internal.getCode() + "] Exception occurred while trying to extract codecs with " + j + " bytes from " + url5, internal);
                                            i2 = i8;
                                            url2 = url5;
                                            bVar2 = bVar3;
                                            mb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                            bVar2.b = url2;
                                            bVar2.c = e;
                                            bVar2.d = null;
                                            bVar2.e = null;
                                            bVar2.f = i2;
                                            bVar2.i = 2;
                                            a2 = f.a(url2, -1L, bVar2);
                                            if (a2 != coroutine_suspended) {
                                            }
                                            return coroutine_suspended;
                                        }
                                        url4 = url2;
                                    } catch (Exception e9) {
                                        e = e9;
                                        url5 = url4;
                                        bVar = bVar5;
                                        i8 = 1;
                                        if (e instanceof ChartboostError.Load) {
                                        }
                                        str = str2;
                                        mb.b(str + internal.getCode() + "] Exception occurred while trying to extract codecs with " + j + " bytes from " + url5, internal);
                                        i2 = i8;
                                        url2 = url5;
                                        bVar2 = bVar3;
                                        mb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                        bVar2.b = url2;
                                        bVar2.c = e;
                                        bVar2.d = null;
                                        bVar2.e = null;
                                        bVar2.f = i2;
                                        bVar2.i = 2;
                                        a2 = f.a(url2, -1L, bVar2);
                                        if (a2 != coroutine_suspended) {
                                        }
                                        return coroutine_suspended;
                                    }
                                    bVar5 = bVar2;
                                    if (!a4.isEmpty()) {
                                        mb.a("Successfully extracted " + a4.size() + " codecs with " + j + " bytes requested (got " + length + " bytes): " + a4, (Throwable) null, 2, (Object) null);
                                        return a4;
                                    }
                                    if (length < j) {
                                        mb.a("Got less than requested (" + length + " < " + j + "), likely have full file but couldn't extract codecs", (Throwable) null, 2, (Object) null);
                                        e = th2;
                                        str = str2;
                                        url2 = url4;
                                        bVar2 = bVar5;
                                        i2 = 1;
                                        mb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                        bVar2.b = url2;
                                        bVar2.c = e;
                                        bVar2.d = null;
                                        bVar2.e = null;
                                        bVar2.f = i2;
                                        bVar2.i = 2;
                                        a2 = f.a(url2, -1L, bVar2);
                                        if (a2 != coroutine_suspended) {
                                            i4 = i2;
                                            th = e;
                                            obj = a2;
                                            if (Result.m8085isFailureimpl(obj)) {
                                            }
                                            i3 = i4;
                                            String a6 = a();
                                            b();
                                            if (i3 != 0) {
                                            }
                                        }
                                        return coroutine_suspended;
                                    }
                                    e = th2;
                                    str3 = str2;
                                    url2 = url4;
                                    bVar2 = bVar5;
                                    i2 = 1;
                                }
                                if (e instanceof ChartboostError.Load) {
                                    internal = (ChartboostError.Load) e;
                                    bVar3 = bVar;
                                } else if (e instanceof IOException) {
                                    bVar3 = bVar;
                                    internal = new ChartboostError.Load.AssetUnavailable(url5.toString(), "Failed to download partial file: " + e.getMessage(), e);
                                } else {
                                    bVar3 = bVar;
                                    internal = new ChartboostError.Load.Internal("Failed to extract codecs from partial download: " + e.getMessage(), e);
                                }
                                str = str2;
                                mb.b(str + internal.getCode() + "] Exception occurred while trying to extract codecs with " + j + " bytes from " + url5, internal);
                                i2 = i8;
                                url2 = url5;
                                bVar2 = bVar3;
                                mb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                bVar2.b = url2;
                                bVar2.c = e;
                                bVar2.d = null;
                                bVar2.e = null;
                                bVar2.f = i2;
                                bVar2.i = 2;
                                a2 = f.a(url2, -1L, bVar2);
                                if (a2 != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            mb.e("Downloaded file doesn't exist: " + file.getAbsolutePath(), null, 2, null);
                        }
                        i6 = i5;
                        e = th2;
                        str3 = str2;
                        i2 = i6;
                    }
                    if (it.hasNext()) {
                        try {
                            j = ((Number) it.next()).longValue();
                            try {
                                mb.a("Trying to extract codecs with " + j + " bytes from " + url2, (Throwable) null, 2, (Object) null);
                                bVar2.b = url2;
                                bVar2.c = f;
                                bVar2.d = e;
                                bVar2.e = it;
                                bVar2.f = i2;
                                bVar2.g = j;
                                bVar2.i = 1;
                                a3 = f.a(url2, j, bVar2);
                            } catch (Exception e10) {
                                e = e10;
                                str2 = str3;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            url5 = url2;
                            bVar = bVar2;
                            i8 = i2;
                            if (e instanceof ChartboostError.Load) {
                            }
                            str = str2;
                            mb.b(str + internal.getCode() + "] Exception occurred while trying to extract codecs with " + j + " bytes from " + url5, internal);
                            i2 = i8;
                            url2 = url5;
                            bVar2 = bVar3;
                            mb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                            bVar2.b = url2;
                            bVar2.c = e;
                            bVar2.d = null;
                            bVar2.e = null;
                            bVar2.f = i2;
                            bVar2.i = 2;
                            a2 = f.a(url2, -1L, bVar2);
                            if (a2 != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        str2 = str3;
                        if (a3 != coroutine_suspended) {
                            int i9 = i2;
                            th2 = e;
                            obj2 = a3;
                            i5 = i9;
                            if (Result.m8085isFailureimpl(obj2)) {
                            }
                            if (it.hasNext()) {
                                str = str3;
                                mb.a("Partial downloads failed, attempting full file download for " + url2, (Throwable) null, 2, (Object) null);
                                bVar2.b = url2;
                                bVar2.c = e;
                                bVar2.d = null;
                                bVar2.e = null;
                                bVar2.f = i2;
                                bVar2.i = 2;
                                a2 = f.a(url2, -1L, bVar2);
                                if (a2 != coroutine_suspended) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = bVar.f;
                    th = (Throwable) bVar.c;
                    url2 = (URL) bVar.b;
                    try {
                        ResultKt.throwOnFailure(obj3);
                        obj = ((Result) obj3).getValue();
                        str = U3.j.d;
                        try {
                        } catch (Exception e12) {
                            th = e12;
                            i3 = i4;
                        }
                    } catch (Exception e13) {
                        th = e13;
                        i3 = i4;
                        str = U3.j.d;
                        ChartboostError assetUnavailable = th instanceof ChartboostError.Load ? (ChartboostError.Load) th : th instanceof IOException ? new ChartboostError.Load.AssetUnavailable(url2.toString(), "Failed to download full file: " + th.getMessage(), th) : th instanceof OutOfMemoryError ? ChartboostError.Load.NoStorage.INSTANCE : new ChartboostError.Load.Internal("Failed to process full file download: " + th.getMessage(), th);
                        mb.b(str + assetUnavailable.getCode() + "] Exception occurred while trying to download full file from " + url2, assetUnavailable);
                        String a62 = a();
                        b();
                        if (i3 != 0) {
                        }
                    }
                    if (Result.m8085isFailureimpl(obj)) {
                        if (Result.m8085isFailureimpl(obj)) {
                            obj = null;
                        }
                        File file2 = (File) obj;
                        if (file2 != null) {
                            try {
                                mb.a("Successfully downloaded full file: " + file2.getAbsolutePath() + " with size " + file2.length() + " bytes", (Throwable) null, 2, (Object) null);
                                String absolutePath2 = file2.getAbsolutePath();
                                Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                                a5 = a(absolutePath2);
                            } catch (Exception e14) {
                                th = e14;
                                i3 = 1;
                                if (th instanceof ChartboostError.Load) {
                                }
                                mb.b(str + assetUnavailable.getCode() + "] Exception occurred while trying to download full file from " + url2, assetUnavailable);
                                String a622 = a();
                                b();
                                if (i3 != 0) {
                                }
                            }
                            if (!a5.isEmpty()) {
                                mb.a("Successfully extracted " + a5.size() + " codecs from full file: " + a5, (Throwable) null, 2, (Object) null);
                                return a5;
                            }
                            i3 = 1;
                            String a6222 = a();
                            b();
                            if (i3 != 0) {
                                mb.e("All download attempts failed for " + url2 + ". " + a6222, null, 2, null);
                                throw new ChartboostError.Load.AssetUnavailable(url2.toString(), "Failed to download media file for codec detection: " + (th != null ? th.getMessage() : null) + ". " + a6222, a(url2, th));
                            }
                            mb.e("Failed to extract codecs from successfully downloaded file: " + url2 + ". " + a6222, null, 2, null);
                            throw new ChartboostError.Load.UnsupportedCodec("Failed to extract codecs from media file: " + url2 + ". " + a6222, new kj("Problem displaying MediaFile from URI " + url2, 405));
                        }
                    } else {
                        th = Result.m8082exceptionOrNullimpl(obj);
                        mb.e("Failed to download full file from " + url2 + ": " + th, null, 2, null);
                    }
                    i3 = i4;
                    String a62222 = a();
                    b();
                    if (i3 != 0) {
                    }
                }
            }
        }
        bVar = new b(continuation);
        Object obj32 = bVar.h;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.i;
        String str32 = U3.j.d;
        if (i != 0) {
        }
    }

    public static final String a() {
        return Build.MANUFACTURER + ServerSentEventKt.SPACE + Build.MODEL + ", API " + Build.VERSION.SDK_INT;
    }

    public static final List a(String str) {
        ChartboostError unsupportedCodec;
        try {
            File file = new File(str);
            if (!file.exists()) {
                mb.e("File does not exist: " + str, null, 2, null);
                return CollectionsKt.emptyList();
            }
            if (!file.canRead()) {
                mb.e("Cannot read file: " + str, null, 2, null);
                return CollectionsKt.emptyList();
            }
            mb.a("Attempting to extract codecs from: " + str + " (" + file.length() + " bytes)", (Throwable) null, 2, (Object) null);
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                mb.a("MediaExtractor found " + trackCount + " tracks", (Throwable) null, 2, (Object) null);
                if (trackCount == 0) {
                    mb.e("No tracks found in media file", null, 2, null);
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < trackCount; i++) {
                    try {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                        Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                        String string = trackFormat.getString("mime");
                        if (string != null) {
                            arrayList.add(string);
                            mb.d("Track " + i + ": Found codec: " + string, null, 2, null);
                            mb.d("  Duration: " + b(trackFormat, "durationUs") + ", Bitrate: " + a(trackFormat, "bitrate"), null, 2, null);
                        } else {
                            mb.d("Track " + i + ": No MIME type found", null, 2, null);
                        }
                    } catch (Exception e) {
                        ChartboostError.Load.UnsupportedCodec unsupportedCodec2 = new ChartboostError.Load.UnsupportedCodec("Failed to extract codec info for track " + i + ": " + e.getMessage(), e);
                        mb.e(U3.j.d + unsupportedCodec2.getCode() + "] Failed to get format for track " + i, unsupportedCodec2);
                    }
                }
                return arrayList;
            } finally {
                mediaExtractor.release();
            }
        } catch (Exception e2) {
            if (e2 instanceof IOException) {
                unsupportedCodec = new ChartboostError.Load.AssetUnavailable(str, "Failed to read media file: " + e2.getMessage(), e2);
            } else if (e2 instanceof IllegalArgumentException) {
                unsupportedCodec = new ChartboostError.Load.InvalidAssetUrl(str, "Invalid media file path: " + e2.getMessage(), e2);
            } else {
                unsupportedCodec = new ChartboostError.Load.UnsupportedCodec("Failed to extract codecs from media file: " + e2.getMessage() + ". " + a(), e2);
            }
            mb.e(U3.j.d + unsupportedCodec.getCode() + "] Failed to extract codecs from " + str + ". " + a(), unsupportedCodec);
            b();
            return CollectionsKt.emptyList();
        }
    }

    public static final kj a(URL url, Throwable th) {
        String str;
        int a2 = a(th);
        if (th == null || (str = th.getMessage()) == null) {
            str = "download failed";
        }
        return new kj("Unable to fetch MediaFile from URI " + url + " (" + str + ")", a2);
    }

    public static final int a(Throwable th) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null && linkedHashSet.add(th)) {
            if (th instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                int b2 = ((com.chartboost.sdk.internal.Networking.okhttp.a) th).b();
                if (b2 == 408 || b2 == 504) {
                    return TTAdConstant.AD_ID_IS_NULL_CODE;
                }
                return 401;
            }
            if ((th instanceof SocketTimeoutException) || (th instanceof InterruptedIOException)) {
                return TTAdConstant.AD_ID_IS_NULL_CODE;
            }
            if ((th instanceof UnknownHostException) || (th instanceof ConnectException) || (th instanceof NoRouteToHostException)) {
                return 400;
            }
            th = th.getCause();
        }
        return 400;
    }

    public static final Integer a(MediaFormat mediaFormat, String str) {
        try {
            if (mediaFormat.containsKey(str)) {
                return Integer.valueOf(mediaFormat.getInteger(str));
            }
            return null;
        } catch (Exception e) {
            mb.d("Failed to get integer value for key " + str, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(URL url, Continuation continuation) {
        a aVar;
        int i;
        String a2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar.b = url;
                    aVar.d = 1;
                    obj = c(url, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    url = (URL) aVar.b;
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (StringsKt.startsWith$default((String) obj2, "video/", false, 2, (Object) null)) {
                        arrayList.add(obj2);
                    }
                }
                a2 = i6.a(arrayList);
                if (a2 != null) {
                    return list;
                }
                mb.e("Gate rejected media at " + url + ": no decoder for " + a2 + ". " + a(), null, 2, null);
                b();
                throw new ChartboostError.Load.UnsupportedCodec("No decoder for extracted bitstream codec: " + a2 + ". " + a(), new kj("Problem displaying MediaFile from URI " + url, 405));
            }
        }
        aVar = new a(continuation);
        Object obj3 = aVar.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        List list2 = (List) obj3;
        ArrayList arrayList2 = new ArrayList();
        while (r1.hasNext()) {
        }
        a2 = i6.a(arrayList2);
        if (a2 != null) {
        }
    }

    public static final Long b(MediaFormat mediaFormat, String str) {
        try {
            if (mediaFormat.containsKey(str)) {
                return Long.valueOf(mediaFormat.getLong(str));
            }
            return null;
        } catch (Exception e) {
            mb.d("Failed to get long value for key " + str, e);
            return null;
        }
    }
}
