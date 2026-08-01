package com.chartboost.sdk.internal.Model.openrtb26;

import com.chartboost.sdk.internal.Model.openrtb26.App;
import com.chartboost.sdk.internal.Model.openrtb26.Device;
import com.chartboost.sdk.internal.Model.openrtb26.Imp;
import com.chartboost.sdk.internal.Model.openrtb26.Regs;
import com.chartboost.sdk.internal.Model.openrtb26.User;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBQ\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B[\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)JZ\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b/\u0010'J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010%R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010A\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010'R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010D\u0012\u0004\bF\u00107\u001a\u0004\bE\u0010)¨\u0006I"}, d2 = {"Lcom/chartboost/sdk/internal/Model/openrtb26/BidRequest;", "", "", "Lcom/chartboost/sdk/internal/Model/openrtb26/Imp;", "imp", "Lcom/chartboost/sdk/internal/Model/openrtb26/App;", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "Lcom/chartboost/sdk/internal/Model/openrtb26/Device;", "device", "Lcom/chartboost/sdk/internal/Model/openrtb26/User;", "user", "", "test", "Lcom/chartboost/sdk/internal/Model/openrtb26/Regs;", "regs", "<init>", "(Ljava/util/List;Lcom/chartboost/sdk/internal/Model/openrtb26/App;Lcom/chartboost/sdk/internal/Model/openrtb26/Device;Lcom/chartboost/sdk/internal/Model/openrtb26/User;ILcom/chartboost/sdk/internal/Model/openrtb26/Regs;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/chartboost/sdk/internal/Model/openrtb26/App;Lcom/chartboost/sdk/internal/Model/openrtb26/Device;Lcom/chartboost/sdk/internal/Model/openrtb26/User;ILcom/chartboost/sdk/internal/Model/openrtb26/Regs;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ChartboostMonetization_9_13_0_release", "(Lcom/chartboost/sdk/internal/Model/openrtb26/BidRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/chartboost/sdk/internal/Model/openrtb26/App;", "component3", "()Lcom/chartboost/sdk/internal/Model/openrtb26/Device;", "component4", "()Lcom/chartboost/sdk/internal/Model/openrtb26/User;", "component5", "()I", "component6", "()Lcom/chartboost/sdk/internal/Model/openrtb26/Regs;", "copy", "(Ljava/util/List;Lcom/chartboost/sdk/internal/Model/openrtb26/App;Lcom/chartboost/sdk/internal/Model/openrtb26/Device;Lcom/chartboost/sdk/internal/Model/openrtb26/User;ILcom/chartboost/sdk/internal/Model/openrtb26/Regs;)Lcom/chartboost/sdk/internal/Model/openrtb26/BidRequest;", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getImp", "getImp$annotations", "()V", "Lcom/chartboost/sdk/internal/Model/openrtb26/App;", "getApp", "getApp$annotations", "Lcom/chartboost/sdk/internal/Model/openrtb26/Device;", "getDevice", "getDevice$annotations", "Lcom/chartboost/sdk/internal/Model/openrtb26/User;", "getUser", "getUser$annotations", "I", "getTest", "getTest$annotations", "Lcom/chartboost/sdk/internal/Model/openrtb26/Regs;", "getRegs", "getRegs$annotations", k.M, "a", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class BidRequest {
    private final App app;
    private final Device device;
    private final List<Imp> imp;
    private final Regs regs;
    private final int test;
    private final User user;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Imp.a.f5116a), null, null, null, null, null};

    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<BidRequest> serializer() {
            return a.f5112a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BidRequest() {
        this((List) null, (App) null, (Device) null, (User) null, 0, (Regs) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BidRequest copy$default(BidRequest bidRequest, List list, App app, Device device, User user, int i, Regs regs, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = bidRequest.imp;
        }
        if ((i2 & 2) != 0) {
            app = bidRequest.app;
        }
        App app2 = app;
        if ((i2 & 4) != 0) {
            device = bidRequest.device;
        }
        Device device2 = device;
        if ((i2 & 8) != 0) {
            user = bidRequest.user;
        }
        User user2 = user;
        if ((i2 & 16) != 0) {
            i = bidRequest.test;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            regs = bidRequest.regs;
        }
        return bidRequest.copy(list, app2, device2, user2, i3, regs);
    }

    @SerialName(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    public static /* synthetic */ void getApp$annotations() {
    }

    @SerialName("device")
    public static /* synthetic */ void getDevice$annotations() {
    }

    @SerialName("imp")
    public static /* synthetic */ void getImp$annotations() {
    }

    @SerialName("regs")
    public static /* synthetic */ void getRegs$annotations() {
    }

    @SerialName("test")
    public static /* synthetic */ void getTest$annotations() {
    }

    @SerialName("user")
    public static /* synthetic */ void getUser$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$ChartboostMonetization_9_13_0_release(BidRequest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.imp, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.imp);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.app != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, App.a.f5109a, self.app);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.device != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Device.a.f5114a, self.device);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.user != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, User.a.f5118a, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.test != 0) {
            output.encodeIntElement(serialDesc, 4, self.test);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.regs == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, Regs.a.f5117a, self.regs);
    }

    public final List<Imp> component1() {
        return this.imp;
    }

    /* renamed from: component2, reason: from getter */
    public final App getApp() {
        return this.app;
    }

    /* renamed from: component3, reason: from getter */
    public final Device getDevice() {
        return this.device;
    }

    /* renamed from: component4, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTest() {
        return this.test;
    }

    /* renamed from: component6, reason: from getter */
    public final Regs getRegs() {
        return this.regs;
    }

    public final BidRequest copy(List<Imp> imp, App app, Device device, User user, int test, Regs regs) {
        Intrinsics.checkNotNullParameter(imp, "imp");
        return new BidRequest(imp, app, device, user, test, regs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidRequest)) {
            return false;
        }
        BidRequest bidRequest = (BidRequest) other;
        return Intrinsics.areEqual(this.imp, bidRequest.imp) && Intrinsics.areEqual(this.app, bidRequest.app) && Intrinsics.areEqual(this.device, bidRequest.device) && Intrinsics.areEqual(this.user, bidRequest.user) && this.test == bidRequest.test && Intrinsics.areEqual(this.regs, bidRequest.regs);
    }

    public final App getApp() {
        return this.app;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final List<Imp> getImp() {
        return this.imp;
    }

    public final Regs getRegs() {
        return this.regs;
    }

    public final int getTest() {
        return this.test;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = this.imp.hashCode() * 31;
        App app = this.app;
        int hashCode2 = (hashCode + (app == null ? 0 : app.hashCode())) * 31;
        Device device = this.device;
        int hashCode3 = (hashCode2 + (device == null ? 0 : device.hashCode())) * 31;
        User user = this.user;
        int hashCode4 = (((hashCode3 + (user == null ? 0 : user.hashCode())) * 31) + Integer.hashCode(this.test)) * 31;
        Regs regs = this.regs;
        return hashCode4 + (regs != null ? regs.hashCode() : 0);
    }

    public String toString() {
        return "BidRequest(imp=" + this.imp + ", app=" + this.app + ", device=" + this.device + ", user=" + this.user + ", test=" + this.test + ", regs=" + this.regs + ")";
    }

    public /* synthetic */ BidRequest(int i, List list, App app, Device device, User user, int i2, Regs regs, SerializationConstructorMarker serializationConstructorMarker) {
        this.imp = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            this.app = null;
        } else {
            this.app = app;
        }
        if ((i & 4) == 0) {
            this.device = null;
        } else {
            this.device = device;
        }
        if ((i & 8) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i & 16) == 0) {
            this.test = 0;
        } else {
            this.test = i2;
        }
        if ((i & 32) == 0) {
            this.regs = null;
        } else {
            this.regs = regs;
        }
    }

    public BidRequest(List<Imp> imp, App app, Device device, User user, int i, Regs regs) {
        Intrinsics.checkNotNullParameter(imp, "imp");
        this.imp = imp;
        this.app = app;
        this.device = device;
        this.user = user;
        this.test = i;
        this.regs = regs;
    }

    public /* synthetic */ BidRequest(List list, App app, Device device, User user, int i, Regs regs, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? null : app, (i2 & 4) != 0 ? null : device, (i2 & 8) != 0 ? null : user, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? regs : null);
    }
}
