package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.il, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3800il extends G2 {
    public final CoroutineScope b;
    public final C3828jl c;
    public final MutableSharedFlow d;
    public final Z9 e;
    public final String f;
    public final C3972ol g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3800il(Context context, CoroutineScope coroutineScope, C3828jl staticExperienceModel, MutableSharedFlow mediaEventFlow, Z9 z9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(staticExperienceModel, "staticExperienceModel");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.b = coroutineScope;
        this.c = staticExperienceModel;
        this.d = mediaEventFlow;
        this.e = z9;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f = "Static-Image-" + uuid;
        int i = C3972ol.b;
        Intrinsics.checkNotNullParameter(context, "context");
        this.g = new C3972ol(context);
    }

    @Override // com.inmobi.media.G2
    public final void a(MutableStateFlow windowFlow) {
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
    }

    @Override // com.inmobi.media.G2
    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.inmobi.media.il] */
    @Override // com.inmobi.media.G2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3660dl c3660dl;
        int i;
        Z9 z9;
        if (continuationImpl instanceof C3660dl) {
            c3660dl = (C3660dl) continuationImpl;
            int i2 = c3660dl.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3660dl.c = i2 - Integer.MIN_VALUE;
                Object obj = c3660dl.f7073a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3660dl.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Z9 z92 = this.e;
                    if (z92 != null) {
                        z92.a("StaticExperienceManager", "load Called - imageAssets count: " + this.c.f7186a.size());
                    }
                    Map a2 = AbstractC4169vm.a(this.c.b.f7310a);
                    C3829jm c3829jm = C3829jm.f7187a;
                    C3829jm.b("MainImageLoadStarted", a2, EnumC3944nm.f7271a);
                    List images = this.c.f7186a;
                    Intrinsics.checkNotNullParameter(images, "images");
                    ArrayList images2 = new ArrayList();
                    for (Object obj2 : images) {
                        Image image = (Image) obj2;
                        if (URLUtil.isHttpUrl(image.getUrl()) || URLUtil.isHttpsUrl(image.getUrl())) {
                            images2.add(obj2);
                        }
                    }
                    if (images2.isEmpty()) {
                        Z9 z93 = this.e;
                        if (z93 != null) {
                            z93.a("StaticExperienceManager", "Sanitized Images Empty - no valid images to load");
                        }
                        Map mutableMap = MapsKt.toMutableMap(AbstractC4169vm.a(this.c.b.f7310a));
                        mutableMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2351);
                        C3829jm c3829jm2 = C3829jm.f7187a;
                        C3829jm.b("MainImageLoadFailure", mutableMap, EnumC3944nm.f7271a);
                        throw new C3652dd();
                    }
                    Intrinsics.checkNotNullParameter(images2, "images");
                    int size = images2.size();
                    ArrayList arrayList = images2;
                    if (size > 1) {
                        int a3 = Z5.a();
                        int ordinal = Z4.a().ordinal();
                        arrayList = ordinal != 2 ? ordinal != 3 ? CollectionsKt.sortedWith(images2, new C3915ml()) : a3 > 720 ? CollectionsKt.sortedWith(images2, new C3943nl()) : CollectionsKt.sortedWith(images2, new C3857kl(a3)) : CollectionsKt.sortedWith(images2, new C3887ll(a3));
                    }
                    C3972ol c3972ol = this.g;
                    c3660dl.c = 1;
                    if (a(arrayList, c3972ol, c3660dl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                z9 = this.e;
                if (z9 != null) {
                    z9.a("StaticExperienceManager", "Static Load Success");
                }
                Map a4 = AbstractC4169vm.a(this.c.b.f7310a);
                C3829jm c3829jm3 = C3829jm.f7187a;
                C3829jm.b("MainImageLoadSuccess", a4, EnumC3944nm.f7271a);
                return Unit.INSTANCE;
            }
        }
        c3660dl = new C3660dl(this, continuationImpl);
        Object obj3 = c3660dl.f7073a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3660dl.c;
        if (i != 0) {
        }
        z9 = this.e;
        if (z9 != null) {
        }
        Map a42 = AbstractC4169vm.a(this.c.b.f7310a);
        C3829jm c3829jm32 = C3829jm.f7187a;
        C3829jm.b("MainImageLoadSuccess", a42, EnumC3944nm.f7271a);
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.G2
    public final Object a(FrameLayout frameLayout, C3849kd c3849kd) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C3632cl(this, frameLayout, null), c3849kd);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.inmobi.media.G2
    public final void a() {
        ViewParent parent = this.g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = Ug.f6893a;
        Ug.b(this.f6571a).cancelTag(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r12, r13, r8) != r9) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ImageView imageView, ContinuationImpl continuationImpl) {
        C3688el c3688el;
        int i;
        Ref.BooleanRef booleanRef;
        List list2;
        ImageView imageView2;
        if (continuationImpl instanceof C3688el) {
            c3688el = (C3688el) continuationImpl;
            int i2 = c3688el.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3688el.f = i2 - Integer.MIN_VALUE;
                C3688el c3688el2 = c3688el;
                Object obj = c3688el2.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3688el2.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Z9 z9 = this.e;
                    if (z9 != null) {
                        z9.a("StaticExperienceManager", "loadImagesIntoImageView - attempting to load " + list.size() + " images");
                    }
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C3744gl c3744gl = new C3744gl(this, null);
                    c3688el2.f7090a = list;
                    c3688el2.b = imageView;
                    c3688el2.c = booleanRef2;
                    c3688el2.f = 1;
                    Object withContext = BuildersKt.withContext(main, c3744gl, c3688el2);
                    if (withContext != coroutine_suspended) {
                        booleanRef = booleanRef2;
                        obj = withContext;
                        list2 = list;
                        imageView2 = imageView;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                Ref.BooleanRef booleanRef3 = c3688el2.c;
                ImageView imageView3 = c3688el2.b;
                List list3 = c3688el2.f7090a;
                ResultKt.throwOnFailure(obj);
                imageView2 = imageView3;
                booleanRef = booleanRef3;
                list2 = list3;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C3716fl c3716fl = new C3716fl(list2, this, booleanRef, imageView2, (Bitmap.Config) obj, null);
                c3688el2.f7090a = null;
                c3688el2.b = null;
                c3688el2.c = null;
                c3688el2.f = 2;
            }
        }
        c3688el = new C3688el(this, continuationImpl);
        C3688el c3688el22 = c3688el;
        Object obj2 = c3688el22.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3688el22.f;
        if (i != 0) {
        }
        CoroutineDispatcher io22 = Dispatchers.getIO();
        C3716fl c3716fl2 = new C3716fl(list2, this, booleanRef, imageView2, (Bitmap.Config) obj2, null);
        c3688el22.f7090a = null;
        c3688el22.b = null;
        c3688el22.c = null;
        c3688el22.f = 2;
    }

    public final void a(ImageView imageView, final Image image) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.il$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3800il.a(C3800il.this, image, view);
            }
        });
    }

    public static final void a(C3800il c3800il, Image image, View view) {
        Z9 z9 = c3800il.e;
        if (z9 != null) {
            z9.a("StaticExperienceManager", "Static Click Event");
        }
        BuildersKt__Builders_commonKt.launch$default(c3800il.b, null, null, new C3773hl(image, c3800il, null), 3, null);
    }
}
