package com.goldenboot.saga.zone;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001eJ\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b&\u0010\u001eJ\u0015\u0010'\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b'\u0010\u001eJ\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010\u0011J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010\u0011J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u00067"}, d2 = {"Lcom/goldenboot/saga/zone/ServerModerator;", "", "", "values", "growPayload", "([F)[F", "", "row", "column", "", "updateTimer", "([FII)F", "v", "Lcom/goldenboot/saga/zone/DpadBuilder;", "peekRevision", "([FIIF)V", "drawField", "([F)V", "src", "serializeOffset", "([F[F)V", "degrees", "Lkotlin/Function2;", "block", "connectJob", "([FFLcom/goldenboot/saga/zone/IconExporter;)V", "colorMatrix", "inflateAdapter", "sat", "attachConfig", "([FF)V", "redScale", "greenScale", "blueScale", "alphaScale", "resetDelta", "([FFFFF)V", "connectPatch", "notifyMessage", "reduceScope", "detachStream", "releaseHeader", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "evictLayout", "[F", "applyTask", "()[F", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ServerModerator {

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final float[] values;

    private /* synthetic */ ServerModerator(float[] fArr) {
        this.values = fArr;
    }

    public static final void attachConfig(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = 1 - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    public static boolean clipOrigin(float[] fArr, Object obj) {
        return (obj instanceof ServerModerator) && Intrinsics.areEqual(fArr, ((ServerModerator) obj).drawRequest());
    }

    private static final void connectJob(float[] fArr, float f, IconExporter iconExporter) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) Math.floor(r8 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float floor2 = f2 - ((float) Math.floor(0.5f + f2));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f4 = 1.0f - abs2;
        iconExporter.invoke(Float.valueOf(((floor * 8.0f) * f3) / (1.25f - (abs * f3))), Float.valueOf(((floor2 * 8.0f) * f4) / (1.25f - (abs2 * f4))));
    }

    public static final void connectPatch(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) Math.floor(r2 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) Math.floor(0.5f + f2));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[6] = f4;
        fArr[7] = f6;
        fArr[11] = -f6;
        fArr[12] = f4;
    }

    public static final void detachStream(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    public static final void drawField(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
    }

    public static final /* synthetic */ ServerModerator evictLayout(float[] fArr) {
        return new ServerModerator(fArr);
    }

    public static final boolean flushSample(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    public static final void inflateAdapter(float[] fArr, float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[5];
        float f5 = fArr[2];
        float f6 = fArr2[10];
        float f7 = fArr[3];
        float f8 = fArr2[15];
        float f9 = (f * f2) + (f3 * f4) + (f5 * f6) + (f7 * f8);
        float f10 = fArr2[1];
        float f11 = fArr2[6];
        float f12 = fArr2[11];
        float f13 = fArr2[16];
        float f14 = (f * f10) + (f3 * f11) + (f5 * f12) + (f7 * f13);
        float f15 = fArr2[2];
        float f16 = fArr2[7];
        float f17 = fArr2[12];
        float f18 = fArr2[17];
        float f19 = (f * f15) + (f3 * f16) + (f5 * f17) + (f7 * f18);
        float f20 = fArr2[3];
        float f21 = fArr2[8];
        float f22 = fArr2[13];
        float f23 = fArr2[18];
        float f24 = (f * f20) + (f3 * f21) + (f5 * f22) + (f7 * f23);
        float f25 = fArr2[4];
        float f26 = fArr2[9];
        float f27 = fArr2[14];
        float f28 = fArr2[19];
        float f29 = (f * f25) + (f3 * f26) + (f5 * f27) + (f7 * f28) + fArr[4];
        float f30 = fArr[5];
        float f31 = fArr[6];
        float f32 = fArr[7];
        float f33 = fArr[8];
        float f34 = (f30 * f2) + (f31 * f4) + (f32 * f6) + (f33 * f8);
        float f35 = (f30 * f10) + (f31 * f11) + (f32 * f12) + (f33 * f13);
        float f36 = (f30 * f15) + (f31 * f16) + (f32 * f17) + (f33 * f18);
        float f37 = (f30 * f20) + (f31 * f21) + (f32 * f22) + (f33 * f23);
        float f38 = (f30 * f25) + (f31 * f26) + (f32 * f27) + (f33 * f28) + fArr[9];
        float f39 = fArr[10];
        float f40 = fArr[11];
        float f41 = fArr[12];
        float f42 = fArr[13];
        float f43 = (f39 * f2) + (f40 * f4) + (f41 * f6) + (f42 * f8);
        float f44 = (f39 * f10) + (f40 * f11) + (f41 * f12) + (f42 * f13);
        float f45 = (f39 * f15) + (f40 * f16) + (f41 * f17) + (f42 * f18);
        float f46 = (f39 * f20) + (f40 * f21) + (f41 * f22) + (f42 * f23);
        float f47 = (f39 * f25) + (f40 * f26) + (f41 * f27) + (f42 * f28) + fArr[14];
        float f48 = fArr[15];
        float f49 = fArr[16];
        float f50 = (f2 * f48) + (f4 * f49);
        float f51 = fArr[17];
        float f52 = f50 + (f6 * f51);
        float f53 = fArr[18];
        float f54 = (f10 * f48) + (f11 * f49) + (f12 * f51) + (f13 * f53);
        float f55 = (f15 * f48) + (f16 * f49) + (f17 * f51) + (f18 * f53);
        float f56 = (f20 * f48) + (f21 * f49) + (f22 * f51) + (f23 * f53);
        float f57 = (f48 * f25) + (f49 * f26) + (f51 * f27) + (f53 * f28) + fArr[19];
        fArr[0] = f9;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f24;
        fArr[4] = f29;
        fArr[5] = f34;
        fArr[6] = f35;
        fArr[7] = f36;
        fArr[8] = f37;
        fArr[9] = f38;
        fArr[10] = f43;
        fArr[11] = f44;
        fArr[12] = f45;
        fArr[13] = f46;
        fArr[14] = f47;
        fArr[15] = f52 + (f8 * f53);
        fArr[16] = f54;
        fArr[17] = f55;
        fArr[18] = f56;
        fArr[19] = f57;
    }

    public static /* synthetic */ float[] injectMetric(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return growPayload(fArr);
    }

    public static final void notifyMessage(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) Math.floor(r3 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) Math.floor(0.5f + f2));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[0] = f4;
        fArr[2] = -f6;
        fArr[10] = f6;
        fArr[12] = f4;
    }

    public static final void peekRevision(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    public static int popBlueprint(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static String purgeNode(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public static final void reduceScope(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) Math.floor(r3 + 0.5f));
        float abs = Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) Math.floor(0.5f + f2));
        float abs2 = Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[0] = f4;
        fArr[1] = f6;
        fArr[5] = -f6;
        fArr[6] = f4;
    }

    public static final void releaseHeader(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    public static final void resetDelta(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    public static final void serializeOffset(float[] fArr, float[] fArr2) {
        if (fArr.length >= 20 && fArr2.length >= 20) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
            fArr[16] = fArr2[16];
            fArr[17] = fArr2[17];
            fArr[18] = fArr2[18];
            fArr[19] = fArr2[19];
        }
    }

    public static final float updateTimer(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* renamed from: applyTask, reason: from getter */
    public final float[] getValues() {
        return this.values;
    }

    public final /* synthetic */ float[] drawRequest() {
        return this.values;
    }

    public boolean equals(Object other) {
        return clipOrigin(this.values, other);
    }

    public int hashCode() {
        return popBlueprint(this.values);
    }

    public String toString() {
        return purgeNode(this.values);
    }

    public static float[] growPayload(float[] fArr) {
        return fArr;
    }
}
