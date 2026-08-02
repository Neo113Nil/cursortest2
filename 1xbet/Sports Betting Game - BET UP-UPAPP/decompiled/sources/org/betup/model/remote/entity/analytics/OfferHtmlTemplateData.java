package org.betup.model.remote.entity.analytics;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferHtmlTemplateData.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\t\u0010\nB]\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006+"}, d2 = {"Lorg/betup/model/remote/entity/analytics/OfferHtmlTemplateData;", "", "url", "", TtmlNode.TAG_METADATA, "", "oldPriceKeys", "", "newPriceKeys", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "getMetadata", "()Ljava/util/Map;", "getOldPriceKeys", "()Ljava/util/List;", "getNewPriceKeys", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class OfferHtmlTemplateData {

    @SerializedName(TtmlNode.TAG_METADATA)
    private final Map<String, String> metadata;

    @SerializedName("newPriceKeys")
    private final List<String> newPriceKeys;

    @SerializedName("oldPriceKeys")
    private final List<String> oldPriceKeys;

    @SerializedName("url")
    private final String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: org.betup.model.remote.entity.analytics.OfferHtmlTemplateData$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KSerializer _childSerializers$_anonymous_;
            _childSerializers$_anonymous_ = OfferHtmlTemplateData._childSerializers$_anonymous_();
            return _childSerializers$_anonymous_;
        }
    }), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: org.betup.model.remote.entity.analytics.OfferHtmlTemplateData$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KSerializer _childSerializers$_anonymous_$0;
            _childSerializers$_anonymous_$0 = OfferHtmlTemplateData._childSerializers$_anonymous_$0();
            return _childSerializers$_anonymous_$0;
        }
    }), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: org.betup.model.remote.entity.analytics.OfferHtmlTemplateData$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KSerializer _childSerializers$_anonymous_$1;
            _childSerializers$_anonymous_$1 = OfferHtmlTemplateData._childSerializers$_anonymous_$1();
            return _childSerializers$_anonymous_$1;
        }
    })};

    public OfferHtmlTemplateData() {
        this((String) null, (Map) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferHtmlTemplateData copy$default(OfferHtmlTemplateData offerHtmlTemplateData, String str, Map map, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offerHtmlTemplateData.url;
        }
        if ((i & 2) != 0) {
            map = offerHtmlTemplateData.metadata;
        }
        if ((i & 4) != 0) {
            list = offerHtmlTemplateData.oldPriceKeys;
        }
        if ((i & 8) != 0) {
            list2 = offerHtmlTemplateData.newPriceKeys;
        }
        return offerHtmlTemplateData.copy(str, map, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component2() {
        return this.metadata;
    }

    public final List<String> component3() {
        return this.oldPriceKeys;
    }

    public final List<String> component4() {
        return this.newPriceKeys;
    }

    public final OfferHtmlTemplateData copy(String url, Map<String, String> metadata, List<String> oldPriceKeys, List<String> newPriceKeys) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(oldPriceKeys, "oldPriceKeys");
        Intrinsics.checkNotNullParameter(newPriceKeys, "newPriceKeys");
        return new OfferHtmlTemplateData(url, metadata, oldPriceKeys, newPriceKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferHtmlTemplateData)) {
            return false;
        }
        OfferHtmlTemplateData offerHtmlTemplateData = (OfferHtmlTemplateData) other;
        return Intrinsics.areEqual(this.url, offerHtmlTemplateData.url) && Intrinsics.areEqual(this.metadata, offerHtmlTemplateData.metadata) && Intrinsics.areEqual(this.oldPriceKeys, offerHtmlTemplateData.oldPriceKeys) && Intrinsics.areEqual(this.newPriceKeys, offerHtmlTemplateData.newPriceKeys);
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Map<String, String> map = this.metadata;
        return ((((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.oldPriceKeys.hashCode()) * 31) + this.newPriceKeys.hashCode();
    }

    public String toString() {
        return "OfferHtmlTemplateData(url=" + this.url + ", metadata=" + this.metadata + ", oldPriceKeys=" + this.oldPriceKeys + ", newPriceKeys=" + this.newPriceKeys + ")";
    }

    /* compiled from: OfferHtmlTemplateData.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/entity/analytics/OfferHtmlTemplateData$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/model/remote/entity/analytics/OfferHtmlTemplateData;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OfferHtmlTemplateData> serializer() {
            return OfferHtmlTemplateData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OfferHtmlTemplateData(int i, String str, Map map, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.url = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map;
        }
        if ((i & 4) == 0) {
            this.oldPriceKeys = CollectionsKt.emptyList();
        } else {
            this.oldPriceKeys = list;
        }
        if ((i & 8) == 0) {
            this.newPriceKeys = CollectionsKt.emptyList();
        } else {
            this.newPriceKeys = list2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(OfferHtmlTemplateData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.url, "")) {
            output.encodeStringElement(serialDesc, 0, self.url);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.metadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.metadata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.oldPriceKeys, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.oldPriceKeys);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && Intrinsics.areEqual(self.newPriceKeys, CollectionsKt.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.newPriceKeys);
    }

    public OfferHtmlTemplateData(String url, Map<String, String> map, List<String> oldPriceKeys, List<String> newPriceKeys) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(oldPriceKeys, "oldPriceKeys");
        Intrinsics.checkNotNullParameter(newPriceKeys, "newPriceKeys");
        this.url = url;
        this.metadata = map;
        this.oldPriceKeys = oldPriceKeys;
        this.newPriceKeys = newPriceKeys;
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ OfferHtmlTemplateData(String str, Map map, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final List<String> getOldPriceKeys() {
        return this.oldPriceKeys;
    }

    public final List<String> getNewPriceKeys() {
        return this.newPriceKeys;
    }
}
