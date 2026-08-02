package androidx.glance.appwidget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class AndroidRemoteViewsKt$AndroidRemoteViews$2 extends FunctionReferenceImpl implements Function0<EmittableAndroidRemoteViews> {
    public static final AndroidRemoteViewsKt$AndroidRemoteViews$2 INSTANCE = new AndroidRemoteViewsKt$AndroidRemoteViews$2();

    public AndroidRemoteViewsKt$AndroidRemoteViews$2() {
        super(0, EmittableAndroidRemoteViews.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EmittableAndroidRemoteViews invoke() {
        return new EmittableAndroidRemoteViews();
    }
}
