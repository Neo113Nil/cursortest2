package org.betup.ui.dialogs.offer;

import android.content.Context;
import androidx.viewbinding.ViewBinding;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonClassDiscriminator;
import org.betup.ui.dialogs.offer.OfferFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferFragment.kt */
@JsonClassDiscriminator(discriminator = "type")
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 #2\u00020\u0001:\u0002\"#J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J>\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180!H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000b8&X§\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000b8&X§\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f\u0082\u0001\u0001$¨\u0006%"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContent;", "", "id", "", "getId", "()Ljava/lang/String;", "layoutParams", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", "getLayoutParams", "()Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", "viewId", "", "getViewId$annotations", "()V", "getViewId", "()I", "viewLayoutId", "getViewLayoutId$annotations", "getViewLayoutId", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "context", "Landroid/content/Context;", "bind", "", "builder", "Lorg/betup/ui/dialogs/offer/OfferFragment$Builder;", "init", "parentLayoutId", "scaleXRatio", "", "scaleYRatio", "onDismissDialog", "Lkotlin/Function0;", "LayoutParams", VastTagName.COMPANION, "Lorg/betup/ui/dialogs/offer/OfferItemContentImpl;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public interface OfferItemContent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: OfferFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Transient
        public static /* synthetic */ void getViewId$annotations() {
        }

        @Transient
        public static /* synthetic */ void getViewLayoutId$annotations() {
        }
    }

    void bind(OfferFragment.Builder builder);

    String getId();

    LayoutParams getLayoutParams();

    int getViewId();

    int getViewLayoutId();

    ViewBinding init(OfferFragment.Builder builder, Context context, int parentLayoutId, float scaleXRatio, float scaleYRatio, Function0<Unit> onDismissDialog);

    ViewBinding viewBinding(Context context);

    /* compiled from: OfferFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContent$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/dialogs/offer/OfferItemContent;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<OfferItemContent> serializer() {
            return new SealedClassSerializer("org.betup.ui.dialogs.offer.OfferItemContent", Reflection.getOrCreateKotlinClass(OfferItemContent.class), new KClass[]{Reflection.getOrCreateKotlinClass(BetcoinContent.class), Reflection.getOrCreateKotlinClass(ButtonContent.class), Reflection.getOrCreateKotlinClass(PriceContent.class), Reflection.getOrCreateKotlinClass(TimerContent.class)}, new KSerializer[]{BetcoinContent$$serializer.INSTANCE, ButtonContent$$serializer.INSTANCE, PriceContent$$serializer.INSTANCE, TimerContent$$serializer.INSTANCE}, new Annotation[]{new OfferItemContent$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("type")});
        }
    }

    /* compiled from: OfferFragment.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0004&'()B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006*"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", "", "margins", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Margins;", "constraints", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Constraints;", "viewId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Margins;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Constraints;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Margins;Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Constraints;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMargins", "()Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Margins;", "getConstraints", "()Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Constraints;", "getViewId", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "Margins", androidx.constraintlayout.widget.Constraints.TAG, "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class LayoutParams {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Constraints constraints;
        private final Margins margins;
        private final int viewId;

        public static /* synthetic */ LayoutParams copy$default(LayoutParams layoutParams, Margins margins, Constraints constraints, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                margins = layoutParams.margins;
            }
            if ((i2 & 2) != 0) {
                constraints = layoutParams.constraints;
            }
            if ((i2 & 4) != 0) {
                i = layoutParams.viewId;
            }
            return layoutParams.copy(margins, constraints, i);
        }

        /* renamed from: component1, reason: from getter */
        public final Margins getMargins() {
            return this.margins;
        }

        /* renamed from: component2, reason: from getter */
        public final Constraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: component3, reason: from getter */
        public final int getViewId() {
            return this.viewId;
        }

        public final LayoutParams copy(Margins margins, Constraints constraints, int viewId) {
            Intrinsics.checkNotNullParameter(margins, "margins");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            return new LayoutParams(margins, constraints, viewId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LayoutParams)) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) other;
            return Intrinsics.areEqual(this.margins, layoutParams.margins) && Intrinsics.areEqual(this.constraints, layoutParams.constraints) && this.viewId == layoutParams.viewId;
        }

        public int hashCode() {
            return (((this.margins.hashCode() * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.viewId);
        }

        public String toString() {
            return "LayoutParams(margins=" + this.margins + ", constraints=" + this.constraints + ", viewId=" + this.viewId + ")";
        }

        /* compiled from: OfferFragment.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<LayoutParams> serializer() {
                return OfferItemContent$LayoutParams$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ LayoutParams(int i, Margins margins, Constraints constraints, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, OfferItemContent$LayoutParams$$serializer.INSTANCE.getDescriptor());
            }
            this.margins = margins;
            this.constraints = constraints;
            this.viewId = i2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$app_release(LayoutParams self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, OfferItemContent$LayoutParams$Margins$$serializer.INSTANCE, self.margins);
            output.encodeSerializableElement(serialDesc, 1, OfferItemContent$LayoutParams$Constraints$$serializer.INSTANCE, self.constraints);
            output.encodeIntElement(serialDesc, 2, self.viewId);
        }

        public LayoutParams(Margins margins, Constraints constraints, int i) {
            Intrinsics.checkNotNullParameter(margins, "margins");
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.margins = margins;
            this.constraints = constraints;
            this.viewId = i;
        }

        /* compiled from: OfferFragment.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006'"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Margins;", "", TtmlNode.START, "", TtmlNode.END, "top", "bottom", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIII)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStart", "()I", "getEnd", "getTop", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Margins {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int bottom;
            private final int end;
            private final int start;
            private final int top;

            public Margins() {
                this(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Margins copy$default(Margins margins, int i, int i2, int i3, int i4, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    i = margins.start;
                }
                if ((i5 & 2) != 0) {
                    i2 = margins.end;
                }
                if ((i5 & 4) != 0) {
                    i3 = margins.top;
                }
                if ((i5 & 8) != 0) {
                    i4 = margins.bottom;
                }
                return margins.copy(i, i2, i3, i4);
            }

            /* renamed from: component1, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            /* renamed from: component2, reason: from getter */
            public final int getEnd() {
                return this.end;
            }

            /* renamed from: component3, reason: from getter */
            public final int getTop() {
                return this.top;
            }

            /* renamed from: component4, reason: from getter */
            public final int getBottom() {
                return this.bottom;
            }

            public final Margins copy(int start, int end, int top, int bottom) {
                return new Margins(start, end, top, bottom);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Margins)) {
                    return false;
                }
                Margins margins = (Margins) other;
                return this.start == margins.start && this.end == margins.end && this.top == margins.top && this.bottom == margins.bottom;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.bottom);
            }

            public String toString() {
                return "Margins(start=" + this.start + ", end=" + this.end + ", top=" + this.top + ", bottom=" + this.bottom + ")";
            }

            /* compiled from: OfferFragment.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Margins$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Margins;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Margins> serializer() {
                    return OfferItemContent$LayoutParams$Margins$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Margins(int i, int i2, int i3, int i4, int i5, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.start = 0;
                } else {
                    this.start = i2;
                }
                if ((i & 2) == 0) {
                    this.end = 0;
                } else {
                    this.end = i3;
                }
                if ((i & 4) == 0) {
                    this.top = 0;
                } else {
                    this.top = i4;
                }
                if ((i & 8) == 0) {
                    this.bottom = 0;
                } else {
                    this.bottom = i5;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$app_release(Margins self, CompositeEncoder output, SerialDescriptor serialDesc) {
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.start != 0) {
                    output.encodeIntElement(serialDesc, 0, self.start);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.end != 0) {
                    output.encodeIntElement(serialDesc, 1, self.end);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.top != 0) {
                    output.encodeIntElement(serialDesc, 2, self.top);
                }
                if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.bottom == 0) {
                    return;
                }
                output.encodeIntElement(serialDesc, 3, self.bottom);
            }

            public Margins(int i, int i2, int i3, int i4) {
                this.start = i;
                this.end = i2;
                this.top = i3;
                this.bottom = i4;
            }

            public /* synthetic */ Margins(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
                this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
            }

            public final int getBottom() {
                return this.bottom;
            }

            public final int getEnd() {
                return this.end;
            }

            public final int getStart() {
                return this.start;
            }

            public final int getTop() {
                return this.top;
            }
        }

        public final Constraints getConstraints() {
            return this.constraints;
        }

        public final Margins getMargins() {
            return this.margins;
        }

        public final int getViewId() {
            return this.viewId;
        }

        /* compiled from: OfferFragment.kt */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB{\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J}\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0011HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u0006;"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Constraints;", "", "startToEndId", "", "endToStartId", "topToBottomId", "bottomToTopId", "topToTopId", "bottomToBottomId", "startToStartId", "endToEndId", "verticalBias", "", "horizontalBias", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FF)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStartToEndId", "()Ljava/lang/String;", "getEndToStartId", "getTopToBottomId", "getBottomToTopId", "getTopToTopId", "getBottomToBottomId", "getStartToStartId", "getEndToEndId", "getVerticalBias", "()F", "getHorizontalBias", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Constraints {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String bottomToBottomId;
            private final String bottomToTopId;
            private final String endToEndId;
            private final String endToStartId;
            private final float horizontalBias;
            private final String startToEndId;
            private final String startToStartId;
            private final String topToBottomId;
            private final String topToTopId;
            private final float verticalBias;

            /* renamed from: component1, reason: from getter */
            public final String getStartToEndId() {
                return this.startToEndId;
            }

            /* renamed from: component10, reason: from getter */
            public final float getHorizontalBias() {
                return this.horizontalBias;
            }

            /* renamed from: component2, reason: from getter */
            public final String getEndToStartId() {
                return this.endToStartId;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTopToBottomId() {
                return this.topToBottomId;
            }

            /* renamed from: component4, reason: from getter */
            public final String getBottomToTopId() {
                return this.bottomToTopId;
            }

            /* renamed from: component5, reason: from getter */
            public final String getTopToTopId() {
                return this.topToTopId;
            }

            /* renamed from: component6, reason: from getter */
            public final String getBottomToBottomId() {
                return this.bottomToBottomId;
            }

            /* renamed from: component7, reason: from getter */
            public final String getStartToStartId() {
                return this.startToStartId;
            }

            /* renamed from: component8, reason: from getter */
            public final String getEndToEndId() {
                return this.endToEndId;
            }

            /* renamed from: component9, reason: from getter */
            public final float getVerticalBias() {
                return this.verticalBias;
            }

            public final Constraints copy(String startToEndId, String endToStartId, String topToBottomId, String bottomToTopId, String topToTopId, String bottomToBottomId, String startToStartId, String endToEndId, float verticalBias, float horizontalBias) {
                return new Constraints(startToEndId, endToStartId, topToBottomId, bottomToTopId, topToTopId, bottomToBottomId, startToStartId, endToEndId, verticalBias, horizontalBias);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Constraints)) {
                    return false;
                }
                Constraints constraints = (Constraints) other;
                return Intrinsics.areEqual(this.startToEndId, constraints.startToEndId) && Intrinsics.areEqual(this.endToStartId, constraints.endToStartId) && Intrinsics.areEqual(this.topToBottomId, constraints.topToBottomId) && Intrinsics.areEqual(this.bottomToTopId, constraints.bottomToTopId) && Intrinsics.areEqual(this.topToTopId, constraints.topToTopId) && Intrinsics.areEqual(this.bottomToBottomId, constraints.bottomToBottomId) && Intrinsics.areEqual(this.startToStartId, constraints.startToStartId) && Intrinsics.areEqual(this.endToEndId, constraints.endToEndId) && Float.compare(this.verticalBias, constraints.verticalBias) == 0 && Float.compare(this.horizontalBias, constraints.horizontalBias) == 0;
            }

            public int hashCode() {
                String str = this.startToEndId;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.endToStartId;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.topToBottomId;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.bottomToTopId;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.topToTopId;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.bottomToBottomId;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.startToStartId;
                int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.endToEndId;
                return ((((hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + Float.hashCode(this.verticalBias)) * 31) + Float.hashCode(this.horizontalBias);
            }

            public String toString() {
                return "Constraints(startToEndId=" + this.startToEndId + ", endToStartId=" + this.endToStartId + ", topToBottomId=" + this.topToBottomId + ", bottomToTopId=" + this.bottomToTopId + ", topToTopId=" + this.topToTopId + ", bottomToBottomId=" + this.bottomToBottomId + ", startToStartId=" + this.startToStartId + ", endToEndId=" + this.endToEndId + ", verticalBias=" + this.verticalBias + ", horizontalBias=" + this.horizontalBias + ")";
            }

            /* compiled from: OfferFragment.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Constraints$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/betup/ui/dialogs/offer/OfferItemContent$LayoutParams$Constraints;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Constraints> serializer() {
                    return OfferItemContent$LayoutParams$Constraints$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Constraints(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, SerializationConstructorMarker serializationConstructorMarker) {
                if (255 != (i & 255)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 255, OfferItemContent$LayoutParams$Constraints$$serializer.INSTANCE.getDescriptor());
                }
                this.startToEndId = str;
                this.endToStartId = str2;
                this.topToBottomId = str3;
                this.bottomToTopId = str4;
                this.topToTopId = str5;
                this.bottomToBottomId = str6;
                this.startToStartId = str7;
                this.endToEndId = str8;
                if ((i & 256) == 0) {
                    this.verticalBias = 0.5f;
                } else {
                    this.verticalBias = f;
                }
                if ((i & 512) == 0) {
                    this.horizontalBias = 0.5f;
                } else {
                    this.horizontalBias = f2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$app_release(Constraints self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.startToEndId);
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.endToStartId);
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.topToBottomId);
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.bottomToTopId);
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.topToTopId);
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.bottomToBottomId);
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.startToStartId);
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.endToEndId);
                if (output.shouldEncodeElementDefault(serialDesc, 8) || Float.compare(self.verticalBias, 0.5f) != 0) {
                    output.encodeFloatElement(serialDesc, 8, self.verticalBias);
                }
                if (!output.shouldEncodeElementDefault(serialDesc, 9) && Float.compare(self.horizontalBias, 0.5f) == 0) {
                    return;
                }
                output.encodeFloatElement(serialDesc, 9, self.horizontalBias);
            }

            public Constraints(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2) {
                this.startToEndId = str;
                this.endToStartId = str2;
                this.topToBottomId = str3;
                this.bottomToTopId = str4;
                this.topToTopId = str5;
                this.bottomToBottomId = str6;
                this.startToStartId = str7;
                this.endToEndId = str8;
                this.verticalBias = f;
                this.horizontalBias = f2;
            }

            public /* synthetic */ Constraints(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? 0.5f : f, (i & 512) != 0 ? 0.5f : f2);
            }

            public final String getStartToEndId() {
                return this.startToEndId;
            }

            public final String getEndToStartId() {
                return this.endToStartId;
            }

            public final String getTopToBottomId() {
                return this.topToBottomId;
            }

            public final String getBottomToTopId() {
                return this.bottomToTopId;
            }

            public final String getTopToTopId() {
                return this.topToTopId;
            }

            public final String getBottomToBottomId() {
                return this.bottomToBottomId;
            }

            public final String getStartToStartId() {
                return this.startToStartId;
            }

            public final String getEndToEndId() {
                return this.endToEndId;
            }

            public final float getVerticalBias() {
                return this.verticalBias;
            }

            public final float getHorizontalBias() {
                return this.horizontalBias;
            }
        }
    }
}
