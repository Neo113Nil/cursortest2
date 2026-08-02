package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.daon.dmds.models.DMDSOptions> CREATOR = new android.os.Parcelable.Creator<com.daon.dmds.models.DMDSOptions>() { // from class: com.daon.dmds.models.DMDSOptions.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.daon.dmds.models.DMDSOptions createFromParcel(android.os.Parcel parcel) {
            return new com.daon.dmds.models.DMDSOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.daon.dmds.models.DMDSOptions[] newArray(int i) {
            return new com.daon.dmds.models.DMDSOptions[i];
        }
    };
    private double AMEXKernel;
    private int AMEXKernelCallback;
    private boolean AMEXKernela;
    private boolean ArtificialStackFrames;
    private boolean Camera2StreamConfigurationMap;
    private com.daon.dmds.models.DMDSStrictnessLevel CoroutineDebuggingKt;
    private double _BOUNDARY;
    private java.lang.String _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private double f2843a;
    private com.daon.dmds.models.DMDSImageExtensionFactors accessartificialFrame;
    private double b;
    private boolean c;
    private int coroutineBoundary;
    private boolean coroutineCreation;
    private boolean d;
    private boolean exchange;
    private com.daon.dmds.models.DMDSVideoResolution freeTransaction;
    private java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSCameraSurfaceType getHighSpeedVideoFpsRanges;
    private com.daon.dmds.models.DMDSStrictnessLevel getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private double getInputFormats;
    private int getInputSizeshNQ4ISI;
    private com.daon.dmds.models.DMDSDewarpPolicy getOutputFormats;
    private java.util.List<com.daon.dmds.models.DocTypeEnum> getOutputMinFrameDuration;
    private boolean getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private double getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private double getOutputStallDurationlomOqCM;
    private boolean getValidOutputFormatsForInputhNQ4ISI;
    private boolean init;
    private com.daon.dmds.models.DocTypeEnum isOutputSupportedFor;
    private float isOutputSupportedForhNQ4ISI;
    private float kernelVersion;
    private com.daon.dmds.models.DMDSDefaultUiOptions l;
    private boolean release;
    private float requestGoOnline;
    private int requestPINEntry;
    private boolean resetTransaction;
    private boolean startTransaction;
    private int toString;
    private java.lang.String unwrapAs;
    private boolean updateUI;

    public DMDSOptions() {
        this._CREATION = "";
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = "";
        this.getOutputMinFrameDuration = new java.util.ArrayList();
        this.requestPINEntry = 10;
        this.getOutputSizes = false;
        this.isOutputSupportedForhNQ4ISI = 0.4f;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.isOutputSupportedFor = com.daon.dmds.models.DocTypeEnum.EdgeDetection;
        this.toString = 10;
        this.requestGoOnline = 0.5f;
        this.AMEXKernelCallback = 6;
        this.l = new com.daon.dmds.models.DMDSDefaultUiOptions();
        this.coroutineBoundary = 300;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputFormats = 1.42045455d;
        this.getHighSpeedVideoSizesFor = 3.465f;
        this.getOutputSizeshNQ4ISI = 0.4d;
        this.getOutputStallDurationlomOqCM = 0.6d;
        this.getOutputStallDuration = false;
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRanges = com.daon.dmds.models.DMDSCameraSurfaceType.DEFAULT;
        this.unwrapAs = "";
        this.getInputSizeshNQ4ISI = 0;
        this.accessartificialFrame = new com.daon.dmds.models.DMDSImageExtensionFactors(0.03f, 0.03f, 0.03f, 0.03f);
        this.c = false;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.ArtificialStackFrames = false;
        this.freeTransaction = com.daon.dmds.models.DMDSVideoResolution.VID_1080P;
        this.getOutputFormats = com.daon.dmds.models.DMDSDewarpPolicy.NO_UP_SCALING;
        this.init = false;
        this._BOUNDARY = com.daon.dmds.utils.DMDSDocumentUtils.isOldIdCaptureLibrary().booleanValue() ? 1.44d : 0.264d;
        this.b = 0.0962d;
        this.AMEXKernel = 88.0d;
        this.f2843a = 92.0d;
        this.kernelVersion = 0.0f;
        this.coroutineCreation = false;
        this.exchange = true;
        this.resetTransaction = true;
        this.startTransaction = true;
        this.release = true;
        this.d = true;
        this.AMEXKernela = true;
        this.getHighSpeedVideoSizes = true;
        this.updateUI = true;
        com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel = com.daon.dmds.models.DMDSStrictnessLevel.DMDS_STRICTNESS_LEVEL_NORMAL;
        this.getHighSpeedVideoFpsRangesFor = dMDSStrictnessLevel;
        this.CoroutineDebuggingKt = dMDSStrictnessLevel;
        this.getOutputMinFrameDuration.add(com.daon.dmds.models.DocTypeEnum.IdDocumentCombined);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void enableAutoStartScanning(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.daon.dmds.models.DMDSOptions dMDSOptions = (com.daon.dmds.models.DMDSOptions) obj;
            if (this.requestPINEntry == dMDSOptions.requestPINEntry && this.getOutputSizes == dMDSOptions.getOutputSizes && java.lang.Float.compare(dMDSOptions.isOutputSupportedForhNQ4ISI, this.isOutputSupportedForhNQ4ISI) == 0 && this.getValidOutputFormatsForInputhNQ4ISI == dMDSOptions.getValidOutputFormatsForInputhNQ4ISI && this.toString == dMDSOptions.toString && java.lang.Float.compare(dMDSOptions.requestGoOnline, this.requestGoOnline) == 0 && this.AMEXKernelCallback == dMDSOptions.AMEXKernelCallback && this.coroutineBoundary == dMDSOptions.coroutineBoundary && this.getHighResolutionOutputSizeshNQ4ISI == dMDSOptions.getHighResolutionOutputSizeshNQ4ISI && java.lang.Double.compare(dMDSOptions.getInputFormats, this.getInputFormats) == 0 && java.lang.Float.compare(dMDSOptions.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizesFor) == 0 && java.lang.Double.compare(dMDSOptions.getOutputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI) == 0 && java.lang.Double.compare(dMDSOptions.getOutputStallDurationlomOqCM, this.getOutputStallDurationlomOqCM) == 0 && this.getOutputStallDuration == dMDSOptions.getOutputStallDuration && this.Camera2StreamConfigurationMap == dMDSOptions.Camera2StreamConfigurationMap && this.getInputSizeshNQ4ISI == dMDSOptions.getInputSizeshNQ4ISI && this.c == dMDSOptions.c && this.getOutputMinFrameDurationlomOqCM == dMDSOptions.getOutputMinFrameDurationlomOqCM && this.ArtificialStackFrames == dMDSOptions.ArtificialStackFrames && this.init == dMDSOptions.init && this.coroutineCreation == dMDSOptions.coroutineCreation && java.lang.Double.compare(dMDSOptions._BOUNDARY, this._BOUNDARY) == 0 && java.lang.Double.compare(dMDSOptions.b, this.b) == 0 && this.exchange == dMDSOptions.exchange && this.resetTransaction == dMDSOptions.resetTransaction && this.startTransaction == dMDSOptions.startTransaction && this.release == dMDSOptions.release && this.d == dMDSOptions.d && this.AMEXKernela == dMDSOptions.AMEXKernela && this.getHighSpeedVideoSizes == dMDSOptions.getHighSpeedVideoSizes && this.updateUI == dMDSOptions.updateUI && java.util.Objects.equals(this._CREATION, dMDSOptions._CREATION) && java.util.Objects.equals(this.getARTIFICIAL_FRAME_PACKAGE_NAME, dMDSOptions.getARTIFICIAL_FRAME_PACKAGE_NAME) && java.util.Objects.equals(this.getOutputMinFrameDuration, dMDSOptions.getOutputMinFrameDuration) && this.isOutputSupportedFor == dMDSOptions.isOutputSupportedFor && java.util.Objects.equals(this.l, dMDSOptions.l) && this.getHighSpeedVideoFpsRanges == dMDSOptions.getHighSpeedVideoFpsRanges && java.util.Objects.equals(this.unwrapAs, dMDSOptions.unwrapAs) && java.util.Objects.equals(this.accessartificialFrame, dMDSOptions.accessartificialFrame) && java.util.Objects.equals(this.getHighSpeedVideoFpsRangesFor, dMDSOptions.getHighSpeedVideoFpsRangesFor) && java.util.Objects.equals(this.CoroutineDebuggingKt, dMDSOptions.CoroutineDebuggingKt) && this.freeTransaction == dMDSOptions.freeTransaction && this.getOutputFormats == dMDSOptions.getOutputFormats && java.lang.Double.compare(dMDSOptions.AMEXKernel, this.AMEXKernel) == 0 && java.lang.Double.compare(dMDSOptions.f2843a, this.f2843a) == 0 && java.lang.Float.compare(dMDSOptions.kernelVersion, this.kernelVersion) != 0) {
                return true;
            }
        }
        return false;
    }

    public com.daon.dmds.models.DMDSStrictnessLevel getBlurStrictnessLevel() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.daon.dmds.models.DMDSCameraSurfaceType getCameraSurfaceType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public double getCustomEdgeDetectionAspectRatio() {
        return this.getInputFormats;
    }

    public float getCustomEdgeDetectionPhysicalHeightInInches() {
        return this.getHighSpeedVideoSizesFor;
    }

    public com.daon.dmds.models.DMDSDewarpPolicy getDewarpPolicy() {
        return this.getOutputFormats;
    }

    public int getDocumentBorderWidth() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.util.List<com.daon.dmds.models.DocTypeEnum> getDocumentTypes() {
        return this.getOutputMinFrameDuration;
    }

    public double getEdgeDetectionLandscapeScaleTolerance() {
        return this.getOutputSizeshNQ4ISI;
    }

    public double getEdgeDetectionPortraitScaleTolerance() {
        return this.getOutputStallDurationlomOqCM;
    }

    public java.lang.String getFaceLicenceKey() {
        return this.unwrapAs;
    }

    public float getFaceQualityScoreThreshold() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public com.daon.dmds.models.DocTypeEnum getFallbackToEdgeDetectionDocumentType() {
        return this.isOutputSupportedFor;
    }

    public int getFallbackToEdgeDetectionDuration() {
        return this.toString;
    }

    public int getFullDocumentImageDpi() {
        return this.coroutineBoundary;
    }

    public com.daon.dmds.models.DMDSStrictnessLevel getGlareStrictnessLevel() {
        return this.CoroutineDebuggingKt;
    }

    public com.daon.dmds.models.DMDSImageExtensionFactors getImageExtensionFactors() {
        return this.accessartificialFrame;
    }

    public java.lang.String getLicenseKey() {
        return this._CREATION;
    }

    public java.lang.String getLicenseeAppId() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public double getMaxGlareFixed() {
        return this.b;
    }

    public double getMaxTiltAngle() {
        return this.f2843a;
    }

    public double getMinLocalBlur() {
        return this._BOUNDARY;
    }

    public double getMinTiltAngle() {
        return this.AMEXKernel;
    }

    public float getPaddingEdge() {
        return this.kernelVersion;
    }

    public int getScanningDuration() {
        return this.requestPINEntry;
    }

    public float getScanningRegionFillPercent() {
        return this.requestGoOnline;
    }

    public int getStableEdgeDetectionsNumber() {
        return this.AMEXKernelCallback;
    }

    public com.daon.dmds.models.DMDSDefaultUiOptions getUiOptions() {
        return this.l;
    }

    public com.daon.dmds.models.DMDSVideoResolution getVideoResolution() {
        return this.freeTransaction;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        java.lang.String str = this._CREATION;
        int hashCode = str != null ? str.hashCode() : 0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(hashCode * 31);
        sb.append(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        int hashCode2 = sb.toString() != null ? this.getARTIFICIAL_FRAME_PACKAGE_NAME.hashCode() : 0;
        java.util.List<com.daon.dmds.models.DocTypeEnum> list = this.getOutputMinFrameDuration;
        int hashCode3 = list != null ? list.hashCode() : 0;
        int i5 = this.requestPINEntry;
        boolean z = this.getOutputSizes;
        float f = this.isOutputSupportedForhNQ4ISI;
        int floatToIntBits = f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0;
        boolean z2 = this.getValidOutputFormatsForInputhNQ4ISI;
        com.daon.dmds.models.DocTypeEnum docTypeEnum = this.isOutputSupportedFor;
        int hashCode4 = docTypeEnum != null ? docTypeEnum.hashCode() : 0;
        int i6 = this.toString;
        float f2 = this.requestGoOnline;
        int floatToIntBits2 = f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0;
        int i7 = this.AMEXKernelCallback;
        com.daon.dmds.models.DMDSDefaultUiOptions dMDSDefaultUiOptions = this.l;
        int hashCode5 = dMDSDefaultUiOptions != null ? dMDSDefaultUiOptions.hashCode() : 0;
        int i8 = this.coroutineBoundary;
        boolean z3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i9 = hashCode3;
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.getInputFormats);
        int i10 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        float f3 = this.getHighSpeedVideoSizesFor;
        if (f3 != 0.0f) {
            i = i10;
            i2 = java.lang.Float.floatToIntBits(f3);
        } else {
            i = i10;
            i2 = 0;
        }
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.getOutputSizeshNQ4ISI);
        int i11 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.getOutputStallDurationlomOqCM);
        int i12 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        boolean z4 = this.getOutputStallDuration;
        boolean z5 = this.Camera2StreamConfigurationMap;
        com.daon.dmds.models.DMDSCameraSurfaceType dMDSCameraSurfaceType = this.getHighSpeedVideoFpsRanges;
        int hashCode6 = dMDSCameraSurfaceType != null ? dMDSCameraSurfaceType.hashCode() : 0;
        java.lang.String str2 = this.unwrapAs;
        int hashCode7 = str2 != null ? str2.hashCode() : 0;
        int i13 = this.getInputSizeshNQ4ISI;
        com.daon.dmds.models.DMDSImageExtensionFactors dMDSImageExtensionFactors = this.accessartificialFrame;
        int hashCode8 = dMDSImageExtensionFactors != null ? dMDSImageExtensionFactors.hashCode() : 0;
        boolean z6 = this.c;
        boolean z7 = this.getOutputMinFrameDurationlomOqCM;
        boolean z8 = this.ArtificialStackFrames;
        com.daon.dmds.models.DMDSVideoResolution dMDSVideoResolution = this.freeTransaction;
        int hashCode9 = dMDSVideoResolution != null ? dMDSVideoResolution.hashCode() : 0;
        com.daon.dmds.models.DMDSDewarpPolicy dMDSDewarpPolicy = this.getOutputFormats;
        int hashCode10 = dMDSDewarpPolicy != null ? dMDSDewarpPolicy.hashCode() : 0;
        boolean z9 = this.init;
        boolean z10 = this.coroutineCreation;
        long doubleToLongBits4 = java.lang.Double.doubleToLongBits(this._BOUNDARY);
        int i14 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        long doubleToLongBits5 = java.lang.Double.doubleToLongBits(this.b);
        int i15 = (int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32));
        boolean z11 = this.exchange;
        boolean z12 = this.resetTransaction;
        boolean z13 = this.startTransaction;
        boolean z14 = this.release;
        boolean z15 = this.d;
        boolean z16 = this.AMEXKernela;
        boolean z17 = this.getHighSpeedVideoSizes;
        boolean z18 = this.updateUI;
        com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel = this.getHighSpeedVideoFpsRangesFor;
        int hashCode11 = dMDSStrictnessLevel != null ? dMDSStrictnessLevel.hashCode() : 0;
        com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel2 = this.CoroutineDebuggingKt;
        if (dMDSStrictnessLevel2 != null) {
            i3 = i15;
            i4 = dMDSStrictnessLevel2.hashCode();
        } else {
            i3 = i15;
            i4 = 0;
        }
        long doubleToLongBits6 = java.lang.Double.doubleToLongBits(this.AMEXKernel);
        int i16 = (int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32));
        long doubleToLongBits7 = java.lang.Double.doubleToLongBits(this.f2843a);
        int i17 = (int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32));
        long floatToIntBits3 = java.lang.Float.floatToIntBits(this.kernelVersion);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode2 * 31) + i9) * 31) + i5) * 31) + (z ? 1 : 0)) * 31) + floatToIntBits) * 31) + (z2 ? 1 : 0)) * 31) + hashCode4) * 31) + i6) * 31) + floatToIntBits2) * 31) + i7) * 31) + hashCode5) * 31) + i8) * 31) + (z3 ? 1 : 0)) * 31) + i) * 31) + i2) * 31) + i11) * 31) + i12) * 31) + (z4 ? 1 : 0)) * 31) + (z5 ? 1 : 0)) * 31) + hashCode6) * 31) + hashCode7) * 31) + i13) * 31) + hashCode8) * 31) + (z6 ? 1 : 0)) * 31) + (z7 ? 1 : 0)) * 31) + (z8 ? 1 : 0)) * 31) + hashCode9) * 31) + hashCode10) * 31) + (z9 ? 1 : 0)) * 31) + (z10 ? 1 : 0)) * 31) + i14) * 31) + i3) * 31) + (z11 ? 1 : 0)) * 31) + (z12 ? 1 : 0)) * 31) + (z13 ? 1 : 0)) * 31) + (z14 ? 1 : 0)) * 31) + (z15 ? 1 : 0)) * 31) + (z16 ? 1 : 0)) * 31) + (z17 ? 1 : 0)) * 31) + (z18 ? 1 : 0)) * 31) + hashCode11) * 31) + i4) * 31) + i16) * 31) + i17) * 31) + ((int) (floatToIntBits3 ^ (floatToIntBits3 >>> 32)));
    }

    public boolean isAggregateDetectionStatusUpdates() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isAllowUnverifiedMrzResults() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isAutoStartScanningEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isEdgeDetectionVerticalCardScan() {
        return this.getOutputStallDuration;
    }

    public boolean isEnableAnonymization() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public boolean isFaceDetection() {
        return this.getOutputSizes;
    }

    public boolean isFallbackToEdgeDetection() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public boolean isFastScanEnabled() {
        return this.ArtificialStackFrames;
    }

    public boolean isForceLegacyCameraAPI() {
        return this.coroutineCreation;
    }

    public boolean isQualityFilterEnabled() {
        return this.init;
    }

    public boolean isRequestAutofocusOnShakingStopInContinousAutofocusMode() {
        return this.c;
    }

    public boolean isRequireBarcodeIdRecognition() {
        return this.d;
    }

    public boolean isRequireFullRecognition() {
        return this.AMEXKernela;
    }

    public boolean isRequireMrzIdRecognition() {
        return this.exchange;
    }

    public boolean isRequireMrzPassportRecognition() {
        return this.startTransaction;
    }

    public boolean isRequireMrzVisaRecognition() {
        return this.resetTransaction;
    }

    public boolean isRequirePhotoIdRecognition() {
        return this.release;
    }

    public boolean isSingleFrameMode() {
        return this.updateUI;
    }

    public boolean noEdgeDetectionInRequests() {
        return !com.daon.dmds.utils.DMDSDocumentUtils.listContainsEdgeDetection(this.getOutputMinFrameDuration);
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this._CREATION = parcel.readString();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getOutputMinFrameDuration = arrayList;
        parcel.readList(arrayList, com.daon.dmds.models.DocTypeEnum.class.getClassLoader());
        this.requestPINEntry = parcel.readInt();
        this.getOutputSizes = parcel.readByte() != 0;
        this.isOutputSupportedForhNQ4ISI = parcel.readFloat();
        this.getValidOutputFormatsForInputhNQ4ISI = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.isOutputSupportedFor = readInt == -1 ? null : com.daon.dmds.models.DocTypeEnum.values()[readInt];
        this.toString = parcel.readInt();
        this.requestGoOnline = parcel.readFloat();
        this.AMEXKernelCallback = parcel.readInt();
        this.l = (com.daon.dmds.models.DMDSDefaultUiOptions) parcel.readParcelable(com.daon.dmds.models.DMDSDefaultUiOptions.class.getClassLoader());
        this.coroutineBoundary = parcel.readInt();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readByte() != 0;
        this.getInputFormats = parcel.readDouble();
        this.getHighSpeedVideoSizesFor = parcel.readFloat();
        this.getOutputSizeshNQ4ISI = parcel.readDouble();
        this.getOutputStallDurationlomOqCM = parcel.readDouble();
        this.getOutputStallDuration = parcel.readByte() != 0;
        this.Camera2StreamConfigurationMap = parcel.readByte() != 0;
        int readInt2 = parcel.readInt();
        this.getHighSpeedVideoFpsRanges = readInt2 == -1 ? null : com.daon.dmds.models.DMDSCameraSurfaceType.values()[readInt2];
        this.unwrapAs = parcel.readString();
        this.getInputSizeshNQ4ISI = parcel.readInt();
        this.accessartificialFrame = (com.daon.dmds.models.DMDSImageExtensionFactors) parcel.readParcelable(com.daon.dmds.models.DMDSImageExtensionFactors.class.getClassLoader());
        this.c = parcel.readByte() != 0;
        this.getOutputMinFrameDurationlomOqCM = parcel.readByte() != 0;
        this.ArtificialStackFrames = parcel.readByte() != 0;
        int readInt3 = parcel.readInt();
        this.freeTransaction = readInt3 == -1 ? null : com.daon.dmds.models.DMDSVideoResolution.values()[readInt3];
        int readInt4 = parcel.readInt();
        this.getOutputFormats = readInt4 == -1 ? null : com.daon.dmds.models.DMDSDewarpPolicy.values()[readInt4];
        this.init = parcel.readByte() != 0;
        this.coroutineCreation = parcel.readByte() != 0;
        this._BOUNDARY = parcel.readDouble();
        this.b = parcel.readDouble();
        this.exchange = parcel.readByte() != 0;
        this.resetTransaction = parcel.readByte() != 0;
        this.startTransaction = parcel.readByte() != 0;
        this.release = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.AMEXKernela = parcel.readByte() != 0;
        this.getHighSpeedVideoSizes = parcel.readByte() != 0;
        this.updateUI = parcel.readByte() != 0;
        int readInt5 = parcel.readInt();
        this.getHighSpeedVideoFpsRangesFor = readInt5 == -1 ? null : com.daon.dmds.models.DMDSStrictnessLevel.values()[readInt5];
        int readInt6 = parcel.readInt();
        this.CoroutineDebuggingKt = readInt6 != -1 ? com.daon.dmds.models.DMDSStrictnessLevel.values()[readInt6] : null;
        this.AMEXKernel = parcel.readDouble();
        this.f2843a = parcel.readDouble();
        this.kernelVersion = parcel.readFloat();
    }

    public void setAggregateDetectionStatusUpdates(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public void setAllowUnverifiedMrzResults(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public void setBlurStrictnessLevel(com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel) {
        this.getHighSpeedVideoFpsRangesFor = dMDSStrictnessLevel;
    }

    public void setCameraSurfaceType(com.daon.dmds.models.DMDSCameraSurfaceType dMDSCameraSurfaceType) {
        this.getHighSpeedVideoFpsRanges = dMDSCameraSurfaceType;
    }

    public void setCustomEdgeDetectionAspectRatio(double d) {
        this.getInputFormats = d;
    }

    public void setCustomEdgeDetectionPhysicalHeightInInches(float f) {
        this.getHighSpeedVideoSizesFor = f;
    }

    public void setDewarpPolicy(com.daon.dmds.models.DMDSDewarpPolicy dMDSDewarpPolicy) {
        this.getOutputFormats = dMDSDewarpPolicy;
    }

    public void setDocumentBorderWidth(int i) {
        this.getInputSizeshNQ4ISI = i;
    }

    public void setDocumentTypes(java.util.Collection<com.daon.dmds.models.DocTypeEnum> collection) {
        if (collection == null) {
            return;
        }
        this.getOutputMinFrameDuration = new java.util.ArrayList(collection);
    }

    public void setEdgeDetectionLandscapeScaleTolerance(double d) {
        if (d > 1.0d) {
            this.getOutputSizeshNQ4ISI = 1.0d;
        } else if (d < 0.0d) {
            this.getOutputSizeshNQ4ISI = 0.0d;
        } else {
            this.getOutputSizeshNQ4ISI = d;
        }
    }

    public void setEdgeDetectionPortraitScaleTolerance(double d) {
        if (d > 1.0d) {
            this.getOutputStallDurationlomOqCM = 1.0d;
        } else if (d < 0.0d) {
            this.getOutputStallDurationlomOqCM = 0.0d;
        } else {
            this.getOutputStallDurationlomOqCM = d;
        }
    }

    public void setEdgeDetectionVerticalCardScan(boolean z) {
        this.getOutputStallDuration = z;
    }

    public void setEnableAnonymization(boolean z) {
        this.getOutputMinFrameDurationlomOqCM = z;
    }

    public void setFaceDetection(boolean z) {
        this.getOutputSizes = z;
    }

    public void setFaceLicenceKey(java.lang.String str) {
        this.unwrapAs = str;
    }

    public void setFaceQualityScoreThreshold(float f) {
        this.isOutputSupportedForhNQ4ISI = f;
    }

    public void setFallbackToEdgeDetection(boolean z) {
        this.getValidOutputFormatsForInputhNQ4ISI = z;
    }

    public void setFallbackToEdgeDetectionDocumentType(com.daon.dmds.models.DocTypeEnum docTypeEnum) {
        this.isOutputSupportedFor = docTypeEnum;
    }

    public void setFallbackToEdgeDetectionDuration(int i) {
        this.toString = i;
    }

    public void setFastScan(boolean z) {
        this.ArtificialStackFrames = z;
    }

    public void setForceLegacyCameraAPI(boolean z) {
        this.coroutineCreation = z;
    }

    public void setFullDocumentImageDpi(int i) {
        if (i < 100 || i > 400) {
            return;
        }
        this.coroutineBoundary = i;
    }

    public void setGlareStrictnessLevel(com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel) {
        this.CoroutineDebuggingKt = dMDSStrictnessLevel;
    }

    public void setImageExtensionFactors(com.daon.dmds.models.DMDSImageExtensionFactors dMDSImageExtensionFactors) {
        this.accessartificialFrame = dMDSImageExtensionFactors;
    }

    public void setLicenseKey(java.lang.String str) {
        this._CREATION = str;
    }

    public void setLicenseeAppId(java.lang.String str) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = str;
    }

    public void setMaxGlareFixed(double d) {
        this.b = d;
    }

    public void setMaxTiltAngle(double d) {
        this.f2843a = d;
    }

    public void setMinLocalBlur(double d) {
        this._BOUNDARY = d;
    }

    public void setMinTiltAngle(double d) {
        this.AMEXKernel = d;
    }

    public void setPaddingEdge(float f) {
        this.kernelVersion = java.lang.Math.min(f, 0.1f);
    }

    public void setQualityFilter(boolean z) {
        this.init = z;
    }

    public void setRequestAutofocusOnShakingStopInContinousAutofocusMode(boolean z) {
        this.c = z;
    }

    public void setRequireBarcodeIdRecognition(boolean z) {
        this.d = z;
    }

    public void setRequireFullRecognition(boolean z) {
        this.AMEXKernela = z;
    }

    public void setRequireMrzIdRecognition(boolean z) {
        this.exchange = z;
    }

    public void setRequireMrzPassportRecognition(boolean z) {
        this.startTransaction = z;
    }

    public void setRequireMrzVisaRecognition(boolean z) {
        this.resetTransaction = z;
    }

    public void setRequirePhotoIdRecognition(boolean z) {
        this.release = z;
    }

    public void setScanningDuration(int i) {
        this.requestPINEntry = i;
    }

    public void setScanningRegionFillPercent(float f) {
        this.requestGoOnline = f;
    }

    public void setSingleFrameMode(boolean z) {
        this.updateUI = z;
    }

    public void setStableEdgeDetectionsNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        if (i > 255) {
            i = 255;
        }
        this.AMEXKernelCallback = i;
    }

    public void setUiOptions(com.daon.dmds.models.DMDSDefaultUiOptions dMDSDefaultUiOptions) {
        this.l = dMDSDefaultUiOptions;
    }

    public void setVideoResolution(com.daon.dmds.models.DMDSVideoResolution dMDSVideoResolution) {
        this.freeTransaction = dMDSVideoResolution;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this._CREATION);
        parcel.writeString(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        parcel.writeList(this.getOutputMinFrameDuration);
        parcel.writeInt(this.requestPINEntry);
        parcel.writeByte(this.getOutputSizes ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.isOutputSupportedForhNQ4ISI);
        parcel.writeByte(this.getValidOutputFormatsForInputhNQ4ISI ? (byte) 1 : (byte) 0);
        com.daon.dmds.models.DocTypeEnum docTypeEnum = this.isOutputSupportedFor;
        parcel.writeInt(docTypeEnum == null ? -1 : docTypeEnum.ordinal());
        parcel.writeInt(this.toString);
        parcel.writeFloat(this.requestGoOnline);
        parcel.writeInt(this.AMEXKernelCallback);
        parcel.writeParcelable(this.l, i);
        parcel.writeInt(this.coroutineBoundary);
        parcel.writeByte(this.getHighResolutionOutputSizeshNQ4ISI ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.getInputFormats);
        parcel.writeFloat(this.getHighSpeedVideoSizesFor);
        parcel.writeDouble(this.getOutputSizeshNQ4ISI);
        parcel.writeDouble(this.getOutputStallDurationlomOqCM);
        parcel.writeByte(this.getOutputStallDuration ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Camera2StreamConfigurationMap ? (byte) 1 : (byte) 0);
        com.daon.dmds.models.DMDSCameraSurfaceType dMDSCameraSurfaceType = this.getHighSpeedVideoFpsRanges;
        parcel.writeInt(dMDSCameraSurfaceType == null ? -1 : dMDSCameraSurfaceType.ordinal());
        parcel.writeString(this.unwrapAs);
        parcel.writeInt(this.getInputSizeshNQ4ISI);
        parcel.writeParcelable(this.accessartificialFrame, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getOutputMinFrameDurationlomOqCM ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.ArtificialStackFrames ? (byte) 1 : (byte) 0);
        com.daon.dmds.models.DMDSVideoResolution dMDSVideoResolution = this.freeTransaction;
        parcel.writeInt(dMDSVideoResolution == null ? -1 : dMDSVideoResolution.ordinal());
        com.daon.dmds.models.DMDSDewarpPolicy dMDSDewarpPolicy = this.getOutputFormats;
        parcel.writeInt(dMDSDewarpPolicy == null ? -1 : dMDSDewarpPolicy.ordinal());
        parcel.writeByte(this.init ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.coroutineCreation ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this._BOUNDARY);
        parcel.writeDouble(this.b);
        parcel.writeByte(this.exchange ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.resetTransaction ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.startTransaction ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.release ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.AMEXKernela ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getHighSpeedVideoSizes ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.updateUI ? (byte) 1 : (byte) 0);
        com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel = this.getHighSpeedVideoFpsRangesFor;
        parcel.writeInt(dMDSStrictnessLevel == null ? -1 : dMDSStrictnessLevel.ordinal());
        com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel2 = this.CoroutineDebuggingKt;
        parcel.writeInt(dMDSStrictnessLevel2 != null ? dMDSStrictnessLevel2.ordinal() : -1);
        parcel.writeDouble(this.AMEXKernel);
        parcel.writeDouble(this.f2843a);
        parcel.writeFloat(this.kernelVersion);
    }

    public DMDSOptions(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        this._CREATION = "";
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = "";
        this.getOutputMinFrameDuration = new java.util.ArrayList();
        this.requestPINEntry = 10;
        this.getOutputSizes = false;
        this.isOutputSupportedForhNQ4ISI = 0.4f;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.isOutputSupportedFor = com.daon.dmds.models.DocTypeEnum.EdgeDetection;
        this.toString = 10;
        this.requestGoOnline = 0.5f;
        this.AMEXKernelCallback = 6;
        this.l = new com.daon.dmds.models.DMDSDefaultUiOptions();
        this.coroutineBoundary = 300;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputFormats = 1.42045455d;
        this.getHighSpeedVideoSizesFor = 3.465f;
        this.getOutputSizeshNQ4ISI = 0.4d;
        this.getOutputStallDurationlomOqCM = 0.6d;
        this.getOutputStallDuration = false;
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRanges = com.daon.dmds.models.DMDSCameraSurfaceType.DEFAULT;
        this.unwrapAs = "";
        this.getInputSizeshNQ4ISI = 0;
        this.accessartificialFrame = new com.daon.dmds.models.DMDSImageExtensionFactors(0.03f, 0.03f, 0.03f, 0.03f);
        this.c = false;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.ArtificialStackFrames = false;
        this.freeTransaction = com.daon.dmds.models.DMDSVideoResolution.VID_1080P;
        this.getOutputFormats = com.daon.dmds.models.DMDSDewarpPolicy.NO_UP_SCALING;
        this.init = false;
        this._BOUNDARY = com.daon.dmds.utils.DMDSDocumentUtils.isOldIdCaptureLibrary().booleanValue() ? 1.44d : 0.264d;
        this.b = 0.0962d;
        this.AMEXKernel = 88.0d;
        this.f2843a = 92.0d;
        this.kernelVersion = 0.0f;
        this.coroutineCreation = false;
        this.exchange = true;
        this.resetTransaction = true;
        this.startTransaction = true;
        this.release = true;
        this.d = true;
        this.AMEXKernela = true;
        this.getHighSpeedVideoSizes = true;
        this.updateUI = true;
        com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel = com.daon.dmds.models.DMDSStrictnessLevel.DMDS_STRICTNESS_LEVEL_NORMAL;
        this.getHighSpeedVideoFpsRangesFor = dMDSStrictnessLevel;
        this.CoroutineDebuggingKt = dMDSStrictnessLevel;
        this._CREATION = dMDSOptions._CREATION;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = dMDSOptions.getARTIFICIAL_FRAME_PACKAGE_NAME;
        this.getOutputMinFrameDuration = dMDSOptions.getOutputMinFrameDuration;
        this.requestPINEntry = dMDSOptions.requestPINEntry;
        this.getOutputSizes = dMDSOptions.getOutputSizes;
        this.isOutputSupportedForhNQ4ISI = dMDSOptions.isOutputSupportedForhNQ4ISI;
        this.getValidOutputFormatsForInputhNQ4ISI = dMDSOptions.getValidOutputFormatsForInputhNQ4ISI;
        this.toString = dMDSOptions.toString;
        this.requestGoOnline = dMDSOptions.requestGoOnline;
        this.AMEXKernelCallback = dMDSOptions.AMEXKernelCallback;
        this.l = dMDSOptions.l;
        this.coroutineBoundary = dMDSOptions.coroutineBoundary;
        this.getHighResolutionOutputSizeshNQ4ISI = dMDSOptions.getHighResolutionOutputSizeshNQ4ISI;
        this.getInputFormats = dMDSOptions.getInputFormats;
        this.getHighSpeedVideoSizesFor = dMDSOptions.getHighSpeedVideoSizesFor;
        this.getOutputSizeshNQ4ISI = dMDSOptions.getOutputSizeshNQ4ISI;
        this.getOutputStallDurationlomOqCM = dMDSOptions.getOutputStallDurationlomOqCM;
        this.getOutputStallDuration = dMDSOptions.getOutputStallDuration;
        this.Camera2StreamConfigurationMap = dMDSOptions.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = dMDSOptions.getHighSpeedVideoFpsRanges;
        this.unwrapAs = dMDSOptions.unwrapAs;
        this.getInputSizeshNQ4ISI = dMDSOptions.getInputSizeshNQ4ISI;
        this.accessartificialFrame = dMDSOptions.accessartificialFrame;
        this.c = dMDSOptions.c;
        this.getOutputMinFrameDurationlomOqCM = dMDSOptions.getOutputMinFrameDurationlomOqCM;
        this.ArtificialStackFrames = dMDSOptions.ArtificialStackFrames;
        this.init = dMDSOptions.init;
        this._BOUNDARY = dMDSOptions._BOUNDARY;
        this.b = dMDSOptions.b;
        this.isOutputSupportedFor = dMDSOptions.isOutputSupportedFor;
        this.freeTransaction = dMDSOptions.freeTransaction;
        this.getOutputFormats = dMDSOptions.getOutputFormats;
        this.exchange = dMDSOptions.exchange;
        this.resetTransaction = dMDSOptions.resetTransaction;
        this.startTransaction = dMDSOptions.startTransaction;
        this.release = dMDSOptions.release;
        this.d = dMDSOptions.d;
        this.AMEXKernela = dMDSOptions.AMEXKernela;
        this.getHighSpeedVideoSizes = dMDSOptions.getHighSpeedVideoSizes;
        this.updateUI = dMDSOptions.updateUI;
        this.getHighSpeedVideoFpsRangesFor = dMDSOptions.getHighSpeedVideoFpsRangesFor;
        this.CoroutineDebuggingKt = dMDSOptions.CoroutineDebuggingKt;
        this.AMEXKernel = dMDSOptions.AMEXKernel;
        this.f2843a = dMDSOptions.f2843a;
        this.kernelVersion = dMDSOptions.kernelVersion;
        this.coroutineCreation = dMDSOptions.coroutineCreation;
    }

    protected DMDSOptions(android.os.Parcel parcel) {
        this._CREATION = "";
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = "";
        this.getOutputMinFrameDuration = new java.util.ArrayList();
        this.requestPINEntry = 10;
        this.getOutputSizes = false;
        this.isOutputSupportedForhNQ4ISI = 0.4f;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.isOutputSupportedFor = com.daon.dmds.models.DocTypeEnum.EdgeDetection;
        this.toString = 10;
        this.requestGoOnline = 0.5f;
        this.AMEXKernelCallback = 6;
        this.l = new com.daon.dmds.models.DMDSDefaultUiOptions();
        this.coroutineBoundary = 300;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputFormats = 1.42045455d;
        this.getHighSpeedVideoSizesFor = 3.465f;
        this.getOutputSizeshNQ4ISI = 0.4d;
        this.getOutputStallDurationlomOqCM = 0.6d;
        this.getOutputStallDuration = false;
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRanges = com.daon.dmds.models.DMDSCameraSurfaceType.DEFAULT;
        this.unwrapAs = "";
        this.getInputSizeshNQ4ISI = 0;
        this.accessartificialFrame = new com.daon.dmds.models.DMDSImageExtensionFactors(0.03f, 0.03f, 0.03f, 0.03f);
        this.c = false;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.ArtificialStackFrames = false;
        this.freeTransaction = com.daon.dmds.models.DMDSVideoResolution.VID_1080P;
        this.getOutputFormats = com.daon.dmds.models.DMDSDewarpPolicy.NO_UP_SCALING;
        this.init = false;
        this._BOUNDARY = com.daon.dmds.utils.DMDSDocumentUtils.isOldIdCaptureLibrary().booleanValue() ? 1.44d : 0.264d;
        this.b = 0.0962d;
        this.AMEXKernel = 88.0d;
        this.f2843a = 92.0d;
        this.kernelVersion = 0.0f;
        this.coroutineCreation = false;
        this.exchange = true;
        this.resetTransaction = true;
        this.startTransaction = true;
        this.release = true;
        this.d = true;
        this.AMEXKernela = true;
        this.getHighSpeedVideoSizes = true;
        this.updateUI = true;
        com.daon.dmds.models.DMDSStrictnessLevel dMDSStrictnessLevel = com.daon.dmds.models.DMDSStrictnessLevel.DMDS_STRICTNESS_LEVEL_NORMAL;
        this.getHighSpeedVideoFpsRangesFor = dMDSStrictnessLevel;
        this.CoroutineDebuggingKt = dMDSStrictnessLevel;
        this._CREATION = parcel.readString();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getOutputMinFrameDuration = arrayList;
        parcel.readList(arrayList, com.daon.dmds.models.DocTypeEnum.class.getClassLoader());
        this.requestPINEntry = parcel.readInt();
        this.getOutputSizes = parcel.readByte() != 0;
        this.isOutputSupportedForhNQ4ISI = parcel.readFloat();
        this.getValidOutputFormatsForInputhNQ4ISI = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.isOutputSupportedFor = readInt == -1 ? null : com.daon.dmds.models.DocTypeEnum.values()[readInt];
        this.toString = parcel.readInt();
        this.requestGoOnline = parcel.readFloat();
        this.AMEXKernelCallback = parcel.readInt();
        this.l = (com.daon.dmds.models.DMDSDefaultUiOptions) parcel.readParcelable(com.daon.dmds.models.DMDSDefaultUiOptions.class.getClassLoader());
        this.coroutineBoundary = parcel.readInt();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readByte() != 0;
        this.getInputFormats = parcel.readDouble();
        this.getHighSpeedVideoSizesFor = parcel.readFloat();
        this.getOutputSizeshNQ4ISI = parcel.readDouble();
        this.getOutputStallDurationlomOqCM = parcel.readDouble();
        this.getOutputStallDuration = parcel.readByte() != 0;
        this.Camera2StreamConfigurationMap = parcel.readByte() != 0;
        int readInt2 = parcel.readInt();
        this.getHighSpeedVideoFpsRanges = readInt2 == -1 ? null : com.daon.dmds.models.DMDSCameraSurfaceType.values()[readInt2];
        this.unwrapAs = parcel.readString();
        this.getInputSizeshNQ4ISI = parcel.readInt();
        this.accessartificialFrame = (com.daon.dmds.models.DMDSImageExtensionFactors) parcel.readParcelable(com.daon.dmds.models.DMDSImageExtensionFactors.class.getClassLoader());
        this.c = parcel.readByte() != 0;
        this.getOutputMinFrameDurationlomOqCM = parcel.readByte() != 0;
        this.ArtificialStackFrames = parcel.readByte() != 0;
        int readInt3 = parcel.readInt();
        this.freeTransaction = readInt3 == -1 ? null : com.daon.dmds.models.DMDSVideoResolution.values()[readInt3];
        int readInt4 = parcel.readInt();
        this.getOutputFormats = readInt4 == -1 ? null : com.daon.dmds.models.DMDSDewarpPolicy.values()[readInt4];
        this.init = parcel.readByte() != 0;
        this.coroutineCreation = parcel.readByte() != 0;
        this._BOUNDARY = parcel.readDouble();
        this.b = parcel.readDouble();
        this.exchange = parcel.readByte() != 0;
        this.resetTransaction = parcel.readByte() != 0;
        this.startTransaction = parcel.readByte() != 0;
        this.release = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.AMEXKernela = parcel.readByte() != 0;
        this.getHighSpeedVideoSizes = parcel.readByte() != 0;
        this.updateUI = parcel.readByte() != 0;
        int readInt5 = parcel.readInt();
        this.getHighSpeedVideoFpsRangesFor = readInt5 == -1 ? null : com.daon.dmds.models.DMDSStrictnessLevel.values()[readInt5];
        int readInt6 = parcel.readInt();
        this.CoroutineDebuggingKt = readInt6 != -1 ? com.daon.dmds.models.DMDSStrictnessLevel.values()[readInt6] : null;
        this.AMEXKernel = parcel.readDouble();
        this.f2843a = parcel.readDouble();
        this.kernelVersion = parcel.readFloat();
    }
}
