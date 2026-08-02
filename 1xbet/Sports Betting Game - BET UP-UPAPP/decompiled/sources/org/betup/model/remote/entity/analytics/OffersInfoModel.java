package org.betup.model.remote.entity.analytics;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OffersInfoModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lorg/betup/model/remote/entity/analytics/OffersInfoModel;", "", "count", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OffersInfoModel {
    public static final int $stable = 0;
    private final int count;

    public static /* synthetic */ OffersInfoModel copy$default(OffersInfoModel offersInfoModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = offersInfoModel.count;
        }
        return offersInfoModel.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final OffersInfoModel copy(int count) {
        return new OffersInfoModel(count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OffersInfoModel) && this.count == ((OffersInfoModel) other).count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public String toString() {
        return "OffersInfoModel(count=" + this.count + ")";
    }

    public OffersInfoModel(int i) {
        this.count = i;
    }

    public final int getCount() {
        return this.count;
    }
}
