package org.betup.model.remote.entity.presentation;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationScreenRegistryDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/betup/model/remote/entity/presentation/PresentationScreenMappingDto;", "", "className", "", "screenKey", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getScreenKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PresentationScreenMappingDto {
    public static final int $stable = 0;

    @SerializedName("className")
    private final String className;
    private final String screenKey;

    /* JADX WARN: Multi-variable type inference failed */
    public PresentationScreenMappingDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PresentationScreenMappingDto copy$default(PresentationScreenMappingDto presentationScreenMappingDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentationScreenMappingDto.className;
        }
        if ((i & 2) != 0) {
            str2 = presentationScreenMappingDto.screenKey;
        }
        return presentationScreenMappingDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScreenKey() {
        return this.screenKey;
    }

    public final PresentationScreenMappingDto copy(String className, String screenKey) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        return new PresentationScreenMappingDto(className, screenKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PresentationScreenMappingDto)) {
            return false;
        }
        PresentationScreenMappingDto presentationScreenMappingDto = (PresentationScreenMappingDto) other;
        return Intrinsics.areEqual(this.className, presentationScreenMappingDto.className) && Intrinsics.areEqual(this.screenKey, presentationScreenMappingDto.screenKey);
    }

    public int hashCode() {
        return (this.className.hashCode() * 31) + this.screenKey.hashCode();
    }

    public String toString() {
        return "PresentationScreenMappingDto(className=" + this.className + ", screenKey=" + this.screenKey + ")";
    }

    public PresentationScreenMappingDto(String className, String screenKey) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        this.className = className;
        this.screenKey = screenKey;
    }

    public /* synthetic */ PresentationScreenMappingDto(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getScreenKey() {
        return this.screenKey;
    }
}
