package com.moloco.sdk.internal.ortb.model;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4761z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.C;
import com.moloco.sdk.internal.ortb.model.C4778a;
import com.moloco.sdk.internal.ortb.model.C4779b;
import com.moloco.sdk.internal.ortb.model.C4780c;
import com.moloco.sdk.internal.ortb.model.F;
import com.moloco.sdk.internal.ortb.model.G;
import com.moloco.sdk.internal.ortb.model.i;
import com.moloco.sdk.internal.ortb.model.k;
import com.moloco.sdk.internal.ortb.model.n;
import com.moloco.sdk.internal.ortb.model.x;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b6\b\u0001\u0018\u0000 \\2\u00020\u0001:\u0002(/B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u009b\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J'\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010*\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010,R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010.\u001a\u0004\b9\u0010:R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010.\u001a\u0004\bC\u0010DR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010F\u0012\u0004\bA\u0010.\u001a\u0004\b<\u0010GR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010H\u0012\u0004\bK\u0010.\u001a\u0004\bI\u0010JR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010.\u001a\u0004\bN\u0010OR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bQ\u0010.\u001a\u0004\bL\u0010SR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010T\u0012\u0004\b/\u0010.\u001a\u0004\b(\u0010UR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010V\u0012\u0004\b7\u0010.\u001a\u0004\b2\u0010WR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010X\u0012\u0004\b[\u0010.\u001a\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/moloco/sdk/internal/ortb/model/B;", "", "Lcom/moloco/sdk/internal/ortb/model/F;", "skip", "close", "Lcom/moloco/sdk/internal/ortb/model/C;", "progressBar", "Lcom/moloco/sdk/internal/ortb/model/A;", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "Lcom/moloco/sdk/internal/ortb/model/i;", "cta", "", "isAllAreaClickable", "Lcom/moloco/sdk/internal/ortb/model/c;", "autoStore", "Lcom/moloco/sdk/internal/ortb/model/G;", "vastPrivacyIcon", "Lcom/moloco/sdk/internal/ortb/model/n;", "dec", "Lcom/moloco/sdk/internal/ortb/model/k;", "countDownTimer", "Lcom/moloco/sdk/internal/ortb/model/a;", "androidInline", "Lcom/moloco/sdk/internal/ortb/model/b;", "autoInline", "Lcom/moloco/sdk/internal/ortb/model/x;", "inlineTextButton", "<init>", "(Lcom/moloco/sdk/internal/ortb/model/F;Lcom/moloco/sdk/internal/ortb/model/F;Lcom/moloco/sdk/internal/ortb/model/C;Lcom/moloco/sdk/internal/ortb/model/A;Lcom/moloco/sdk/internal/ortb/model/i;ZLcom/moloco/sdk/internal/ortb/model/c;Lcom/moloco/sdk/internal/ortb/model/G;Lcom/moloco/sdk/internal/ortb/model/n;Lcom/moloco/sdk/internal/ortb/model/k;Lcom/moloco/sdk/internal/ortb/model/a;Lcom/moloco/sdk/internal/ortb/model/b;Lcom/moloco/sdk/internal/ortb/model/x;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/moloco/sdk/internal/ortb/model/F;Lcom/moloco/sdk/internal/ortb/model/F;Lcom/moloco/sdk/internal/ortb/model/C;Lcom/moloco/sdk/internal/ortb/model/A;Lcom/moloco/sdk/internal/ortb/model/i;ZLcom/moloco/sdk/internal/ortb/model/c;Lcom/moloco/sdk/internal/ortb/model/G;Lcom/moloco/sdk/internal/ortb/model/n;Lcom/moloco/sdk/internal/ortb/model/k;Lcom/moloco/sdk/internal/ortb/model/a;Lcom/moloco/sdk/internal/ortb/model/b;Lcom/moloco/sdk/internal/ortb/model/x;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/moloco/sdk/internal/ortb/model/B;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/moloco/sdk/internal/ortb/model/F;", "u", "()Lcom/moloco/sdk/internal/ortb/model/F;", "v", "()V", "b", "g", "h", "c", "Lcom/moloco/sdk/internal/ortb/model/C;", CmcdData.Factory.STREAMING_FORMAT_SS, "()Lcom/moloco/sdk/internal/ortb/model/C;", "t", "d", "Lcom/moloco/sdk/internal/ortb/model/A;", CampaignEx.JSON_KEY_AD_Q, "()Lcom/moloco/sdk/internal/ortb/model/A;", "r", "e", "Lcom/moloco/sdk/internal/ortb/model/i;", CampaignEx.JSON_KEY_AD_K, "()Lcom/moloco/sdk/internal/ortb/model/i;", CmcdData.Factory.STREAM_TYPE_LIVE, "f", "Z", "y", "()Z", "z", "Lcom/moloco/sdk/internal/ortb/model/c;", "()Lcom/moloco/sdk/internal/ortb/model/c;", "Lcom/moloco/sdk/internal/ortb/model/G;", "w", "()Lcom/moloco/sdk/internal/ortb/model/G;", "x", "i", "Lcom/moloco/sdk/internal/ortb/model/n;", InneractiveMediationDefs.GENDER_MALE, "()Lcom/moloco/sdk/internal/ortb/model/n;", C4761z5.q, com.mbridge.msdk.foundation.same.report.j.b, "Lcom/moloco/sdk/internal/ortb/model/k;", "()Lcom/moloco/sdk/internal/ortb/model/k;", "Lcom/moloco/sdk/internal/ortb/model/a;", "()Lcom/moloco/sdk/internal/ortb/model/a;", "Lcom/moloco/sdk/internal/ortb/model/b;", "()Lcom/moloco/sdk/internal/ortb/model/b;", "Lcom/moloco/sdk/internal/ortb/model/x;", "o", "()Lcom/moloco/sdk/internal/ortb/model/x;", "p", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
@Serializable
/* loaded from: classes7.dex */
public final class B {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final F skip;

    /* renamed from: b, reason: from kotlin metadata */
    public final F close;

    /* renamed from: c, reason: from kotlin metadata */
    public final C progressBar;

    /* renamed from: d, reason: from kotlin metadata */
    public final A mute;

    /* renamed from: e, reason: from kotlin metadata */
    public final i cta;

    /* renamed from: f, reason: from kotlin metadata */
    public final boolean isAllAreaClickable;

    /* renamed from: g, reason: from kotlin metadata */
    public final C4780c autoStore;

    /* renamed from: h, reason: from kotlin metadata */
    public final G vastPrivacyIcon;

    /* renamed from: i, reason: from kotlin metadata */
    public final n dec;

    /* renamed from: j, reason: from kotlin metadata */
    public final k countDownTimer;

    /* renamed from: k, reason: from kotlin metadata */
    public final C4778a androidInline;

    /* renamed from: l, reason: from kotlin metadata */
    public final C4779b autoInline;

    /* renamed from: m, reason: from kotlin metadata */
    public final x inlineTextButton;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public /* synthetic */ class a implements GeneratedSerializer<B> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10520a;
        public static final int b;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f10520a = aVar;
            b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.moloco.sdk.internal.ortb.model.Player", aVar, 13);
            pluginGeneratedSerialDescriptor.addElement("skip", true);
            pluginGeneratedSerialDescriptor.addElement("close", false);
            pluginGeneratedSerialDescriptor.addElement("progress_bar", true);
            pluginGeneratedSerialDescriptor.addElement(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
            pluginGeneratedSerialDescriptor.addElement("cta", true);
            pluginGeneratedSerialDescriptor.addElement("is_all_area_clickable", false);
            pluginGeneratedSerialDescriptor.addElement("auto_store", true);
            pluginGeneratedSerialDescriptor.addElement("vast_privacy_icon", true);
            pluginGeneratedSerialDescriptor.addElement("dec", true);
            pluginGeneratedSerialDescriptor.addElement("countdown_timer", true);
            pluginGeneratedSerialDescriptor.addElement("android_inline", true);
            pluginGeneratedSerialDescriptor.addElement("auto_inline", true);
            pluginGeneratedSerialDescriptor.addElement("inline_button", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B deserialize(Decoder decoder) {
            F f;
            int i;
            F f2;
            C4779b c4779b;
            k kVar;
            G g;
            i iVar;
            C4778a c4778a;
            C4780c c4780c;
            A a2;
            x xVar;
            boolean z;
            n nVar;
            C c;
            x xVar2;
            F f3;
            x xVar3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
            F f4 = null;
            if (beginStructure.decodeSequentially()) {
                F.a aVar = F.a.f10528a;
                F f5 = (F) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, aVar, null);
                F f6 = (F) beginStructure.decodeSerializableElement(serialDescriptor, 1, aVar, null);
                C c2 = (C) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, C.a.f10522a, null);
                A a3 = (A) beginStructure.decodeSerializableElement(serialDescriptor, 3, A.a.f10518a, null);
                i iVar2 = (i) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, i.a.f10548a, null);
                boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 5);
                C4780c c4780c2 = (C4780c) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, C4780c.a.f10537a, null);
                G g2 = (G) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, G.a.f10530a, null);
                n nVar2 = (n) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, n.a.f10557a, null);
                k kVar2 = (k) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, k.a.f10551a, null);
                C4778a c4778a2 = (C4778a) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, C4778a.C1480a.f10533a, null);
                C4779b c4779b2 = (C4779b) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, C4779b.a.f10535a, null);
                f = f6;
                xVar = (x) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, x.a.f10576a, null);
                c4779b = c4779b2;
                c4778a = c4778a2;
                kVar = kVar2;
                g = g2;
                c4780c = c4780c2;
                z = decodeBooleanElement;
                a2 = a3;
                nVar = nVar2;
                iVar = iVar2;
                c = c2;
                i = 8191;
                f2 = f5;
            } else {
                int i2 = 0;
                boolean z2 = false;
                F f7 = null;
                x xVar4 = null;
                C4779b c4779b3 = null;
                k kVar3 = null;
                n nVar3 = null;
                G g3 = null;
                i iVar3 = null;
                C4778a c4778a3 = null;
                C4780c c4780c3 = null;
                A a4 = null;
                boolean z3 = true;
                C c3 = null;
                while (z3) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                    switch (decodeElementIndex) {
                        case -1:
                            xVar2 = xVar4;
                            z3 = false;
                            xVar4 = xVar2;
                        case 0:
                            xVar2 = xVar4;
                            f4 = (F) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, F.a.f10528a, f4);
                            i2 |= 1;
                            xVar4 = xVar2;
                        case 1:
                            f3 = f4;
                            xVar3 = xVar4;
                            f7 = (F) beginStructure.decodeSerializableElement(serialDescriptor, 1, F.a.f10528a, f7);
                            i2 |= 2;
                            xVar4 = xVar3;
                            f4 = f3;
                        case 2:
                            f3 = f4;
                            xVar3 = xVar4;
                            c3 = (C) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, C.a.f10522a, c3);
                            i2 |= 4;
                            xVar4 = xVar3;
                            f4 = f3;
                        case 3:
                            f3 = f4;
                            xVar3 = xVar4;
                            a4 = (A) beginStructure.decodeSerializableElement(serialDescriptor, 3, A.a.f10518a, a4);
                            i2 |= 8;
                            xVar4 = xVar3;
                            f4 = f3;
                        case 4:
                            f3 = f4;
                            xVar3 = xVar4;
                            iVar3 = (i) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, i.a.f10548a, iVar3);
                            i2 |= 16;
                            xVar4 = xVar3;
                            f4 = f3;
                        case 5:
                            f3 = f4;
                            z2 = beginStructure.decodeBooleanElement(serialDescriptor, 5);
                            i2 |= 32;
                            f4 = f3;
                        case 6:
                            f3 = f4;
                            c4780c3 = (C4780c) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, C4780c.a.f10537a, c4780c3);
                            i2 |= 64;
                            f4 = f3;
                        case 7:
                            f3 = f4;
                            g3 = (G) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, G.a.f10530a, g3);
                            i2 |= 128;
                            f4 = f3;
                        case 8:
                            f3 = f4;
                            nVar3 = (n) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, n.a.f10557a, nVar3);
                            i2 |= 256;
                            f4 = f3;
                        case 9:
                            f3 = f4;
                            kVar3 = (k) beginStructure.decodeNullableSerializableElement(serialDescriptor, 9, k.a.f10551a, kVar3);
                            i2 |= 512;
                            f4 = f3;
                        case 10:
                            f3 = f4;
                            c4778a3 = (C4778a) beginStructure.decodeNullableSerializableElement(serialDescriptor, 10, C4778a.C1480a.f10533a, c4778a3);
                            i2 |= 1024;
                            f4 = f3;
                        case 11:
                            f3 = f4;
                            c4779b3 = (C4779b) beginStructure.decodeNullableSerializableElement(serialDescriptor, 11, C4779b.a.f10535a, c4779b3);
                            i2 |= 2048;
                            f4 = f3;
                        case 12:
                            xVar4 = (x) beginStructure.decodeNullableSerializableElement(serialDescriptor, 12, x.a.f10576a, xVar4);
                            i2 |= 4096;
                            f4 = f4;
                        default:
                            throw new UnknownFieldException(decodeElementIndex);
                    }
                }
                f = f7;
                i = i2;
                f2 = f4;
                c4779b = c4779b3;
                kVar = kVar3;
                g = g3;
                iVar = iVar3;
                c4778a = c4778a3;
                c4780c = c4780c3;
                a2 = a4;
                xVar = xVar4;
                z = z2;
                nVar = nVar3;
                c = c3;
            }
            beginStructure.endStructure(serialDescriptor);
            return new B(i, f2, f, c, a2, iVar, z, c4780c, g, nVar, kVar, c4778a, c4779b, xVar, (SerializationConstructorMarker) null);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final KSerializer<?>[] childSerializers() {
            F.a aVar = F.a.f10528a;
            return new KSerializer[]{BuiltinSerializersKt.getNullable(aVar), aVar, BuiltinSerializersKt.getNullable(C.a.f10522a), A.a.f10518a, BuiltinSerializersKt.getNullable(i.a.f10548a), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(C4780c.a.f10537a), BuiltinSerializersKt.getNullable(G.a.f10530a), BuiltinSerializersKt.getNullable(n.a.f10557a), BuiltinSerializersKt.getNullable(k.a.f10551a), BuiltinSerializersKt.getNullable(C4778a.C1480a.f10533a), BuiltinSerializersKt.getNullable(C4779b.a.f10535a), BuiltinSerializersKt.getNullable(x.a.f10576a)};
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, B value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
            B.a(value, beginStructure, serialDescriptor);
            beginStructure.endStructure(serialDescriptor);
        }
    }

    /* renamed from: com.moloco.sdk.internal.ortb.model.B$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<B> serializer() {
            return a.f10520a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ B(int i, F f, F f2, C c, A a2, i iVar, boolean z, C4780c c4780c, G g, n nVar, k kVar, C4778a c4778a, C4779b c4779b, x xVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (42 != (i & 42)) {
            PluginExceptionsKt.throwMissingFieldException(i, 42, a.f10520a.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.skip = null;
        } else {
            this.skip = f;
        }
        this.close = f2;
        if ((i & 4) == 0) {
            this.progressBar = null;
        } else {
            this.progressBar = c;
        }
        this.mute = a2;
        if ((i & 16) == 0) {
            this.cta = null;
        } else {
            this.cta = iVar;
        }
        this.isAllAreaClickable = z;
        if ((i & 64) == 0) {
            this.autoStore = null;
        } else {
            this.autoStore = c4780c;
        }
        if ((i & 128) == 0) {
            this.vastPrivacyIcon = null;
        } else {
            this.vastPrivacyIcon = g;
        }
        if ((i & 256) == 0) {
            this.dec = null;
        } else {
            this.dec = nVar;
        }
        if ((i & 512) == 0) {
            this.countDownTimer = null;
        } else {
            this.countDownTimer = kVar;
        }
        if ((i & 1024) == 0) {
            this.androidInline = null;
        } else {
            this.androidInline = c4778a;
        }
        if ((i & 2048) == 0) {
            this.autoInline = null;
        } else {
            this.autoInline = c4779b;
        }
        if ((i & 4096) == 0) {
            this.inlineTextButton = null;
        } else {
            this.inlineTextButton = xVar;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void a(B self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.skip != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, F.a.f10528a, self.skip);
        }
        output.encodeSerializableElement(serialDesc, 1, F.a.f10528a, self.close);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.progressBar != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, C.a.f10522a, self.progressBar);
        }
        output.encodeSerializableElement(serialDesc, 3, A.a.f10518a, self.mute);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.cta != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, i.a.f10548a, self.cta);
        }
        output.encodeBooleanElement(serialDesc, 5, self.isAllAreaClickable);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.autoStore != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, C4780c.a.f10537a, self.autoStore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.vastPrivacyIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, G.a.f10530a, self.vastPrivacyIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.dec != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, n.a.f10557a, self.dec);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.countDownTimer != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, k.a.f10551a, self.countDownTimer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.androidInline != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, C4778a.C1480a.f10533a, self.androidInline);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.autoInline != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, C4779b.a.f10535a, self.autoInline);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.inlineTextButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, x.a.f10576a, self.inlineTextButton);
    }

    @SerialName("android_inline")
    public static /* synthetic */ void b() {
    }

    @SerialName("auto_inline")
    public static /* synthetic */ void d() {
    }

    @SerialName("auto_store")
    public static /* synthetic */ void f() {
    }

    @SerialName("close")
    public static /* synthetic */ void h() {
    }

    @SerialName("countdown_timer")
    public static /* synthetic */ void j() {
    }

    @SerialName("cta")
    public static /* synthetic */ void l() {
    }

    @SerialName("dec")
    public static /* synthetic */ void n() {
    }

    @SerialName("inline_button")
    public static /* synthetic */ void p() {
    }

    @SerialName(CampaignEx.JSON_NATIVE_VIDEO_MUTE)
    public static /* synthetic */ void r() {
    }

    @SerialName("progress_bar")
    public static /* synthetic */ void t() {
    }

    @SerialName("skip")
    public static /* synthetic */ void v() {
    }

    @SerialName("vast_privacy_icon")
    public static /* synthetic */ void x() {
    }

    @SerialName("is_all_area_clickable")
    public static /* synthetic */ void z() {
    }

    /* renamed from: c, reason: from getter */
    public final C4779b getAutoInline() {
        return this.autoInline;
    }

    /* renamed from: e, reason: from getter */
    public final C4780c getAutoStore() {
        return this.autoStore;
    }

    /* renamed from: g, reason: from getter */
    public final F getClose() {
        return this.close;
    }

    /* renamed from: i, reason: from getter */
    public final k getCountDownTimer() {
        return this.countDownTimer;
    }

    /* renamed from: k, reason: from getter */
    public final i getCta() {
        return this.cta;
    }

    /* renamed from: m, reason: from getter */
    public final n getDec() {
        return this.dec;
    }

    /* renamed from: o, reason: from getter */
    public final x getInlineTextButton() {
        return this.inlineTextButton;
    }

    /* renamed from: q, reason: from getter */
    public final A getMute() {
        return this.mute;
    }

    /* renamed from: s, reason: from getter */
    public final C getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: u, reason: from getter */
    public final F getSkip() {
        return this.skip;
    }

    /* renamed from: w, reason: from getter */
    public final G getVastPrivacyIcon() {
        return this.vastPrivacyIcon;
    }

    /* renamed from: y, reason: from getter */
    public final boolean getIsAllAreaClickable() {
        return this.isAllAreaClickable;
    }

    /* renamed from: a, reason: from getter */
    public final C4778a getAndroidInline() {
        return this.androidInline;
    }

    public B(F f, F close, C c, A mute, i iVar, boolean z, C4780c c4780c, G g, n nVar, k kVar, C4778a c4778a, C4779b c4779b, x xVar) {
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(mute, "mute");
        this.skip = f;
        this.close = close;
        this.progressBar = c;
        this.mute = mute;
        this.cta = iVar;
        this.isAllAreaClickable = z;
        this.autoStore = c4780c;
        this.vastPrivacyIcon = g;
        this.dec = nVar;
        this.countDownTimer = kVar;
        this.androidInline = c4778a;
        this.autoInline = c4779b;
        this.inlineTextButton = xVar;
    }

    public /* synthetic */ B(F f, F f2, C c, A a2, i iVar, boolean z, C4780c c4780c, G g, n nVar, k kVar, C4778a c4778a, C4779b c4779b, x xVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, f2, (i & 4) != 0 ? null : c, a2, (i & 16) != 0 ? null : iVar, z, (i & 64) != 0 ? null : c4780c, (i & 128) != 0 ? null : g, (i & 256) != 0 ? null : nVar, (i & 512) != 0 ? null : kVar, (i & 1024) != 0 ? null : c4778a, (i & 2048) != 0 ? null : c4779b, (i & 4096) != 0 ? null : xVar);
    }
}
