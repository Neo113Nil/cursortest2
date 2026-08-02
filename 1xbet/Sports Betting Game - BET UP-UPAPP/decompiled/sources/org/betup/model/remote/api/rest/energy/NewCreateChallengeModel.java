package org.betup.model.remote.api.rest.energy;

import com.google.gson.annotations.SerializedName;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewCreateChallengeModel.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lorg/betup/model/remote/api/rest/energy/NewCreateChallengeModel;", "", "moneyPlaced", "", "grabbedBetId", "isPrivate", "", "invitedUsers", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJZLjava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMoneyPlaced", "()J", "getGrabbedBetId", "()Z", "getInvitedUsers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class NewCreateChallengeModel {

    @SerializedName("grabbed_bet_id")
    private final long grabbedBetId;

    @SerializedName("invited_users")
    private final List<Long> invitedUsers;

    @SerializedName("is_private")
    private final boolean isPrivate;

    @SerializedName("money_placed")
    private final long moneyPlaced;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: org.betup.model.remote.api.rest.energy.NewCreateChallengeModel$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            KSerializer _childSerializers$_anonymous_;
            _childSerializers$_anonymous_ = NewCreateChallengeModel._childSerializers$_anonymous_();
            return _childSerializers$_anonymous_;
        }
    })};

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LongSerializer.INSTANCE);
    }

    public static /* synthetic */ NewCreateChallengeModel copy$default(NewCreateChallengeModel newCreateChallengeModel, long j, long j2, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = newCreateChallengeModel.moneyPlaced;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = newCreateChallengeModel.grabbedBetId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = newCreateChallengeModel.isPrivate;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            list = newCreateChallengeModel.invitedUsers;
        }
        return newCreateChallengeModel.copy(j3, j4, z2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    /* renamed from: component2, reason: from getter */
    public final long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    public final List<Long> component4() {
        return this.invitedUsers;
    }

    public final NewCreateChallengeModel copy(long moneyPlaced, long grabbedBetId, boolean isPrivate, List<Long> invitedUsers) {
        Intrinsics.checkNotNullParameter(invitedUsers, "invitedUsers");
        return new NewCreateChallengeModel(moneyPlaced, grabbedBetId, isPrivate, invitedUsers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCreateChallengeModel)) {
            return false;
        }
        NewCreateChallengeModel newCreateChallengeModel = (NewCreateChallengeModel) other;
        return this.moneyPlaced == newCreateChallengeModel.moneyPlaced && this.grabbedBetId == newCreateChallengeModel.grabbedBetId && this.isPrivate == newCreateChallengeModel.isPrivate && Intrinsics.areEqual(this.invitedUsers, newCreateChallengeModel.invitedUsers);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.moneyPlaced) * 31) + Long.hashCode(this.grabbedBetId)) * 31) + Boolean.hashCode(this.isPrivate)) * 31) + this.invitedUsers.hashCode();
    }

    public String toString() {
        return "NewCreateChallengeModel(moneyPlaced=" + this.moneyPlaced + ", grabbedBetId=" + this.grabbedBetId + ", isPrivate=" + this.isPrivate + ", invitedUsers=" + this.invitedUsers + ")";
    }

    /* compiled from: NewCreateChallengeModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/model/remote/api/rest/energy/NewCreateChallengeModel$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/model/remote/api/rest/energy/NewCreateChallengeModel;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCreateChallengeModel> serializer() {
            return NewCreateChallengeModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewCreateChallengeModel(int i, long j, long j2, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, NewCreateChallengeModel$$serializer.INSTANCE.getDescriptor());
        }
        this.moneyPlaced = j;
        this.grabbedBetId = j2;
        if ((i & 4) == 0) {
            this.isPrivate = false;
        } else {
            this.isPrivate = z;
        }
        if ((i & 8) == 0) {
            this.invitedUsers = CollectionsKt.emptyList();
        } else {
            this.invitedUsers = list;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_release(NewCreateChallengeModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        output.encodeLongElement(serialDesc, 0, self.moneyPlaced);
        output.encodeLongElement(serialDesc, 1, self.grabbedBetId);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isPrivate) {
            output.encodeBooleanElement(serialDesc, 2, self.isPrivate);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && Intrinsics.areEqual(self.invitedUsers, CollectionsKt.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.invitedUsers);
    }

    public NewCreateChallengeModel(long j, long j2, boolean z, List<Long> invitedUsers) {
        Intrinsics.checkNotNullParameter(invitedUsers, "invitedUsers");
        this.moneyPlaced = j;
        this.grabbedBetId = j2;
        this.isPrivate = z;
        this.invitedUsers = invitedUsers;
    }

    public final long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public final long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final List<Long> getInvitedUsers() {
        return this.invitedUsers;
    }

    public /* synthetic */ NewCreateChallengeModel(long j, long j2, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }
}
