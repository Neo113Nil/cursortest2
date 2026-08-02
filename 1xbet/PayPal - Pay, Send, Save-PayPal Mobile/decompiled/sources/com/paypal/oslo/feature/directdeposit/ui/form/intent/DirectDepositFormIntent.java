package com.paypal.oslo.feature.directdeposit.ui.form.intent;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;", "", "<init>", "()V", "UpdateCompanyName", "UpdateAmountType", "UpdatePercentageAmount", "UpdateDollarAmount", "SignESignature", "Submit", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$SignESignature;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$Submit;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateAmountType;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateCompanyName;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateDollarAmount;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdatePercentageAmount;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DirectDepositFormIntent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateCompanyName;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;", "", "companyName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateCompanyName;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCompanyName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateCompanyName extends com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent {
        public static final int $stable = 0;
        private final java.lang.String companyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateCompanyName(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.companyName = str;
        }

        public final java.lang.String getCompanyName() {
            return this.companyName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.companyName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCompanyName(companyName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.companyName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName) && kotlin.jvm.internal.Intrinsics.areEqual(this.companyName, ((com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName) other).companyName);
        }

        public final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName copy(java.lang.String companyName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companyName, "");
            return new com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName(companyName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCompanyName() {
            return this.companyName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName copy$default(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateCompanyName updateCompanyName, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateCompanyName.companyName;
            }
            return updateCompanyName.copy(str);
        }
    }

    private DirectDepositFormIntent() {
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateAmountType;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;", "", "isPercentage", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateAmountType;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateAmountType extends com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent {
        public static final int $stable = 0;
        private final boolean isPercentage;

        public UpdateAmountType(boolean z) {
            super(null);
            this.isPercentage = z;
        }

        public final boolean isPercentage() {
            return this.isPercentage;
        }

        public final java.lang.String toString() {
            boolean z = this.isPercentage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateAmountType(isPercentage=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isPercentage);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType) && this.isPercentage == ((com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType) other).isPercentage;
        }

        public final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType copy(boolean isPercentage) {
            return new com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType(isPercentage);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsPercentage() {
            return this.isPercentage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType copy$default(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateAmountType updateAmountType, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = updateAmountType.isPercentage;
            }
            return updateAmountType.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdatePercentageAmount;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdatePercentageAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdatePercentageAmount extends com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatePercentageAmount(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePercentageAmount(amount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount) other).amount);
        }

        public final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount copy$default(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdatePercentageAmount updatePercentageAmount, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updatePercentageAmount.amount;
            }
            return updatePercentageAmount.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateDollarAmount;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$UpdateDollarAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateDollarAmount extends com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateDollarAmount(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateDollarAmount(amount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount) other).amount);
        }

        public final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount copy$default(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.UpdateDollarAmount updateDollarAmount, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = updateDollarAmount.amount;
            }
            return updateDollarAmount.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$SignESignature;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "copy", "(Landroid/graphics/Bitmap;)Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$SignESignature;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "getBitmap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SignESignature extends com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent {
        public static final int $stable = 8;
        private final android.graphics.Bitmap bitmap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignESignature(android.graphics.Bitmap bitmap) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            this.bitmap = bitmap;
        }

        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public final java.lang.String toString() {
            android.graphics.Bitmap bitmap = this.bitmap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignESignature(bitmap=");
            sb.append(bitmap);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.bitmap.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature) && kotlin.jvm.internal.Intrinsics.areEqual(this.bitmap, ((com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature) other).bitmap);
        }

        public final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature copy(android.graphics.Bitmap bitmap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            return new com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature(bitmap);
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getBitmap() {
            return this.bitmap;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature copy$default(com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.SignESignature signESignature, android.graphics.Bitmap bitmap, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bitmap = signESignature.bitmap;
            }
            return signESignature.copy(bitmap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent$Submit;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/intent/DirectDepositFormIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Submit extends com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.Submit INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.Submit();

        public final int hashCode() {
            return -653478231;
        }

        private Submit() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Submit";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.form.intent.DirectDepositFormIntent.Submit)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DirectDepositFormIntent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
