package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;

/* renamed from: com.inmobi.media.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4200x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7469a;
    public final Image b;
    public final AdConfig.AdChoiceConfig c;
    public final Z9 d;
    public final String e;

    public C4200x(Context context, Image image, AdConfig.AdChoiceConfig adChoiceConfig, Z9 z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adChoiceConfig, "adChoiceConfig");
        this.f7469a = context;
        this.b = image;
        this.c = adChoiceConfig;
        this.d = z9;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.e = "AdChoice-Image-" + uuid;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C4200x c4200x, C3972ol c3972ol, String str, int i, ContinuationImpl continuationImpl) {
        C4090t c4090t;
        int i2;
        c4200x.getClass();
        if (continuationImpl instanceof C4090t) {
            c4090t = (C4090t) continuationImpl;
            int i3 = c4090t.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4090t.c = i3 - Integer.MIN_VALUE;
                Object obj = c4090t.f7383a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4090t.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4173w c4173w = new C4173w(c4200x, str, c3972ol, null);
                    c4090t.c = 1;
                    obj = TimeoutKt.withTimeoutOrNull(i, c4173w, c4090t);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        c4090t = new C4090t(c4200x, continuationImpl);
        Object obj2 = c4090t.f7383a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4090t.c;
        if (i2 != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4242ye c4242ye) {
        String url;
        int width;
        Image image;
        int height;
        Image image2 = this.b;
        if (image2 != null && (url = image2.getUrl()) != null) {
            if (!URLUtil.isNetworkUrl(url)) {
                url = null;
            }
        }
        url = this.c.getUrl();
        String str = url;
        Image image3 = this.b;
        if (image3 != null) {
            int width2 = image3.getWidth();
            Integer valueOf = Integer.valueOf(width2);
            if (width2 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                width = valueOf.intValue();
                int i = width;
                image = this.b;
                if (image != null) {
                    int height2 = image.getHeight();
                    Integer valueOf2 = height2 > 0 ? Integer.valueOf(height2) : null;
                    if (valueOf2 != null) {
                        height = valueOf2.intValue();
                        int i2 = height;
                        int loadTimeout = this.c.getLoadTimeout();
                        if (!URLUtil.isNetworkUrl(str)) {
                            Z9 z9 = this.d;
                            if (z9 != null) {
                                z9.b("AdChoiceViewManager", "Invalid URL: " + str);
                            }
                            throw new C3652dd();
                        }
                        return BuildersKt.withContext(Dispatchers.getMain(), new C4062s(this, str, loadTimeout, i, i2, null), c4242ye);
                    }
                }
                height = this.c.getHeight();
                int i22 = height;
                int loadTimeout2 = this.c.getLoadTimeout();
                if (!URLUtil.isNetworkUrl(str)) {
                }
            }
        }
        width = this.c.getWidth();
        int i3 = width;
        image = this.b;
        if (image != null) {
        }
        height = this.c.getHeight();
        int i222 = height;
        int loadTimeout22 = this.c.getLoadTimeout();
        if (!URLUtil.isNetworkUrl(str)) {
        }
    }
}
