package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserAnalyticsTagSlugsDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lorg/betup/model/remote/entity/user/UserAnalyticsTagSlugsDto;", "", "tagSlugs", "", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "getTagSlugs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAnalyticsTagSlugsDto {
    public static final int $stable = 8;

    @SerializedName("tagSlugs")
    private final List<String> tagSlugs;

    /* JADX WARN: Multi-variable type inference failed */
    public UserAnalyticsTagSlugsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserAnalyticsTagSlugsDto copy$default(UserAnalyticsTagSlugsDto userAnalyticsTagSlugsDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userAnalyticsTagSlugsDto.tagSlugs;
        }
        return userAnalyticsTagSlugsDto.copy(list);
    }

    public final List<String> component1() {
        return this.tagSlugs;
    }

    public final UserAnalyticsTagSlugsDto copy(List<String> tagSlugs) {
        Intrinsics.checkNotNullParameter(tagSlugs, "tagSlugs");
        return new UserAnalyticsTagSlugsDto(tagSlugs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserAnalyticsTagSlugsDto) && Intrinsics.areEqual(this.tagSlugs, ((UserAnalyticsTagSlugsDto) other).tagSlugs);
    }

    public int hashCode() {
        return this.tagSlugs.hashCode();
    }

    public String toString() {
        return "UserAnalyticsTagSlugsDto(tagSlugs=" + this.tagSlugs + ")";
    }

    public UserAnalyticsTagSlugsDto(List<String> tagSlugs) {
        Intrinsics.checkNotNullParameter(tagSlugs, "tagSlugs");
        this.tagSlugs = tagSlugs;
    }

    public /* synthetic */ UserAnalyticsTagSlugsDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<String> getTagSlugs() {
        return this.tagSlugs;
    }
}
