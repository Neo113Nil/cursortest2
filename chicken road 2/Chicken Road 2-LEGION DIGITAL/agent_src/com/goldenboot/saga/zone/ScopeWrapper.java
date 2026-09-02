package com.goldenboot.saga.zone;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'inflateAdapter' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ScopeWrapper {
    public static final ScopeWrapper appendKey;
    public static final ScopeWrapper attachCallback;
    public static final ScopeWrapper bindBody;
    public static final ScopeWrapper cancelArchive;
    public static final Type[] closePayload;
    public static final ScopeWrapper[] commitBounds;
    public static final ScopeWrapper compressVersion;
    public static final ScopeWrapper computeTarget;
    public static final ScopeWrapper connectComponent;
    public static final ScopeWrapper decodePath;
    public static final ScopeWrapper dispatchTimezone;
    public static final ScopeWrapper drawConfig;
    public static final ScopeWrapper drawRequest;
    public static final ScopeWrapper drawScope;
    public static final ScopeWrapper emitStrategy;
    public static final ScopeWrapper expandArgs;
    public static final /* synthetic */ ScopeWrapper[] expandScope;
    public static final ScopeWrapper filterPayload;
    public static final ScopeWrapper findTask;
    public static final ScopeWrapper flattenPackage;
    public static final ScopeWrapper formatPosition;
    public static final ScopeWrapper gatherAdapter;
    public static final ScopeWrapper groupArchive;
    public static final ScopeWrapper growCallback;
    public static final ScopeWrapper handleFooter;
    public static final ScopeWrapper inflateAdapter;
    public static final ScopeWrapper inflateEdge;
    public static final ScopeWrapper injectConstraint;
    public static final ScopeWrapper injectField;
    public static final ScopeWrapper locateSignal;
    public static final ScopeWrapper mapJob;
    public static final ScopeWrapper mergeLocale;
    public static final ScopeWrapper normalizeBundle;
    public static final ScopeWrapper packPackage;
    public static final ScopeWrapper parseAsset;
    public static final ScopeWrapper peekDescriptor;
    public static final ScopeWrapper prepareTask;
    public static final ScopeWrapper protectGauge;
    public static final ScopeWrapper purgeMetric;
    public static final ScopeWrapper purgeNode;
    public static final ScopeWrapper queryModel;
    public static final ScopeWrapper refreshCounter;
    public static final ScopeWrapper removeCount;
    public static final ScopeWrapper resetValue;
    public static final ScopeWrapper resolveDelta;
    public static final ScopeWrapper resumeSignature;
    public static final ScopeWrapper serializeTask;
    public static final ScopeWrapper startResource;
    public static final ScopeWrapper storeCharset;
    public static final ScopeWrapper syncScope;
    public static final ScopeWrapper transformCurrency;
    public static final ScopeWrapper unlockMessage;
    public static final ScopeWrapper updateAction;
    public static final ScopeWrapper validateOffset;
    public final Class attachConfig;
    public final BounceHandler connectPatch;
    public final int notifyMessage;
    public final SlotPresenter reduceScope;
    public final boolean resetDelta;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static /* synthetic */ class ActivityMutator {
        public static final /* synthetic */ int[] evictLayout;
        public static final /* synthetic */ int[] growPayload;

        static {
            int[] iArr = new int[SlotPresenter.values().length];
            growPayload = iArr;
            try {
                iArr[SlotPresenter.drawScope.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                growPayload[SlotPresenter.findTask.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                growPayload[SlotPresenter.decodePath.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[BounceHandler.values().length];
            evictLayout = iArr2;
            try {
                iArr2[BounceHandler.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                evictLayout[BounceHandler.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                evictLayout[BounceHandler.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public enum BounceHandler {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        public final boolean reduceScope;

        BounceHandler(boolean z) {
            this.reduceScope = z;
        }
    }

    static {
        BounceHandler bounceHandler = BounceHandler.SCALAR;
        SlotPresenter slotPresenter = SlotPresenter.drawRequest;
        ScopeWrapper scopeWrapper = new ScopeWrapper("DOUBLE", 0, 0, bounceHandler, slotPresenter);
        inflateAdapter = scopeWrapper;
        SlotPresenter slotPresenter2 = SlotPresenter.purgeNode;
        ScopeWrapper scopeWrapper2 = new ScopeWrapper("FLOAT", 1, 1, bounceHandler, slotPresenter2);
        purgeNode = scopeWrapper2;
        SlotPresenter slotPresenter3 = SlotPresenter.inflateAdapter;
        ScopeWrapper scopeWrapper3 = new ScopeWrapper("INT64", 2, 2, bounceHandler, slotPresenter3);
        drawRequest = scopeWrapper3;
        ScopeWrapper scopeWrapper4 = new ScopeWrapper("UINT64", 3, 3, bounceHandler, slotPresenter3);
        gatherAdapter = scopeWrapper4;
        SlotPresenter slotPresenter4 = SlotPresenter.resetDelta;
        ScopeWrapper scopeWrapper5 = new ScopeWrapper("INT32", 4, 4, bounceHandler, slotPresenter4);
        decodePath = scopeWrapper5;
        ScopeWrapper scopeWrapper6 = new ScopeWrapper("FIXED64", 5, 5, bounceHandler, slotPresenter3);
        drawScope = scopeWrapper6;
        ScopeWrapper scopeWrapper7 = new ScopeWrapper("FIXED32", 6, 6, bounceHandler, slotPresenter4);
        expandArgs = scopeWrapper7;
        SlotPresenter slotPresenter5 = SlotPresenter.gatherAdapter;
        ScopeWrapper scopeWrapper8 = new ScopeWrapper("BOOL", 7, 7, bounceHandler, slotPresenter5);
        findTask = scopeWrapper8;
        SlotPresenter slotPresenter6 = SlotPresenter.decodePath;
        ScopeWrapper scopeWrapper9 = new ScopeWrapper("STRING", 8, 8, bounceHandler, slotPresenter6);
        mergeLocale = scopeWrapper9;
        SlotPresenter slotPresenter7 = SlotPresenter.findTask;
        ScopeWrapper scopeWrapper10 = new ScopeWrapper("MESSAGE", 9, 9, bounceHandler, slotPresenter7);
        syncScope = scopeWrapper10;
        SlotPresenter slotPresenter8 = SlotPresenter.drawScope;
        ScopeWrapper scopeWrapper11 = new ScopeWrapper("BYTES", 10, 10, bounceHandler, slotPresenter8);
        flattenPackage = scopeWrapper11;
        ScopeWrapper scopeWrapper12 = new ScopeWrapper("UINT32", 11, 11, bounceHandler, slotPresenter4);
        injectConstraint = scopeWrapper12;
        SlotPresenter slotPresenter9 = SlotPresenter.expandArgs;
        ScopeWrapper scopeWrapper13 = new ScopeWrapper("ENUM", 12, 12, bounceHandler, slotPresenter9);
        storeCharset = scopeWrapper13;
        ScopeWrapper scopeWrapper14 = new ScopeWrapper("SFIXED32", 13, 13, bounceHandler, slotPresenter4);
        filterPayload = scopeWrapper14;
        ScopeWrapper scopeWrapper15 = new ScopeWrapper("SFIXED64", 14, 14, bounceHandler, slotPresenter3);
        inflateEdge = scopeWrapper15;
        ScopeWrapper scopeWrapper16 = new ScopeWrapper("SINT32", 15, 15, bounceHandler, slotPresenter4);
        queryModel = scopeWrapper16;
        ScopeWrapper scopeWrapper17 = new ScopeWrapper("SINT64", 16, 16, bounceHandler, slotPresenter3);
        packPackage = scopeWrapper17;
        ScopeWrapper scopeWrapper18 = new ScopeWrapper("GROUP", 17, 17, bounceHandler, slotPresenter7);
        unlockMessage = scopeWrapper18;
        BounceHandler bounceHandler2 = BounceHandler.VECTOR;
        ScopeWrapper scopeWrapper19 = new ScopeWrapper("DOUBLE_LIST", 18, 18, bounceHandler2, slotPresenter);
        bindBody = scopeWrapper19;
        ScopeWrapper scopeWrapper20 = new ScopeWrapper("FLOAT_LIST", 19, 19, bounceHandler2, slotPresenter2);
        dispatchTimezone = scopeWrapper20;
        ScopeWrapper scopeWrapper21 = new ScopeWrapper("INT64_LIST", 20, 20, bounceHandler2, slotPresenter3);
        parseAsset = scopeWrapper21;
        ScopeWrapper scopeWrapper22 = new ScopeWrapper("UINT64_LIST", 21, 21, bounceHandler2, slotPresenter3);
        mapJob = scopeWrapper22;
        ScopeWrapper scopeWrapper23 = new ScopeWrapper("INT32_LIST", 22, 22, bounceHandler2, slotPresenter4);
        attachCallback = scopeWrapper23;
        ScopeWrapper scopeWrapper24 = new ScopeWrapper("FIXED64_LIST", 23, 23, bounceHandler2, slotPresenter3);
        prepareTask = scopeWrapper24;
        ScopeWrapper scopeWrapper25 = new ScopeWrapper("FIXED32_LIST", 24, 24, bounceHandler2, slotPresenter4);
        updateAction = scopeWrapper25;
        ScopeWrapper scopeWrapper26 = new ScopeWrapper("BOOL_LIST", 25, 25, bounceHandler2, slotPresenter5);
        connectComponent = scopeWrapper26;
        ScopeWrapper scopeWrapper27 = new ScopeWrapper("STRING_LIST", 26, 26, bounceHandler2, slotPresenter6);
        startResource = scopeWrapper27;
        ScopeWrapper scopeWrapper28 = new ScopeWrapper("MESSAGE_LIST", 27, 27, bounceHandler2, slotPresenter7);
        formatPosition = scopeWrapper28;
        ScopeWrapper scopeWrapper29 = new ScopeWrapper("BYTES_LIST", 28, 28, bounceHandler2, slotPresenter8);
        resumeSignature = scopeWrapper29;
        ScopeWrapper scopeWrapper30 = new ScopeWrapper("UINT32_LIST", 29, 29, bounceHandler2, slotPresenter4);
        groupArchive = scopeWrapper30;
        ScopeWrapper scopeWrapper31 = new ScopeWrapper("ENUM_LIST", 30, 30, bounceHandler2, slotPresenter9);
        cancelArchive = scopeWrapper31;
        ScopeWrapper scopeWrapper32 = new ScopeWrapper("SFIXED32_LIST", 31, 31, bounceHandler2, slotPresenter4);
        resolveDelta = scopeWrapper32;
        ScopeWrapper scopeWrapper33 = new ScopeWrapper("SFIXED64_LIST", 32, 32, bounceHandler2, slotPresenter3);
        resetValue = scopeWrapper33;
        ScopeWrapper scopeWrapper34 = new ScopeWrapper("SINT32_LIST", 33, 33, bounceHandler2, slotPresenter4);
        serializeTask = scopeWrapper34;
        ScopeWrapper scopeWrapper35 = new ScopeWrapper("SINT64_LIST", 34, 34, bounceHandler2, slotPresenter3);
        injectField = scopeWrapper35;
        BounceHandler bounceHandler3 = BounceHandler.PACKED_VECTOR;
        ScopeWrapper scopeWrapper36 = new ScopeWrapper("DOUBLE_LIST_PACKED", 35, 35, bounceHandler3, slotPresenter);
        appendKey = scopeWrapper36;
        ScopeWrapper scopeWrapper37 = new ScopeWrapper("FLOAT_LIST_PACKED", 36, 36, bounceHandler3, slotPresenter2);
        computeTarget = scopeWrapper37;
        ScopeWrapper scopeWrapper38 = new ScopeWrapper("INT64_LIST_PACKED", 37, 37, bounceHandler3, slotPresenter3);
        locateSignal = scopeWrapper38;
        ScopeWrapper scopeWrapper39 = new ScopeWrapper("UINT64_LIST_PACKED", 38, 38, bounceHandler3, slotPresenter3);
        emitStrategy = scopeWrapper39;
        ScopeWrapper scopeWrapper40 = new ScopeWrapper("INT32_LIST_PACKED", 39, 39, bounceHandler3, slotPresenter4);
        handleFooter = scopeWrapper40;
        ScopeWrapper scopeWrapper41 = new ScopeWrapper("FIXED64_LIST_PACKED", 40, 40, bounceHandler3, slotPresenter3);
        purgeMetric = scopeWrapper41;
        ScopeWrapper scopeWrapper42 = new ScopeWrapper("FIXED32_LIST_PACKED", 41, 41, bounceHandler3, slotPresenter4);
        removeCount = scopeWrapper42;
        ScopeWrapper scopeWrapper43 = new ScopeWrapper("BOOL_LIST_PACKED", 42, 42, bounceHandler3, slotPresenter5);
        protectGauge = scopeWrapper43;
        ScopeWrapper scopeWrapper44 = new ScopeWrapper("UINT32_LIST_PACKED", 43, 43, bounceHandler3, slotPresenter4);
        refreshCounter = scopeWrapper44;
        ScopeWrapper scopeWrapper45 = new ScopeWrapper("ENUM_LIST_PACKED", 44, 44, bounceHandler3, slotPresenter9);
        compressVersion = scopeWrapper45;
        ScopeWrapper scopeWrapper46 = new ScopeWrapper("SFIXED32_LIST_PACKED", 45, 45, bounceHandler3, slotPresenter4);
        transformCurrency = scopeWrapper46;
        ScopeWrapper scopeWrapper47 = new ScopeWrapper("SFIXED64_LIST_PACKED", 46, 46, bounceHandler3, slotPresenter3);
        validateOffset = scopeWrapper47;
        ScopeWrapper scopeWrapper48 = new ScopeWrapper("SINT32_LIST_PACKED", 47, 47, bounceHandler3, slotPresenter4);
        peekDescriptor = scopeWrapper48;
        ScopeWrapper scopeWrapper49 = new ScopeWrapper("SINT64_LIST_PACKED", 48, 48, bounceHandler3, slotPresenter3);
        growCallback = scopeWrapper49;
        ScopeWrapper scopeWrapper50 = new ScopeWrapper("GROUP_LIST", 49, 49, bounceHandler2, slotPresenter7);
        drawConfig = scopeWrapper50;
        ScopeWrapper scopeWrapper51 = new ScopeWrapper("MAP", 50, 50, BounceHandler.MAP, SlotPresenter.attachConfig);
        normalizeBundle = scopeWrapper51;
        expandScope = new ScopeWrapper[]{scopeWrapper, scopeWrapper2, scopeWrapper3, scopeWrapper4, scopeWrapper5, scopeWrapper6, scopeWrapper7, scopeWrapper8, scopeWrapper9, scopeWrapper10, scopeWrapper11, scopeWrapper12, scopeWrapper13, scopeWrapper14, scopeWrapper15, scopeWrapper16, scopeWrapper17, scopeWrapper18, scopeWrapper19, scopeWrapper20, scopeWrapper21, scopeWrapper22, scopeWrapper23, scopeWrapper24, scopeWrapper25, scopeWrapper26, scopeWrapper27, scopeWrapper28, scopeWrapper29, scopeWrapper30, scopeWrapper31, scopeWrapper32, scopeWrapper33, scopeWrapper34, scopeWrapper35, scopeWrapper36, scopeWrapper37, scopeWrapper38, scopeWrapper39, scopeWrapper40, scopeWrapper41, scopeWrapper42, scopeWrapper43, scopeWrapper44, scopeWrapper45, scopeWrapper46, scopeWrapper47, scopeWrapper48, scopeWrapper49, scopeWrapper50, scopeWrapper51};
        closePayload = new Type[0];
        ScopeWrapper[] values = values();
        commitBounds = new ScopeWrapper[values.length];
        for (ScopeWrapper scopeWrapper52 : values) {
            commitBounds[scopeWrapper52.notifyMessage] = scopeWrapper52;
        }
    }

    public ScopeWrapper(String str, int i, int i2, BounceHandler bounceHandler, SlotPresenter slotPresenter) {
        int i3;
        this.notifyMessage = i2;
        this.connectPatch = bounceHandler;
        this.reduceScope = slotPresenter;
        int i4 = ActivityMutator.evictLayout[bounceHandler.ordinal()];
        if (i4 == 1) {
            this.attachConfig = slotPresenter.evictLayout();
        } else if (i4 != 2) {
            this.attachConfig = null;
        } else {
            this.attachConfig = slotPresenter.evictLayout();
        }
        this.resetDelta = (bounceHandler != BounceHandler.SCALAR || (i3 = ActivityMutator.growPayload[slotPresenter.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static ScopeWrapper valueOf(String str) {
        return (ScopeWrapper) Enum.valueOf(ScopeWrapper.class, str);
    }

    public static ScopeWrapper[] values() {
        return (ScopeWrapper[]) expandScope.clone();
    }

    public int evictLayout() {
        return this.notifyMessage;
    }
}
