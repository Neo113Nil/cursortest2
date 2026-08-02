package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0004\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction;", "", "<init>", "()V", "Companion", "Barcode", "Document", "Face", "NONE", "Lcom/miteksystems/misnap/core/UserAction$Barcode;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "Lcom/miteksystems/misnap/core/UserAction$NONE;"}, k = 1, mv = {1, 8, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class UserAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.core.UserAction.Companion INSTANCE = new com.miteksystems.misnap.core.UserAction.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> f4068a = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.a.f4097a);

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b7\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Barcode;", "Lcom/miteksystems/misnap/core/UserAction;", "<init>", "()V", "Companion", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND, "Lcom/miteksystems/misnap/core/UserAction$Barcode$NOT_FOUND;"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    /* loaded from: classes10.dex */
    public static abstract class Barcode extends com.miteksystems.misnap.core.UserAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.UserAction.Barcode.Companion INSTANCE = new com.miteksystems.misnap.core.UserAction.Barcode.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Barcode.a.f4070a);

        private Barcode() {
            super(null);
        }

        public /* synthetic */ Barcode(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Barcode$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction$Barcode;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Barcode> serializer() {
                return (kotlinx.serialization.KSerializer) com.miteksystems.misnap.core.UserAction.Barcode.b.getValue();
            }

            private Companion() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Barcode$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Barcode;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class NOT_FOUND extends com.miteksystems.misnap.core.UserAction.Barcode {
            public static final com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND INSTANCE = new com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.a.f4069a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.a f4069a = new com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.class.getSimpleName());
                return sb.toString();
            }

            private NOT_FOUND() {
                super(null);
            }
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.miteksystems.misnap.core.UserAction.Barcode.a f4070a = new com.miteksystems.misnap.core.UserAction.Barcode.a();

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.SealedClassSerializer("com.miteksystems.misnap.core.UserAction.Barcode", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Barcode.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }

            a() {
                super(0);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00042\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document;", "Lcom/miteksystems/misnap/core/UserAction;", "<init>", "()V", "Companion", "HOLD_STILL", "MRZ_NOT_FOUND", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND, "PRESS_MANUAL_BUTTON", "REDUCE_GLARE", "STRAIGHTEN", "TOO_BRIGHT", "TOO_CLOSE", "TOO_DARK", "TOO_FAR", "USE_DARK_BACKGROUND", "USE_PLAIN_BACKGROUND", "WRONG_DOCUMENT", "Lcom/miteksystems/misnap/core/UserAction$Document$HOLD_STILL;", "Lcom/miteksystems/misnap/core/UserAction$Document$MRZ_NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Document$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Document$PRESS_MANUAL_BUTTON;", "Lcom/miteksystems/misnap/core/UserAction$Document$REDUCE_GLARE;", "Lcom/miteksystems/misnap/core/UserAction$Document$STRAIGHTEN;", "Lcom/miteksystems/misnap/core/UserAction$Document$TOO_BRIGHT;", "Lcom/miteksystems/misnap/core/UserAction$Document$TOO_CLOSE;", "Lcom/miteksystems/misnap/core/UserAction$Document$TOO_DARK;", "Lcom/miteksystems/misnap/core/UserAction$Document$TOO_FAR;", "Lcom/miteksystems/misnap/core/UserAction$Document$USE_DARK_BACKGROUND;", "Lcom/miteksystems/misnap/core/UserAction$Document$USE_PLAIN_BACKGROUND;", "Lcom/miteksystems/misnap/core/UserAction$Document$WRONG_DOCUMENT;"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    /* loaded from: classes10.dex */
    public static abstract class Document extends com.miteksystems.misnap.core.UserAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.UserAction.Document.Companion INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.a.f4084a);

        private Document() {
            super(null);
        }

        public /* synthetic */ Document(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document> serializer() {
                return (kotlinx.serialization.KSerializer) com.miteksystems.misnap.core.UserAction.Document.b.getValue();
            }

            private Companion() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$HOLD_STILL;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class HOLD_STILL extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.a.f4071a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.a f4071a = new com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL", com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.class.getSimpleName());
                return sb.toString();
            }

            private HOLD_STILL() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$MRZ_NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class MRZ_NOT_FOUND extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.a.f4072a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.a f4072a = new com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND", com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.class.getSimpleName());
                return sb.toString();
            }

            private MRZ_NOT_FOUND() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class NOT_FOUND extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.a.f4073a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.a f4073a = new com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.class.getSimpleName());
                return sb.toString();
            }

            private NOT_FOUND() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$PRESS_MANUAL_BUTTON;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class PRESS_MANUAL_BUTTON extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.a.f4074a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.a f4074a = new com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON", com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.class.getSimpleName());
                return sb.toString();
            }

            private PRESS_MANUAL_BUTTON() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$REDUCE_GLARE;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class REDUCE_GLARE extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.a.f4075a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.a f4075a = new com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE", com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.class.getSimpleName());
                return sb.toString();
            }

            private REDUCE_GLARE() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$STRAIGHTEN;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class STRAIGHTEN extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.a.f4076a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.a f4076a = new com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN", com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.class.getSimpleName());
                return sb.toString();
            }

            private STRAIGHTEN() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$TOO_BRIGHT;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class TOO_BRIGHT extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.a.f4077a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.a f4077a = new com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT", com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.class.getSimpleName());
                return sb.toString();
            }

            private TOO_BRIGHT() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$TOO_CLOSE;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class TOO_CLOSE extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.a.f4078a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.a f4078a = new com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE", com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.class.getSimpleName());
                return sb.toString();
            }

            private TOO_CLOSE() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$TOO_DARK;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class TOO_DARK extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.TOO_DARK INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.TOO_DARK();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.a.f4079a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.TOO_DARK> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.a f4079a = new com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_DARK", com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.class.getSimpleName());
                return sb.toString();
            }

            private TOO_DARK() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$TOO_FAR;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class TOO_FAR extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.TOO_FAR INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.TOO_FAR();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.a.f4080a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.TOO_FAR> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.a f4080a = new com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_FAR", com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.class.getSimpleName());
                return sb.toString();
            }

            private TOO_FAR() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$USE_DARK_BACKGROUND;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class USE_DARK_BACKGROUND extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.a.f4081a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.a f4081a = new com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND", com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.class.getSimpleName());
                return sb.toString();
            }

            private USE_DARK_BACKGROUND() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$USE_PLAIN_BACKGROUND;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class USE_PLAIN_BACKGROUND extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.a.f4082a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.a f4082a = new com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND", com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.class.getSimpleName());
                return sb.toString();
            }

            private USE_PLAIN_BACKGROUND() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Document$WRONG_DOCUMENT;", "Lcom/miteksystems/misnap/core/UserAction$Document;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class WRONG_DOCUMENT extends com.miteksystems.misnap.core.UserAction.Document {
            public static final com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT INSTANCE = new com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.a.f4083a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.a f4083a = new com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT", com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.class.getSimpleName());
                return sb.toString();
            }

            private WRONG_DOCUMENT() {
                super(null);
            }
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.miteksystems.misnap.core.UserAction.Document.a f4084a = new com.miteksystems.misnap.core.UserAction.Document.a();

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.SealedClassSerializer("com.miteksystems.misnap.core.UserAction.Document", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL", com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND", com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON", com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE", com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN", com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT", com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE", com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_DARK", com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_FAR", com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND", com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND", com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT", com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }

            a() {
                super(0);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00042\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face;", "Lcom/miteksystems/misnap/core/UserAction;", "<init>", "()V", "Companion", "HOLD_STILL", "MULTIPLE_FACES", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND, "OPEN_EYES", "PRESS_MANUAL_BUTTON", "SMILE", "STOP_SMILE", "STRAIGHTEN", "TOO_CLOSE", "TOO_FAR", "Lcom/miteksystems/misnap/core/UserAction$Face$HOLD_STILL;", "Lcom/miteksystems/misnap/core/UserAction$Face$MULTIPLE_FACES;", "Lcom/miteksystems/misnap/core/UserAction$Face$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Face$OPEN_EYES;", "Lcom/miteksystems/misnap/core/UserAction$Face$PRESS_MANUAL_BUTTON;", "Lcom/miteksystems/misnap/core/UserAction$Face$SMILE;", "Lcom/miteksystems/misnap/core/UserAction$Face$STOP_SMILE;", "Lcom/miteksystems/misnap/core/UserAction$Face$STRAIGHTEN;", "Lcom/miteksystems/misnap/core/UserAction$Face$TOO_CLOSE;", "Lcom/miteksystems/misnap/core/UserAction$Face$TOO_FAR;"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    /* loaded from: classes10.dex */
    public static abstract class Face extends com.miteksystems.misnap.core.UserAction {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.UserAction.Face.Companion INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.a.f4095a);

        private Face() {
            super(null);
        }

        public /* synthetic */ Face(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face> serializer() {
                return (kotlinx.serialization.KSerializer) com.miteksystems.misnap.core.UserAction.Face.b.getValue();
            }

            private Companion() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$HOLD_STILL;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class HOLD_STILL extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.a.f4085a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.a f4085a = new com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL", com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.class.getSimpleName());
                return sb.toString();
            }

            private HOLD_STILL() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$MULTIPLE_FACES;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class MULTIPLE_FACES extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.a.f4086a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.a f4086a = new com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES", com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.class.getSimpleName());
                return sb.toString();
            }

            private MULTIPLE_FACES() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$NOT_FOUND;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class NOT_FOUND extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.a.f4087a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.a f4087a = new com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.class.getSimpleName());
                return sb.toString();
            }

            private NOT_FOUND() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$OPEN_EYES;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class OPEN_EYES extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.a.f4088a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.a f4088a = new com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES", com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.class.getSimpleName());
                return sb.toString();
            }

            private OPEN_EYES() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$PRESS_MANUAL_BUTTON;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class PRESS_MANUAL_BUTTON extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.a.f4089a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.a f4089a = new com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON", com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.class.getSimpleName());
                return sb.toString();
            }

            private PRESS_MANUAL_BUTTON() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$SMILE;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class SMILE extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.SMILE INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.SMILE();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.SMILE.a.f4090a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.SMILE> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.SMILE.a f4090a = new com.miteksystems.misnap.core.UserAction.Face.SMILE.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.SMILE", com.miteksystems.misnap.core.UserAction.Face.SMILE.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.SMILE.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.SMILE.class.getSimpleName());
                return sb.toString();
            }

            private SMILE() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$STOP_SMILE;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class STOP_SMILE extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.a.f4091a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.a f4091a = new com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE", com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.class.getSimpleName());
                return sb.toString();
            }

            private STOP_SMILE() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$STRAIGHTEN;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class STRAIGHTEN extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.a.f4092a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.a f4092a = new com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN", com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.class.getSimpleName());
                return sb.toString();
            }

            private STRAIGHTEN() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$TOO_CLOSE;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class TOO_CLOSE extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.a.f4093a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.a f4093a = new com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE", com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.class.getSimpleName());
                return sb.toString();
            }

            private TOO_CLOSE() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Face$TOO_FAR;", "Lcom/miteksystems/misnap/core/UserAction$Face;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class TOO_FAR extends com.miteksystems.misnap.core.UserAction.Face {
            public static final com.miteksystems.misnap.core.UserAction.Face.TOO_FAR INSTANCE = new com.miteksystems.misnap.core.UserAction.Face.TOO_FAR();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.a.f4094a);

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.Face.TOO_FAR> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

                /* renamed from: a, reason: collision with root package name */
                public static final com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.a f4094a = new com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.a();

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_FAR", com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.INSTANCE, new java.lang.annotation.Annotation[0]);
                }

                a() {
                    super(0);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.class.getSuperclass().getSimpleName());
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.class.getSimpleName());
                return sb.toString();
            }

            private TOO_FAR() {
                super(null);
            }
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.miteksystems.misnap.core.UserAction.Face.a f4095a = new com.miteksystems.misnap.core.UserAction.Face.a();

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.SealedClassSerializer("com.miteksystems.misnap.core.UserAction.Face", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.SMILE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL", com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES", com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES", com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON", com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.SMILE", com.miteksystems.misnap.core.UserAction.Face.SMILE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE", com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN", com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE", com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_FAR", com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }

            a() {
                super(0);
            }
        }
    }

    public /* synthetic */ UserAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/UserAction;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction> serializer() {
            return (kotlinx.serialization.KSerializer) com.miteksystems.misnap.core.UserAction.f4068a.getValue();
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/UserAction$NONE;", "Lcom/miteksystems/misnap/core/UserAction;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes10.dex */
    public static final class NONE extends com.miteksystems.misnap.core.UserAction {
        public static final com.miteksystems.misnap.core.UserAction.NONE INSTANCE = new com.miteksystems.misnap.core.UserAction.NONE();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.UserAction.NONE.a.f4096a);

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.UserAction.NONE> serializer() {
            return (kotlinx.serialization.KSerializer) b.getValue();
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.miteksystems.misnap.core.UserAction.NONE.a f4096a = new com.miteksystems.misnap.core.UserAction.NONE.a();

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.NONE", com.miteksystems.misnap.core.UserAction.NONE.INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            a() {
                super(0);
            }
        }

        public final java.lang.String toString() {
            java.lang.String simpleName = com.miteksystems.misnap.core.UserAction.NONE.class.getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
            return simpleName;
        }

        private NONE() {
            super(null);
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.miteksystems.misnap.core.UserAction.a f4097a = new com.miteksystems.misnap.core.UserAction.a();

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
            return new kotlinx.serialization.SealedClassSerializer("com.miteksystems.misnap.core.UserAction", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.SMILE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.UserAction.NONE.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL", com.miteksystems.misnap.core.UserAction.Document.HOLD_STILL.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND", com.miteksystems.misnap.core.UserAction.Document.MRZ_NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Document.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON", com.miteksystems.misnap.core.UserAction.Document.PRESS_MANUAL_BUTTON.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE", com.miteksystems.misnap.core.UserAction.Document.REDUCE_GLARE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN", com.miteksystems.misnap.core.UserAction.Document.STRAIGHTEN.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT", com.miteksystems.misnap.core.UserAction.Document.TOO_BRIGHT.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE", com.miteksystems.misnap.core.UserAction.Document.TOO_CLOSE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_DARK", com.miteksystems.misnap.core.UserAction.Document.TOO_DARK.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.TOO_FAR", com.miteksystems.misnap.core.UserAction.Document.TOO_FAR.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND", com.miteksystems.misnap.core.UserAction.Document.USE_DARK_BACKGROUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND", com.miteksystems.misnap.core.UserAction.Document.USE_PLAIN_BACKGROUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT", com.miteksystems.misnap.core.UserAction.Document.WRONG_DOCUMENT.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL", com.miteksystems.misnap.core.UserAction.Face.HOLD_STILL.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES", com.miteksystems.misnap.core.UserAction.Face.MULTIPLE_FACES.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND", com.miteksystems.misnap.core.UserAction.Face.NOT_FOUND.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES", com.miteksystems.misnap.core.UserAction.Face.OPEN_EYES.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON", com.miteksystems.misnap.core.UserAction.Face.PRESS_MANUAL_BUTTON.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.SMILE", com.miteksystems.misnap.core.UserAction.Face.SMILE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE", com.miteksystems.misnap.core.UserAction.Face.STOP_SMILE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN", com.miteksystems.misnap.core.UserAction.Face.STRAIGHTEN.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE", com.miteksystems.misnap.core.UserAction.Face.TOO_CLOSE.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.Face.TOO_FAR", com.miteksystems.misnap.core.UserAction.Face.TOO_FAR.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.core.UserAction.NONE", com.miteksystems.misnap.core.UserAction.NONE.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
        }

        a() {
            super(0);
        }
    }

    private UserAction() {
    }
}
