package com.zettle.sdk.feature.taptopay.ui.tipping.component;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action;", "", com.sun.jna.Callback.METHOD_NAME, "getAction", "(Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Action"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KeyPad extends android.widget.FrameLayout {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ KeyPad(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KeyPad(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.widget.FrameLayout.inflate(context, com.zettle.sdk.feature.taptopay.ui.R.layout.view_taptopay_keypad, this);
        android.view.View findViewById = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(1);
        ((android.widget.FrameLayout) findViewById).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById2 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number2 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(2);
        ((android.widget.FrameLayout) findViewById2).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById3 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number3 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(3);
        ((android.widget.FrameLayout) findViewById3).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById4 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number4 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(4);
        ((android.widget.FrameLayout) findViewById4).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById5 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_5);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number5 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(5);
        ((android.widget.FrameLayout) findViewById5).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById6 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_6);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number6 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(6);
        ((android.widget.FrameLayout) findViewById6).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById7 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_7);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number7 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(7);
        ((android.widget.FrameLayout) findViewById7).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById8 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number8 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(8);
        ((android.widget.FrameLayout) findViewById8).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById9 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_9);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number9 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(9);
        ((android.widget.FrameLayout) findViewById9).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById10 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number number10 = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(0);
        ((android.widget.FrameLayout) findViewById10).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById11 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_00);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero doubleZero = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero(null, 1, 0 == true ? 1 : 0);
        ((android.widget.FrameLayout) findViewById11).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
        android.view.View findViewById12 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.number_del);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Delete delete = com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Delete.INSTANCE;
        ((android.widget.FrameLayout) findViewById12).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.$r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.this, this, view);
            }
        });
    }

    public final void getAction(kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getHighResolutionOutputSizeshNQ4ISI = callback;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action;", "", "<init>", "()V", "Delete", "DoubleZero", "Number", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action$Delete;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action$DoubleZero;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action$Number;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Action {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action$Delete;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Delete extends com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action {
            public static final int $stable = 0;
            public static final com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Delete INSTANCE = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Delete();

            private Delete() {
                super(null);
            }
        }

        private Action() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action$DoubleZero;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class DoubleZero extends com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action {
            public static final int $stable = 0;
            private final java.lang.String value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoubleZero(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.value = str;
            }

            public /* synthetic */ DoubleZero(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX : str);
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DoubleZero() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action$Number;", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/KeyPad$Action;", "", "input", "<init>", "(I)V", com.visa.cbp.getEncExpo.warmup, "getInput", "()I"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Number extends com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action {
            public static final int $stable = 0;
            private final int input;

            public Number(int i) {
                super(null);
                this.input = i;
            }

            public final int getInput() {
                return this.input;
            }
        }

        public /* synthetic */ Action(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$QGDN2C_7N8QTftpy1kNQLbXUlDY(com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action action, com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad keyPad, android.view.View view) {
        com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action doubleZero;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyPad, "");
        if (action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Delete) {
            doubleZero = com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Delete.INSTANCE;
        } else if (action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number) {
            doubleZero = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number(((com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.Number) action).getInput());
        } else {
            if (!(action instanceof com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            doubleZero = new com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero(((com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action.DoubleZero) action).getValue());
        }
        kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.ui.tipping.component.KeyPad.Action, kotlin.Unit> function1 = keyPad.getHighResolutionOutputSizeshNQ4ISI;
        if (function1 != null) {
            function1.invoke(doubleZero);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyPad(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KeyPad(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
