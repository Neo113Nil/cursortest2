package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/window/embedding/RuleController;", "", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingBackend", "<init>", "(Landroidx/window/embedding/EmbeddingBackend;)V", "", "Landroidx/window/embedding/EmbeddingRule;", "getRules", "()Ljava/util/Set;", "rule", "", "addRule", "(Landroidx/window/embedding/EmbeddingRule;)V", "removeRule", "rules", "setRules", "(Ljava/util/Set;)V", "clearRules", "()V", "getHighSpeedVideoFpsRangesFor", "Landroidx/window/embedding/EmbeddingBackend;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RuleController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.RuleController.Companion INSTANCE = new androidx.window.embedding.RuleController.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.window.embedding.EmbeddingBackend getHighSpeedVideoSizes;

    public RuleController(androidx.window.embedding.EmbeddingBackend embeddingBackend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBackend, "");
        this.getHighSpeedVideoSizes = embeddingBackend;
    }

    public final java.util.Set<androidx.window.embedding.EmbeddingRule> getRules() {
        return this.getHighSpeedVideoSizes.getRules();
    }

    public final void addRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rule, "");
        this.getHighSpeedVideoSizes.addRule(rule);
    }

    public final void removeRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rule, "");
        this.getHighSpeedVideoSizes.removeRule(rule);
    }

    public final void setRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> rules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "");
        this.getHighSpeedVideoSizes.setRules(rules);
    }

    public final void clearRules() {
        this.getHighSpeedVideoSizes.setRules(kotlin.collections.SetsKt.emptySet());
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/window/embedding/RuleController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/embedding/RuleController;", "getInstance", "(Landroid/content/Context;)Landroidx/window/embedding/RuleController;", "", "staticRuleResourceId", "", "Landroidx/window/embedding/EmbeddingRule;", "parseRules", "(Landroid/content/Context;I)Ljava/util/Set;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.embedding.RuleController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            android.content.Context applicationContext = context.getApplicationContext();
            androidx.window.embedding.EmbeddingBackend.Companion companion = androidx.window.embedding.EmbeddingBackend.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext);
            return new androidx.window.embedding.RuleController(companion.getInstance(applicationContext));
        }

        @kotlin.jvm.JvmStatic
        public final java.util.Set<androidx.window.embedding.EmbeddingRule> parseRules(android.content.Context context, int staticRuleResourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            androidx.window.embedding.RuleParser ruleParser = androidx.window.embedding.RuleParser.INSTANCE;
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            java.util.Set<androidx.window.embedding.EmbeddingRule> parseRules$window_release = ruleParser.parseRules$window_release(applicationContext, staticRuleResourceId);
            return parseRules$window_release == null ? kotlin.collections.SetsKt.emptySet() : parseRules$window_release;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<androidx.window.embedding.EmbeddingRule> parseRules(android.content.Context context, int i) {
        return INSTANCE.parseRules(context, i);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.embedding.RuleController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
