package org.betup.model.remote.api.rest.flashbet;

import com.vk.sdk.api.model.VKAttachments;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GetFlashBetStatsInteractor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/betup/model/remote/api/rest/flashbet/FlashBetStatsParams;", "", VKAttachments.TYPE_WIKI_PAGE, "", RRWebVideoEvent.JsonKeys.SIZE, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(II)V", "getPage", "()I", "getSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetStatsParams {
    public static final int $stable = 0;
    private final int page;
    private final int size;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FlashBetStatsParams() {
        this(r2, r2, 3, null);
        int i = 0;
    }

    public static /* synthetic */ FlashBetStatsParams copy$default(FlashBetStatsParams flashBetStatsParams, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = flashBetStatsParams.page;
        }
        if ((i3 & 2) != 0) {
            i2 = flashBetStatsParams.size;
        }
        return flashBetStatsParams.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final FlashBetStatsParams copy(int page, int size) {
        return new FlashBetStatsParams(page, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetStatsParams)) {
            return false;
        }
        FlashBetStatsParams flashBetStatsParams = (FlashBetStatsParams) other;
        return this.page == flashBetStatsParams.page && this.size == flashBetStatsParams.size;
    }

    public int hashCode() {
        return (Integer.hashCode(this.page) * 31) + Integer.hashCode(this.size);
    }

    public String toString() {
        return "FlashBetStatsParams(page=" + this.page + ", size=" + this.size + ")";
    }

    public FlashBetStatsParams(int i, int i2) {
        this.page = i;
        this.size = i2;
    }

    public /* synthetic */ FlashBetStatsParams(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 20 : i2);
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSize() {
        return this.size;
    }
}
