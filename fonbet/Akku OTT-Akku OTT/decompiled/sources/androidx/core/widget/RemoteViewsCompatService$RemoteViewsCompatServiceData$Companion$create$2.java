package androidx.core.widget;

import android.os.Parcel;
import androidx.core.widget.RemoteViewsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$create$2 extends FunctionReferenceImpl implements Function2<Parcel, Integer, Unit> {
    public RemoteViewsCompatService$RemoteViewsCompatServiceData$Companion$create$2(Object obj) {
        super(2, obj, RemoteViewsCompat.RemoteCollectionItems.class, "writeToParcel", "writeToParcel$core_remoteviews_release(Landroid/os/Parcel;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Parcel parcel, Integer num) {
        invoke(parcel, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Parcel p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((RemoteViewsCompat.RemoteCollectionItems) this.receiver).writeToParcel$core_remoteviews_release(p0, i);
    }
}
