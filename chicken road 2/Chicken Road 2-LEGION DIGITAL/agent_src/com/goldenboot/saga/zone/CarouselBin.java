package com.goldenboot.saga.zone;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/goldenboot/saga/zone/CarouselBin;", "", "<init>", "()V", "Lcom/goldenboot/saga/zone/InternalProvider;", "Landroid/graphics/ColorSpace;", "releaseHeader", "(Lcom/goldenboot/saga/zone/InternalProvider;)Landroid/graphics/ColorSpace;", "updateTimer", "(Landroid/graphics/ColorSpace;)Lcom/goldenboot/saga/zone/InternalProvider;", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CarouselBin {
    public static final CarouselBin evictLayout = new CarouselBin();

    private CarouselBin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double applyTask(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double clipOrigin(TouchRecord touchRecord, double d) {
        return ((Number) touchRecord.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double flushSample(TouchRecord touchRecord, double d) {
        return ((Number) touchRecord.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double popBlueprint(ColorSpace colorSpace, double d) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d);
    }

    public static final ColorSpace releaseHeader(InternalProvider internalProvider) {
        ColorSpace evictLayout2;
        RegionPipe regionPipe = RegionPipe.evictLayout;
        if (Intrinsics.areEqual(internalProvider, regionPipe.unlockMessage())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.peekRevision())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.serializeOffset())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.reduceScope())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.notifyMessage())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.drawRequest())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.gatherAdapter())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.decodePath())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.findTask())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.mergeLocale())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.syncScope())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.flattenPackage())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.injectConstraint())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.storeCharset())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.queryModel())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.areEqual(internalProvider, regionPipe.packPackage())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (evictLayout2 = LocalPropagator.evictLayout(internalProvider)) != null) {
            return evictLayout2;
        }
        if (!(internalProvider instanceof SlideDeserializer)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        SlideDeserializer slideDeserializer = (SlideDeserializer) internalProvider;
        float[] flushSample = slideDeserializer.getWhitePoint().flushSample();
        TransferParameters transferParameters = slideDeserializer.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.popBlueprint(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.serializeOffset(), transferParameters.reduceScope(), transferParameters.notifyMessage()) : null;
        if (transferParameters2 != null) {
            return new ColorSpace.Rgb(internalProvider.getName(), slideDeserializer.getPrimaries(), flushSample, transferParameters2);
        }
        String name = internalProvider.getName();
        float[] primaries = slideDeserializer.getPrimaries();
        final TouchRecord oetf = slideDeserializer.getOetf();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: com.goldenboot.saga.zone.BreadcrumbPresenter
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                double clipOrigin;
                clipOrigin = CarouselBin.clipOrigin(TouchRecord.this, d);
                return clipOrigin;
            }
        };
        final TouchRecord eotf = slideDeserializer.getEotf();
        return new ColorSpace.Rgb(name, primaries, flushSample, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: com.goldenboot.saga.zone.SaveMapper
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                double flushSample2;
                flushSample2 = CarouselBin.flushSample(TouchRecord.this, d);
                return flushSample2;
            }
        }, slideDeserializer.clipOrigin(0), slideDeserializer.releaseHeader(0));
    }

    public static final InternalProvider updateTimer(final ColorSpace colorSpace) {
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return RegionPipe.evictLayout.unlockMessage();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return RegionPipe.evictLayout.peekRevision();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return RegionPipe.evictLayout.serializeOffset();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return RegionPipe.evictLayout.reduceScope();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return RegionPipe.evictLayout.notifyMessage();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return RegionPipe.evictLayout.drawRequest();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return RegionPipe.evictLayout.gatherAdapter();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return RegionPipe.evictLayout.decodePath();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return RegionPipe.evictLayout.findTask();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return RegionPipe.evictLayout.mergeLocale();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return RegionPipe.evictLayout.syncScope();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return RegionPipe.evictLayout.flattenPackage();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return RegionPipe.evictLayout.injectConstraint();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return RegionPipe.evictLayout.storeCharset();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return RegionPipe.evictLayout.queryModel();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return RegionPipe.evictLayout.packPackage();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            InternalProvider growPayload = LocalPropagator.growPayload(colorSpace.getId());
            if (!Intrinsics.areEqual(growPayload, RegionPipe.evictLayout.parseAsset())) {
                return growPayload;
            }
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return RegionPipe.evictLayout.unlockMessage();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        return new SlideDeserializer(rgb.getName(), rgb.getPrimaries(), rgb.getWhitePoint().length == 3 ? new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]), rgb.getTransform(), new DragSerializer() { // from class: com.goldenboot.saga.zone.DimenSpawner
            @Override // com.goldenboot.saga.zone.DragSerializer
            public final double evictLayout(double d) {
                double applyTask;
                applyTask = CarouselBin.applyTask(colorSpace, d);
                return applyTask;
            }
        }, new DragSerializer() { // from class: com.goldenboot.saga.zone.ScrollSequence
            @Override // com.goldenboot.saga.zone.DragSerializer
            public final double evictLayout(double d) {
                double popBlueprint;
                popBlueprint = CarouselBin.popBlueprint(colorSpace, d);
                return popBlueprint;
            }
        }, rgb.getMinValue(0), rgb.getMaxValue(0), transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, rgb.getId());
    }
}
