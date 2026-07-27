package com.inmobi.media;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.squareup.picasso.Picasso;
import io.ktor.sse.ServerSentEventKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.fl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3716fl extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7110a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C3800il c;
    public final /* synthetic */ Ref.BooleanRef d;
    public final /* synthetic */ ImageView e;
    public final /* synthetic */ Bitmap.Config f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3716fl(List list, C3800il c3800il, Ref.BooleanRef booleanRef, ImageView imageView, Bitmap.Config config, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = c3800il;
        this.d = booleanRef;
        this.e = imageView;
        this.f = config;
    }

    public static final void a(C3800il c3800il, ImageView imageView, Pair pair) {
        Z9 z9 = c3800il.e;
        if (z9 != null) {
            z9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        c3800il.a(imageView, (Image) pair.getSecond());
        imageView.setImageBitmap((Bitmap) pair.getFirst());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3716fl c3716fl = new C3716fl(this.b, this.c, this.d, this.e, this.f, continuation);
        c3716fl.f7110a = obj;
        return c3716fl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3716fl) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Pair pair;
        Object m8079constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = this.b;
        C3800il c3800il = this.c;
        Bitmap.Config config = this.f;
        Ref.BooleanRef booleanRef = this.d;
        Iterator it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            Z9 z9 = c3800il.e;
            if (z9 != null) {
                z9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Picasso picasso = Ug.f6893a;
                m8079constructorimpl = Result.m8079constructorimpl(Ug.b(c3800il.f6571a).load(image.getUrl()).tag(c3800il.f).transform(new Pg(config)).get());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
            if (m8082exceptionOrNullimpl != null) {
                Z9 z92 = c3800il.e;
                if (z92 != null) {
                    z92.a("StaticExperienceManager", "Bitmap Failure " + image.getUrl() + ServerSentEventKt.SPACE + m8082exceptionOrNullimpl.getMessage());
                }
                if (m8082exceptionOrNullimpl instanceof C3566ac) {
                    booleanRef.element = true;
                }
            }
            if (Result.m8085isFailureimpl(m8079constructorimpl)) {
                m8079constructorimpl = null;
            }
            Bitmap bitmap = (Bitmap) m8079constructorimpl;
            if (bitmap != null) {
                pair = new Pair(bitmap, image);
            }
        } while (pair == null);
        if (pair != null) {
            final ImageView imageView = this.e;
            final C3800il c3800il2 = this.c;
            return Boxing.boxBoolean(imageView.post(new Runnable() { // from class: com.inmobi.media.fl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C3716fl.a(C3800il.this, imageView, pair);
                }
            }));
        }
        Z9 z93 = this.c.e;
        if (z93 != null) {
            z93.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
        }
        C3800il c3800il3 = this.c;
        boolean z = this.d.element;
        c3800il3.getClass();
        short s = z ? (short) 81 : (short) 82;
        Map mutableMap = MapsKt.toMutableMap(AbstractC4169vm.a(c3800il3.c.b.f7310a));
        mutableMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("MainImageLoadFailure", mutableMap, EnumC3944nm.f7271a);
        throw new C3652dd();
    }
}
