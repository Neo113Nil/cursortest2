package org.betup.model.remote.entity.analytics;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchAd.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u00061"}, d2 = {"Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", "", "id", "", "name", "linkId", "", "linkType", "expirationDate", UnifiedMediationParams.KEY_IMAGE_URL, "linkName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getName", "getLinkId", "()I", "getLinkType", "getExpirationDate", "getImageUrl", "getLinkName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class HomeMatchAd {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("expirationDate")
    private final String expirationDate;

    @SerializedName("id")
    private final String id;

    @SerializedName(UnifiedMediationParams.KEY_IMAGE_URL)
    private final String imageUrl;

    @SerializedName("linkId")
    private final int linkId;

    @SerializedName("linkName")
    private final String linkName;

    @SerializedName("linkType")
    private final int linkType;

    @SerializedName("name")
    private final String name;

    public static /* synthetic */ HomeMatchAd copy$default(HomeMatchAd homeMatchAd, String str, String str2, int i, int i2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = homeMatchAd.id;
        }
        if ((i3 & 2) != 0) {
            str2 = homeMatchAd.name;
        }
        String str6 = str2;
        if ((i3 & 4) != 0) {
            i = homeMatchAd.linkId;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = homeMatchAd.linkType;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = homeMatchAd.expirationDate;
        }
        String str7 = str3;
        if ((i3 & 32) != 0) {
            str4 = homeMatchAd.imageUrl;
        }
        String str8 = str4;
        if ((i3 & 64) != 0) {
            str5 = homeMatchAd.linkName;
        }
        return homeMatchAd.copy(str, str6, i4, i5, str7, str8, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLinkId() {
        return this.linkId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLinkType() {
        return this.linkType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLinkName() {
        return this.linkName;
    }

    public final HomeMatchAd copy(String id, String name, int linkId, int linkType, String expirationDate, String imageUrl, String linkName) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new HomeMatchAd(id, name, linkId, linkType, expirationDate, imageUrl, linkName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMatchAd)) {
            return false;
        }
        HomeMatchAd homeMatchAd = (HomeMatchAd) other;
        return Intrinsics.areEqual(this.id, homeMatchAd.id) && Intrinsics.areEqual(this.name, homeMatchAd.name) && this.linkId == homeMatchAd.linkId && this.linkType == homeMatchAd.linkType && Intrinsics.areEqual(this.expirationDate, homeMatchAd.expirationDate) && Intrinsics.areEqual(this.imageUrl, homeMatchAd.imageUrl) && Intrinsics.areEqual(this.linkName, homeMatchAd.linkName);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.linkId)) * 31) + Integer.hashCode(this.linkType)) * 31;
        String str2 = this.expirationDate;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.imageUrl.hashCode()) * 31;
        String str3 = this.linkName;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "HomeMatchAd(id=" + this.id + ", name=" + this.name + ", linkId=" + this.linkId + ", linkType=" + this.linkType + ", expirationDate=" + this.expirationDate + ", imageUrl=" + this.imageUrl + ", linkName=" + this.linkName + ")";
    }

    /* compiled from: HomeMatchAd.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/analytics/HomeMatchAd$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeMatchAd> serializer() {
            return HomeMatchAd$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeMatchAd(int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (124 != (i & 124)) {
            PluginExceptionsKt.throwMissingFieldException(i, 124, HomeMatchAd$$serializer.INSTANCE.getDescriptor());
        }
        this.id = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        this.linkId = i2;
        this.linkType = i3;
        this.expirationDate = str3;
        this.imageUrl = str4;
        this.linkName = str5;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(HomeMatchAd self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.name, "")) {
            output.encodeStringElement(serialDesc, 1, self.name);
        }
        output.encodeIntElement(serialDesc, 2, self.linkId);
        output.encodeIntElement(serialDesc, 3, self.linkType);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.expirationDate);
        output.encodeStringElement(serialDesc, 5, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.linkName);
    }

    public HomeMatchAd(String str, String name, int i, int i2, String str2, String imageUrl, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.id = str;
        this.name = name;
        this.linkId = i;
        this.linkType = i2;
        this.expirationDate = str2;
        this.imageUrl = imageUrl;
        this.linkName = str3;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ HomeMatchAd(String str, String str2, int i, int i2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? "" : str2, i, i2, str3, str4, str5);
    }

    public final String getName() {
        return this.name;
    }

    public final int getLinkId() {
        return this.linkId;
    }

    public final int getLinkType() {
        return this.linkType;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLinkName() {
        return this.linkName;
    }
}
