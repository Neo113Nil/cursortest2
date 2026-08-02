package com.plaid.link.result;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000e2\u00020\u0001:\u0007\u000f\u000e\u0010\u0011\u0012\u0013\u0014B\u001d\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype;", "Landroid/os/Parcelable;", "", "json", "Lcom/plaid/link/result/LinkAccountType;", "accountType", "<init>", "(Ljava/lang/String;Lcom/plaid/link/result/LinkAccountType;)V", "Lcom/plaid/link/result/LinkAccountType;", "getAccountType", "()Lcom/plaid/link/result/LinkAccountType;", "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "Companion", "CREDIT", "DEPOSITORY", "INVESTMENT", "LOAN_SUBTYPE", "OTHER", "UNKNOWN", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$UNKNOWN;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class LinkAccountSubtype implements android.os.Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.link.result.LinkAccountSubtype.Companion INSTANCE = new com.plaid.link.result.LinkAccountSubtype.Companion(null);
    private static final kotlin.Lazy<java.util.Map<com.plaid.link.result.LinkAccountType, java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype>>> accountTypeToMap$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<com.plaid.link.result.LinkAccountType, ? extends java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype>>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$accountTypeToMap$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<com.plaid.link.result.LinkAccountType, ? extends java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype>> invoke() {
            java.util.Map creditMap;
            java.util.Map depositoryMap;
            java.util.Map investmentMap;
            java.util.Map loanMap;
            com.plaid.link.result.LinkAccountType.CREDIT credit = com.plaid.link.result.LinkAccountType.CREDIT.INSTANCE;
            com.plaid.link.result.LinkAccountSubtype.Companion companion = com.plaid.link.result.LinkAccountSubtype.INSTANCE;
            creditMap = companion.getCreditMap();
            kotlin.Pair pair = kotlin.TuplesKt.to(credit, creditMap);
            com.plaid.link.result.LinkAccountType.DEPOSITORY depository = com.plaid.link.result.LinkAccountType.DEPOSITORY.INSTANCE;
            depositoryMap = companion.getDepositoryMap();
            kotlin.Pair pair2 = kotlin.TuplesKt.to(depository, depositoryMap);
            com.plaid.link.result.LinkAccountType.INVESTMENT investment = com.plaid.link.result.LinkAccountType.INVESTMENT.INSTANCE;
            investmentMap = companion.getInvestmentMap();
            kotlin.Pair pair3 = kotlin.TuplesKt.to(investment, investmentMap);
            com.plaid.link.result.LinkAccountType.LOAN loan = com.plaid.link.result.LinkAccountType.LOAN.INSTANCE;
            loanMap = companion.getLoanMap();
            return kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, kotlin.TuplesKt.to(loan, loanMap));
        }
    });
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype.CREDIT>> creditMap$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype.CREDIT>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$creditMap$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype.CREDIT> invoke() {
            com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL all = com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL.INSTANCE;
            kotlin.Pair pair = kotlin.TuplesKt.to(all.getJson(), all);
            com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD credit_card = com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD.INSTANCE;
            kotlin.Pair pair2 = kotlin.TuplesKt.to(credit_card.getJson(), credit_card);
            com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT paypal_credit = com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT.INSTANCE;
            return kotlin.collections.MapsKt.mapOf(pair, pair2, kotlin.TuplesKt.to(paypal_credit.getJson(), paypal_credit));
        }
    });
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype.DEPOSITORY>> depositoryMap$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$depositoryMap$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY> invoke() {
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL all = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL.INSTANCE;
            kotlin.Pair pair = kotlin.TuplesKt.to(all.getJson(), all);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT cash_management = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT.INSTANCE;
            kotlin.Pair pair2 = kotlin.TuplesKt.to(cash_management.getJson(), cash_management);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD cd = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD.INSTANCE;
            kotlin.Pair pair3 = kotlin.TuplesKt.to(cd.getJson(), cd);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING checking = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING.INSTANCE;
            kotlin.Pair pair4 = kotlin.TuplesKt.to(checking.getJson(), checking);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT ebt = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT.INSTANCE;
            kotlin.Pair pair5 = kotlin.TuplesKt.to(ebt.getJson(), ebt);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA hsa = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA.INSTANCE;
            kotlin.Pair pair6 = kotlin.TuplesKt.to(hsa.getJson(), hsa);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET money_market = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET.INSTANCE;
            kotlin.Pair pair7 = kotlin.TuplesKt.to(money_market.getJson(), money_market);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL paypal = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL.INSTANCE;
            kotlin.Pair pair8 = kotlin.TuplesKt.to(paypal.getJson(), paypal);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID prepaid = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID.INSTANCE;
            kotlin.Pair pair9 = kotlin.TuplesKt.to(prepaid.getJson(), prepaid);
            com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS savings = com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS.INSTANCE;
            return kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, kotlin.TuplesKt.to(savings.getJson(), savings));
        }
    });
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype.INVESTMENT>> investmentMap$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$investmentMap$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT> invoke() {
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL all = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL.INSTANCE;
            kotlin.Pair pair = kotlin.TuplesKt.to(all.getJson(), all);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE brokerage = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE.INSTANCE;
            kotlin.Pair pair2 = kotlin.TuplesKt.to(brokerage.getJson(), brokerage);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA cash_isa = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA.INSTANCE;
            kotlin.Pair pair3 = kotlin.TuplesKt.to(cash_isa.getJson(), cash_isa);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT education_savings_account = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT.INSTANCE;
            kotlin.Pair pair4 = kotlin.TuplesKt.to(education_savings_account.getJson(), education_savings_account);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY fixed_annuity = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY.INSTANCE;
            kotlin.Pair pair5 = kotlin.TuplesKt.to(fixed_annuity.getJson(), fixed_annuity);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC gic = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC.INSTANCE;
            kotlin.Pair pair6 = kotlin.TuplesKt.to(gic.getJson(), gic);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT health_reimbursement_arrangement = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT.INSTANCE;
            kotlin.Pair pair7 = kotlin.TuplesKt.to(health_reimbursement_arrangement.getJson(), health_reimbursement_arrangement);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA hsa = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA.INSTANCE;
            kotlin.Pair pair8 = kotlin.TuplesKt.to(hsa.getJson(), hsa);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A investment_401a = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A.INSTANCE;
            kotlin.Pair pair9 = kotlin.TuplesKt.to(investment_401a.getJson(), investment_401a);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K investment_401k = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K.INSTANCE;
            kotlin.Pair pair10 = kotlin.TuplesKt.to(investment_401k.getJson(), investment_401k);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B investment_403b = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B.INSTANCE;
            kotlin.Pair pair11 = kotlin.TuplesKt.to(investment_403b.getJson(), investment_403b);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B investment_457b = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B.INSTANCE;
            kotlin.Pair pair12 = kotlin.TuplesKt.to(investment_457b.getJson(), investment_457b);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529 investment_529 = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529.INSTANCE;
            kotlin.Pair pair13 = kotlin.TuplesKt.to(investment_529.getJson(), investment_529);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA ira = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA.INSTANCE;
            kotlin.Pair pair14 = kotlin.TuplesKt.to(ira.getJson(), ira);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA isa = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA.INSTANCE;
            kotlin.Pair pair15 = kotlin.TuplesKt.to(isa.getJson(), isa);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH keogh = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH.INSTANCE;
            kotlin.Pair pair16 = kotlin.TuplesKt.to(keogh.getJson(), keogh);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF lif = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF.INSTANCE;
            kotlin.Pair pair17 = kotlin.TuplesKt.to(lif.getJson(), lif);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA lira = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA.INSTANCE;
            kotlin.Pair pair18 = kotlin.TuplesKt.to(lira.getJson(), lira);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF lrif = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF.INSTANCE;
            kotlin.Pair pair19 = kotlin.TuplesKt.to(lrif.getJson(), lrif);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP lrsp = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP.INSTANCE;
            kotlin.Pair pair20 = kotlin.TuplesKt.to(lrsp.getJson(), lrsp);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND mutual_fund = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND.INSTANCE;
            kotlin.Pair pair21 = kotlin.TuplesKt.to(mutual_fund.getJson(), mutual_fund);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT non_taxable_brokerage_accountt = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT.INSTANCE;
            kotlin.Pair pair22 = kotlin.TuplesKt.to(non_taxable_brokerage_accountt.getJson(), non_taxable_brokerage_accountt);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION pension = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION.INSTANCE;
            kotlin.Pair pair23 = kotlin.TuplesKt.to(pension.getJson(), pension);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF prif = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF.INSTANCE;
            kotlin.Pair pair24 = kotlin.TuplesKt.to(prif.getJson(), prif);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN profit_sharing_plan = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN.INSTANCE;
            kotlin.Pair pair25 = kotlin.TuplesKt.to(profit_sharing_plan.getJson(), profit_sharing_plan);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR qshr = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR.INSTANCE;
            kotlin.Pair pair26 = kotlin.TuplesKt.to(qshr.getJson(), qshr);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP rdsp = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP.INSTANCE;
            kotlin.Pair pair27 = kotlin.TuplesKt.to(rdsp.getJson(), rdsp);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP resp = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP.INSTANCE;
            kotlin.Pair pair28 = kotlin.TuplesKt.to(resp.getJson(), resp);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT retirement = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT.INSTANCE;
            kotlin.Pair pair29 = kotlin.TuplesKt.to(retirement.getJson(), retirement);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF rlif = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF.INSTANCE;
            kotlin.Pair pair30 = kotlin.TuplesKt.to(rlif.getJson(), rlif);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH roth = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH.INSTANCE;
            kotlin.Pair pair31 = kotlin.TuplesKt.to(roth.getJson(), roth);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K roth_401k = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K.INSTANCE;
            kotlin.Pair pair32 = kotlin.TuplesKt.to(roth_401k.getJson(), roth_401k);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF rrif = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF.INSTANCE;
            kotlin.Pair pair33 = kotlin.TuplesKt.to(rrif.getJson(), rrif);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP rrsp = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP.INSTANCE;
            kotlin.Pair pair34 = kotlin.TuplesKt.to(rrsp.getJson(), rrsp);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP sarsep = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP.INSTANCE;
            kotlin.Pair pair35 = kotlin.TuplesKt.to(sarsep.getJson(), sarsep);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA sep_ira = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA.INSTANCE;
            kotlin.Pair pair36 = kotlin.TuplesKt.to(sep_ira.getJson(), sep_ira);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA simple_ira = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA.INSTANCE;
            kotlin.Pair pair37 = kotlin.TuplesKt.to(simple_ira.getJson(), simple_ira);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP sipp = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP.INSTANCE;
            kotlin.Pair pair38 = kotlin.TuplesKt.to(sipp.getJson(), sipp);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN stock_plan = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN.INSTANCE;
            kotlin.Pair pair39 = kotlin.TuplesKt.to(stock_plan.getJson(), stock_plan);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA tfsa = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA.INSTANCE;
            kotlin.Pair pair40 = kotlin.TuplesKt.to(tfsa.getJson(), tfsa);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN thrift_savings_plan = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN.INSTANCE;
            kotlin.Pair pair41 = kotlin.TuplesKt.to(thrift_savings_plan.getJson(), thrift_savings_plan);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST trust = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST.INSTANCE;
            kotlin.Pair pair42 = kotlin.TuplesKt.to(trust.getJson(), trust);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA ugma = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA.INSTANCE;
            kotlin.Pair pair43 = kotlin.TuplesKt.to(ugma.getJson(), ugma);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA utma = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA.INSTANCE;
            kotlin.Pair pair44 = kotlin.TuplesKt.to(utma.getJson(), utma);
            com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY variable_annuity = com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY.INSTANCE;
            return kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, kotlin.TuplesKt.to(variable_annuity.getJson(), variable_annuity));
        }
    });
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE>> loanMap$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE>>() { // from class: com.plaid.link.result.LinkAccountSubtype$Companion$loanMap$2
        @Override // kotlin.jvm.functions.Function0
        public final java.util.Map<java.lang.String, ? extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE> invoke() {
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL all = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL.INSTANCE;
            kotlin.Pair pair = kotlin.TuplesKt.to(all.getJson(), all);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO auto = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO.INSTANCE;
            kotlin.Pair pair2 = kotlin.TuplesKt.to(auto.getJson(), auto);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS business = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS.INSTANCE;
            kotlin.Pair pair3 = kotlin.TuplesKt.to(business.getJson(), business);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL commercial = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL.INSTANCE;
            kotlin.Pair pair4 = kotlin.TuplesKt.to(commercial.getJson(), commercial);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION construction = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION.INSTANCE;
            kotlin.Pair pair5 = kotlin.TuplesKt.to(construction.getJson(), construction);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER consumer = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER.INSTANCE;
            kotlin.Pair pair6 = kotlin.TuplesKt.to(consumer.getJson(), consumer);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY home_equity = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY.INSTANCE;
            kotlin.Pair pair7 = kotlin.TuplesKt.to(home_equity.getJson(), home_equity);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT line_of_credit = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT.INSTANCE;
            kotlin.Pair pair8 = kotlin.TuplesKt.to(line_of_credit.getJson(), line_of_credit);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN loan = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN.INSTANCE;
            kotlin.Pair pair9 = kotlin.TuplesKt.to(loan.getJson(), loan);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE mortgage = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE.INSTANCE;
            kotlin.Pair pair10 = kotlin.TuplesKt.to(mortgage.getJson(), mortgage);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER other = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER.INSTANCE;
            kotlin.Pair pair11 = kotlin.TuplesKt.to(other.getJson(), other);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT overdraft = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT.INSTANCE;
            kotlin.Pair pair12 = kotlin.TuplesKt.to(overdraft.getJson(), overdraft);
            com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT student = com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT.INSTANCE;
            return kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, kotlin.TuplesKt.to(student.getJson(), student));
        }
    });
    private final com.plaid.link.result.LinkAccountType accountType;
    private final java.lang.String json;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype;", "", "json", "<init>", "(Ljava/lang/String;)V", "ALL", "CREDIT_CARD", "PAYPAL_CREDIT", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$CREDIT_CARD;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$PAYPAL_CREDIT;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CREDIT extends com.plaid.link.result.LinkAccountSubtype {
        public /* synthetic */ CREDIT(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private CREDIT(java.lang.String str) {
            super(str, com.plaid.link.result.LinkAccountType.CREDIT.INSTANCE, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends com.plaid.link.result.LinkAccountSubtype.CREDIT {
            public static final com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL INSTANCE = new com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL> CREATOR = new com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.CREDIT.ALL[i];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$CREDIT_CARD;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CREDIT_CARD extends com.plaid.link.result.LinkAccountSubtype.CREDIT {
            public static final com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD INSTANCE = new com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD> CREATOR = new com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.CREDIT.CREDIT_CARD[i];
                }
            }

            private CREDIT_CARD() {
                super("credit card", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$CREDIT$PAYPAL_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYPAL_CREDIT extends com.plaid.link.result.LinkAccountSubtype.CREDIT {
            public static final com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.CREDIT.PAYPAL_CREDIT[i];
                }
            }

            private PAYPAL_CREDIT() {
                super("paypal", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR3\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\n0\n8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\n8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR'\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\n8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR'\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\n8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR'\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\n8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$Companion;", "", "<init>", "()V", "", "subtypeJson", "accountTypeJson", "Lcom/plaid/link/result/LinkAccountSubtype;", "convert", "(Ljava/lang/String;Ljava/lang/String;)Lcom/plaid/link/result/LinkAccountSubtype;", "", "Lcom/plaid/link/result/LinkAccountType;", "accountTypeToMap$delegate", "Lkotlin/Lazy;", "getAccountTypeToMap", "()Ljava/util/Map;", "accountTypeToMap", "creditMap$delegate", "getCreditMap", "creditMap", "depositoryMap$delegate", "getDepositoryMap", "depositoryMap", "investmentMap$delegate", "getInvestmentMap", "investmentMap", "loanMap$delegate", "getLoanMap", "loanMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final java.util.Map<com.plaid.link.result.LinkAccountType, java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype>> getAccountTypeToMap() {
            return (java.util.Map) com.plaid.link.result.LinkAccountSubtype.accountTypeToMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype> getCreditMap() {
            return (java.util.Map) com.plaid.link.result.LinkAccountSubtype.creditMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype> getDepositoryMap() {
            return (java.util.Map) com.plaid.link.result.LinkAccountSubtype.depositoryMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype> getInvestmentMap() {
            return (java.util.Map) com.plaid.link.result.LinkAccountSubtype.investmentMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype> getLoanMap() {
            return (java.util.Map) com.plaid.link.result.LinkAccountSubtype.loanMap$delegate.getValue();
        }

        public final com.plaid.link.result.LinkAccountSubtype convert(java.lang.String subtypeJson, java.lang.String accountTypeJson) {
            com.plaid.link.result.LinkAccountSubtype linkAccountSubtype;
            com.plaid.link.result.LinkAccountType.Companion companion = com.plaid.link.result.LinkAccountType.INSTANCE;
            if (accountTypeJson == null) {
                accountTypeJson = "";
            }
            com.plaid.link.result.LinkAccountType convert = companion.convert(accountTypeJson);
            if (kotlin.jvm.internal.Intrinsics.areEqual(convert, com.plaid.link.result.LinkAccountType.OTHER.INSTANCE)) {
                return com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER.INSTANCE;
            }
            java.util.Map<java.lang.String, com.plaid.link.result.LinkAccountSubtype> map = getAccountTypeToMap().get(convert);
            if (map != null && (linkAccountSubtype = map.get(subtypeJson)) != null) {
                return linkAccountSubtype;
            }
            if (subtypeJson == null) {
                subtypeJson = "";
            }
            return new com.plaid.link.result.LinkAccountSubtype.UNKNOWN(subtypeJson, convert);
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "Lcom/plaid/link/result/LinkAccountSubtype;", "", "json", "<init>", "(Ljava/lang/String;)V", "ALL", "CASH_MANAGEMENT", "CD", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "EBT", "HSA", "MONEY_MARKET", "PAYPAL", "PREPAID", "SAVINGS", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CASH_MANAGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CD;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CHECKING;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$EBT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$MONEY_MARKET;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PAYPAL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PREPAID;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$SAVINGS;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class DEPOSITORY extends com.plaid.link.result.LinkAccountSubtype {
        public /* synthetic */ DEPOSITORY(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private DEPOSITORY(java.lang.String str) {
            super(str, com.plaid.link.result.LinkAccountType.DEPOSITORY.INSTANCE, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.ALL[i];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CASH_MANAGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CASH_MANAGEMENT extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT[i];
                }
            }

            private CASH_MANAGEMENT() {
                super("cash management", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CD;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CD extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CD[i];
                }
            }

            private CD() {
                super("cd", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$CHECKING;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CHECKING extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.CHECKING[i];
                }
            }

            private CHECKING() {
                super("checking", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$EBT;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EBT extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.EBT[i];
                }
            }

            private EBT() {
                super("ebt", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HSA extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.HSA[i];
                }
            }

            private HSA() {
                super("hsa", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$MONEY_MARKET;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MONEY_MARKET extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.MONEY_MARKET[i];
                }
            }

            private MONEY_MARKET() {
                super("money market", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PAYPAL;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PAYPAL extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PAYPAL[i];
                }
            }

            private PAYPAL() {
                super("paypal", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$PREPAID;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PREPAID extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.PREPAID[i];
                }
            }

            private PREPAID() {
                super("prepaid", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY$SAVINGS;", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SAVINGS extends com.plaid.link.result.LinkAccountSubtype.DEPOSITORY {
            public static final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS INSTANCE = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS> CREATOR = new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.DEPOSITORY.SAVINGS[i];
                }
            }

            private SAVINGS() {
                super("savings", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:.\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001.456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`a"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "Lcom/plaid/link/result/LinkAccountSubtype;", "", "json", "<init>", "(Ljava/lang/String;)V", "ALL", "BROKERAGE", "CASH_ISA", "EDUCATION_SAVINGS_ACCOUNT", "FIXED_ANNUITY", "GIC", "HEALTH_REIMBURSEMENT_ARRANGEMENT", "HSA", "INVESTMENT_401A", "INVESTMENT_401K", "INVESTMENT_403B", "INVESTMENT_457B", "INVESTMENT_529", "IRA", "ISA", "KEOGH", "LIF", "LIRA", "LRIF", "LRSP", "MUTUAL_FUND", "NON_TAXABLE_BROKERAGE_ACCOUNTT", "OTHER", "PENSION", "PRIF", "PROFIT_SHARING_PLAN", "QSHR", "RDSP", "RESP", "RETIREMENT", "RLIF", "ROTH", "ROTH_401K", "RRIF", "RRSP", "SARSEP", "SEP_IRA", "SIMPLE_IRA", "SIPP", "STOCK_PLAN", "TFSA", "THRIFT_SAVINGS_PLAN", "TRUST", "UGMA", "UTMA", "VARIABLE_ANNUITY", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$BROKERAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$CASH_ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$EDUCATION_SAVINGS_ACCOUNT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$FIXED_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$GIC;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HEALTH_REIMBURSEMENT_ARRANGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401A;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_403B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_457B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_529;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$KEOGH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$MUTUAL_FUND;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$NON_TAXABLE_BROKERAGE_ACCOUNTT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PENSION;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PROFIT_SHARING_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$QSHR;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RDSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RESP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RETIREMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RLIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SARSEP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SEP_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIMPLE_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIPP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$STOCK_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TFSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$THRIFT_SAVINGS_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TRUST;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UGMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UTMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$VARIABLE_ANNUITY;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class INVESTMENT extends com.plaid.link.result.LinkAccountSubtype {
        public /* synthetic */ INVESTMENT(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private INVESTMENT(java.lang.String str) {
            super(str, com.plaid.link.result.LinkAccountType.INVESTMENT.INSTANCE, null);
        }

        public /* synthetic */ INVESTMENT(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ALL[i];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$BROKERAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BROKERAGE extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.BROKERAGE[i];
                }
            }

            private BROKERAGE() {
                super("brokerage", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$CASH_ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CASH_ISA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.CASH_ISA[i];
                }
            }

            private CASH_ISA() {
                super("cash isa", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$EDUCATION_SAVINGS_ACCOUNT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EDUCATION_SAVINGS_ACCOUNT extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT[i];
                }
            }

            private EDUCATION_SAVINGS_ACCOUNT() {
                super("education savings account", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$FIXED_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FIXED_ANNUITY extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY[i];
                }
            }

            private FIXED_ANNUITY() {
                super("fixed annuity", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$GIC;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class GIC extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.GIC[i];
                }
            }

            private GIC() {
                super("gic", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HEALTH_REIMBURSEMENT_ARRANGEMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HEALTH_REIMBURSEMENT_ARRANGEMENT extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT[i];
                }
            }

            private HEALTH_REIMBURSEMENT_ARRANGEMENT() {
                super("health reimbursement arrangement", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$HSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HSA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.HSA[i];
                }
            }

            private HSA() {
                super("hsa", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401A;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_401A extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401A[i];
                }
            }

            private INVESTMENT_401A() {
                super("401a", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_401K extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_401K[i];
                }
            }

            private INVESTMENT_401K() {
                super("401k", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_403B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_403B extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_403B[i];
                }
            }

            private INVESTMENT_403B() {
                super("403B", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_457B;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_457B extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_457B[i];
                }
            }

            private INVESTMENT_457B() {
                super("457b", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$INVESTMENT_529;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class INVESTMENT_529 extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529 INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529 createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.INVESTMENT_529[i];
                }
            }

            private INVESTMENT_529() {
                super("529", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class IRA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.IRA[i];
                }
            }

            private IRA() {
                super("ira", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ISA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ISA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ISA[i];
                }
            }

            private ISA() {
                super("isa", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$KEOGH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class KEOGH extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.KEOGH[i];
                }
            }

            private KEOGH() {
                super("keogh", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LIF extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIF[i];
                }
            }

            private LIF() {
                super("lif", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LIRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LIRA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LIRA[i];
                }
            }

            private LIRA() {
                super("lira", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LRIF extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRIF[i];
                }
            }

            private LRIF() {
                super("lrif", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$LRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LRSP extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.LRSP[i];
                }
            }

            private LRSP() {
                super("lrsp", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$MUTUAL_FUND;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MUTUAL_FUND extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.MUTUAL_FUND[i];
                }
            }

            private MUTUAL_FUND() {
                super("mutual fund", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$NON_TAXABLE_BROKERAGE_ACCOUNTT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NON_TAXABLE_BROKERAGE_ACCOUNTT extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT[i];
                }
            }

            private NON_TAXABLE_BROKERAGE_ACCOUNTT() {
                super("non-taxable brokerage account", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OTHER extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.OTHER[i];
                }
            }

            private OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PENSION;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PENSION extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PENSION[i];
                }
            }

            private PENSION() {
                super("pension", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PRIF extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PRIF[i];
                }
            }

            private PRIF() {
                super("prif", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$PROFIT_SHARING_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PROFIT_SHARING_PLAN extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN[i];
                }
            }

            private PROFIT_SHARING_PLAN() {
                super("profit sharing plan", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$QSHR;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class QSHR extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.QSHR[i];
                }
            }

            private QSHR() {
                super("qshr", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RDSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RDSP extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RDSP[i];
                }
            }

            private RDSP() {
                super("rdsp", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RESP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RESP extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RESP[i];
                }
            }

            private RESP() {
                super("resp", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RETIREMENT;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RETIREMENT extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RETIREMENT[i];
                }
            }

            private RETIREMENT() {
                super("retirement", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RLIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RLIF extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RLIF[i];
                }
            }

            private RLIF() {
                super("rlif", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ROTH extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH[i];
                }
            }

            private ROTH() {
                super("roth", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$ROTH_401K;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ROTH_401K extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.ROTH_401K[i];
                }
            }

            private ROTH_401K() {
                super("roth 401k", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRIF;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RRIF extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRIF[i];
                }
            }

            private RRIF() {
                super("rrif", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$RRSP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RRSP extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.RRSP[i];
                }
            }

            private RRSP() {
                super("rrsp", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SARSEP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SARSEP extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SARSEP[i];
                }
            }

            private SARSEP() {
                super("sarsep", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SEP_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SEP_IRA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SEP_IRA[i];
                }
            }

            private SEP_IRA() {
                super("sep ira", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIMPLE_IRA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SIMPLE_IRA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIMPLE_IRA[i];
                }
            }

            private SIMPLE_IRA() {
                super("simple ira", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$SIPP;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SIPP extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.SIPP[i];
                }
            }

            private SIPP() {
                super("sipp", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$STOCK_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class STOCK_PLAN extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.STOCK_PLAN[i];
                }
            }

            private STOCK_PLAN() {
                super("stock plan", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TFSA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TFSA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TFSA[i];
                }
            }

            private TFSA() {
                super("tfsa", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$THRIFT_SAVINGS_PLAN;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class THRIFT_SAVINGS_PLAN extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN[i];
                }
            }

            private THRIFT_SAVINGS_PLAN() {
                super("thrift savings plan", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$TRUST;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TRUST extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.TRUST[i];
                }
            }

            private TRUST() {
                super("trust", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UGMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UGMA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UGMA[i];
                }
            }

            private UGMA() {
                super("ugma", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$UTMA;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UTMA extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.UTMA[i];
                }
            }

            private UTMA() {
                super("utma", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT$VARIABLE_ANNUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class VARIABLE_ANNUITY extends com.plaid.link.result.LinkAccountSubtype.INVESTMENT {
            public static final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY INSTANCE = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY> CREATOR = new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY[i];
                }
            }

            private VARIABLE_ANNUITY() {
                super("variable annuity", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\r\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\r\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "Lcom/plaid/link/result/LinkAccountSubtype;", "", "json", "<init>", "(Ljava/lang/String;)V", "ALL", "AUTO", "BUSINESS", "COMMERCIAL", "CONSTRUCTION", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, "HOME_EQUITY", "LINE_OF_CREDIT", "LOAN", "MORTGAGE", "OTHER", "OVERDRAFT", "STUDENT", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$AUTO;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$BUSINESS;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$COMMERCIAL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSTRUCTION;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSUMER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$HOME_EQUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LINE_OF_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LOAN;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$MORTGAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OVERDRAFT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$STUDENT;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class LOAN_SUBTYPE extends com.plaid.link.result.LinkAccountSubtype {
        public /* synthetic */ LOAN_SUBTYPE(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private LOAN_SUBTYPE(java.lang.String str) {
            super(str, com.plaid.link.result.LinkAccountType.LOAN.INSTANCE, null);
        }

        public /* synthetic */ LOAN_SUBTYPE(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$ALL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ALL extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.ALL[i];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$AUTO;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AUTO extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.AUTO[i];
                }
            }

            private AUTO() {
                super(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$BUSINESS;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BUSINESS extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS[i];
                }
            }

            private BUSINESS() {
                super(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UserProfileConstants.KEY_ACCOUNT_TYPE_BUSINESS, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$COMMERCIAL;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class COMMERCIAL extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL[i];
                }
            }

            private COMMERCIAL() {
                super("commercial", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSTRUCTION;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CONSTRUCTION extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION[i];
                }
            }

            private CONSTRUCTION() {
                super("construction", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$CONSUMER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CONSUMER extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER[i];
                }
            }

            private CONSUMER() {
                super("consumer", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$HOME_EQUITY;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HOME_EQUITY extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY[i];
                }
            }

            private HOME_EQUITY() {
                super("home equity", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LINE_OF_CREDIT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LINE_OF_CREDIT extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT[i];
                }
            }

            private LINE_OF_CREDIT() {
                super("line of credit", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$LOAN;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LOAN extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.LOAN[i];
                }
            }

            private LOAN() {
                super("loan", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$MORTGAGE;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MORTGAGE extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE[i];
                }
            }

            private MORTGAGE() {
                super("mortgage", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OTHER extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OTHER[i];
                }
            }

            private OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$OVERDRAFT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OVERDRAFT extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT[i];
                }
            }

            private OVERDRAFT() {
                super("overdraft", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE$STUDENT;", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class STUDENT extends com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE {
            public static final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT INSTANCE = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT> CREATOR = new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.LOAN_SUBTYPE.STUDENT[i];
                }
            }

            private STUDENT() {
                super("student", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype;", "", "json", "<init>", "(Ljava/lang/String;)V", "OTHER", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER$OTHER;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class OTHER extends com.plaid.link.result.LinkAccountSubtype {
        public /* synthetic */ OTHER(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private OTHER(java.lang.String str) {
            super(str, com.plaid.link.result.LinkAccountType.OTHER.INSTANCE, null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$OTHER$OTHER;", "Lcom/plaid/link/result/LinkAccountSubtype$OTHER;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.plaid.link.result.LinkAccountSubtype$OTHER$OTHER, reason: collision with other inner class name */
        public static final class C0199OTHER extends com.plaid.link.result.LinkAccountSubtype.OTHER {
            public static final com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER INSTANCE = new com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER();
            public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER> CREATOR = new com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER.Creator();

            @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.plaid.link.result.LinkAccountSubtype$OTHER$OTHER$Creator */
            public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER[] newArray(int i) {
                    return new com.plaid.link.result.LinkAccountSubtype.OTHER.C0199OTHER[i];
                }
            }

            private C0199OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }

    public /* synthetic */ LinkAccountSubtype(java.lang.String str, com.plaid.link.result.LinkAccountType linkAccountType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkAccountType);
    }

    public final com.plaid.link.result.LinkAccountType getAccountType() {
        return this.accountType;
    }

    public final java.lang.String getJson() {
        return this.json;
    }

    private LinkAccountSubtype(java.lang.String str, com.plaid.link.result.LinkAccountType linkAccountType) {
        this.json = str;
        this.accountType = linkAccountType;
    }

    public /* synthetic */ LinkAccountSubtype(java.lang.String str, com.plaid.link.result.LinkAccountType linkAccountType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new com.plaid.link.result.LinkAccountType.UNKNOWN("") : linkAccountType, null);
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/plaid/link/result/LinkAccountSubtype$UNKNOWN;", "Lcom/plaid/link/result/LinkAccountSubtype;", "", "name", "Lcom/plaid/link/result/LinkAccountType;", "type", "<init>", "(Ljava/lang/String;Lcom/plaid/link/result/LinkAccountType;)V", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/plaid/link/result/LinkAccountType;", "getType", "()Lcom/plaid/link/result/LinkAccountType;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UNKNOWN extends com.plaid.link.result.LinkAccountSubtype {
        public static final android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.UNKNOWN> CREATOR = new com.plaid.link.result.LinkAccountSubtype.UNKNOWN.Creator();
        private final java.lang.String name;
        private final com.plaid.link.result.LinkAccountType type;

        @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.plaid.link.result.LinkAccountSubtype.UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountSubtype.UNKNOWN createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.plaid.link.result.LinkAccountSubtype.UNKNOWN(parcel.readString(), (com.plaid.link.result.LinkAccountType) parcel.readParcelable(com.plaid.link.result.LinkAccountSubtype.UNKNOWN.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.plaid.link.result.LinkAccountSubtype.UNKNOWN[] newArray(int i) {
                return new com.plaid.link.result.LinkAccountSubtype.UNKNOWN[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(java.lang.String str, com.plaid.link.result.LinkAccountType linkAccountType) {
            super(str, linkAccountType, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAccountType, "");
            this.name = str;
            this.type = linkAccountType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.link.result.LinkAccountSubtype.UNKNOWN.class, other != null ? other.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
            com.plaid.link.result.LinkAccountSubtype.UNKNOWN unknown = (com.plaid.link.result.LinkAccountSubtype.UNKNOWN) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, unknown.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, unknown.type);
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final com.plaid.link.result.LinkAccountType getType() {
            return this.type;
        }

        public final int hashCode() {
            return this.type.hashCode() + (this.name.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.name);
            parcel.writeParcelable(this.type, flags);
        }
    }
}
