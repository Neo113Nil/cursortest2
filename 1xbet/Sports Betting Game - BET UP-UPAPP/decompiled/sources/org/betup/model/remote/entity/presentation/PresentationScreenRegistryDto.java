package org.betup.model.remote.entity.presentation;

import com.ironsource.C3731tg;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationScreenRegistryDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u001b\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J[\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lorg/betup/model/remote/entity/presentation/PresentationScreenRegistryDto;", "", "version", "", "screens", "", "Lorg/betup/model/remote/entity/presentation/PresentationScreenMappingDto;", "groups", "", "", "ignoredClassNames", "updatedAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", C3731tg.b, "()I", "getScreens", "()Ljava/util/List;", "getGroups", "()Ljava/util/Map;", "getIgnoredClassNames", "getUpdatedAt", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PresentationScreenRegistryDto {
    public static final int $stable = 8;
    private final Map<String, List<String>> groups;
    private final List<String> ignoredClassNames;
    private final List<PresentationScreenMappingDto> screens;
    private final String updatedAt;
    private final int version;

    public PresentationScreenRegistryDto() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PresentationScreenRegistryDto copy$default(PresentationScreenRegistryDto presentationScreenRegistryDto, int i, List list, Map map, List list2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = presentationScreenRegistryDto.version;
        }
        if ((i2 & 2) != 0) {
            list = presentationScreenRegistryDto.screens;
        }
        List list3 = list;
        if ((i2 & 4) != 0) {
            map = presentationScreenRegistryDto.groups;
        }
        Map map2 = map;
        if ((i2 & 8) != 0) {
            list2 = presentationScreenRegistryDto.ignoredClassNames;
        }
        List list4 = list2;
        if ((i2 & 16) != 0) {
            str = presentationScreenRegistryDto.updatedAt;
        }
        return presentationScreenRegistryDto.copy(i, list3, map2, list4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final List<PresentationScreenMappingDto> component2() {
        return this.screens;
    }

    public final Map<String, List<String>> component3() {
        return this.groups;
    }

    public final List<String> component4() {
        return this.ignoredClassNames;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final PresentationScreenRegistryDto copy(int version, List<PresentationScreenMappingDto> screens, Map<String, ? extends List<String>> groups, List<String> ignoredClassNames, String updatedAt) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(ignoredClassNames, "ignoredClassNames");
        return new PresentationScreenRegistryDto(version, screens, groups, ignoredClassNames, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresentationScreenRegistryDto)) {
            return false;
        }
        PresentationScreenRegistryDto presentationScreenRegistryDto = (PresentationScreenRegistryDto) other;
        return this.version == presentationScreenRegistryDto.version && Intrinsics.areEqual(this.screens, presentationScreenRegistryDto.screens) && Intrinsics.areEqual(this.groups, presentationScreenRegistryDto.groups) && Intrinsics.areEqual(this.ignoredClassNames, presentationScreenRegistryDto.ignoredClassNames) && Intrinsics.areEqual(this.updatedAt, presentationScreenRegistryDto.updatedAt);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.version) * 31) + this.screens.hashCode()) * 31) + this.groups.hashCode()) * 31) + this.ignoredClassNames.hashCode()) * 31;
        String str = this.updatedAt;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PresentationScreenRegistryDto(version=" + this.version + ", screens=" + this.screens + ", groups=" + this.groups + ", ignoredClassNames=" + this.ignoredClassNames + ", updatedAt=" + this.updatedAt + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PresentationScreenRegistryDto(int i, List<PresentationScreenMappingDto> screens, Map<String, ? extends List<String>> groups, List<String> ignoredClassNames, String str) {
        Intrinsics.checkNotNullParameter(screens, "screens");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(ignoredClassNames, "ignoredClassNames");
        this.version = i;
        this.screens = screens;
        this.groups = groups;
        this.ignoredClassNames = ignoredClassNames;
        this.updatedAt = str;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ PresentationScreenRegistryDto(int i, List list, Map map, List list2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? MapsKt.emptyMap() : map, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 16) != 0 ? null : str);
    }

    public final List<PresentationScreenMappingDto> getScreens() {
        return this.screens;
    }

    public final Map<String, List<String>> getGroups() {
        return this.groups;
    }

    public final List<String> getIgnoredClassNames() {
        return this.ignoredClassNames;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }
}
