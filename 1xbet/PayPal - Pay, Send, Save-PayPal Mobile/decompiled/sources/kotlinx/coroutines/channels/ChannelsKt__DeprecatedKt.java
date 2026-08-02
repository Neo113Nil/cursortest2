package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0003H\u0087H¢\u0006\u0004\b\n\u0010\u000b\u001aL\u0010\u0012\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\u00112\u001a\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\f\"\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0014H\u0087@¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0014H\u0087@¢\u0006\u0004\b\u0017\u0010\u0016\u001a \u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b\u001a\u0010\u0019\u001a(\u0010\u001b\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b\u001d\u0010\u0019\u001a(\u0010\u001e\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0087@¢\u0006\u0004\b\u001e\u0010\u001c\u001a\"\u0010\u001f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b\u001f\u0010\u0019\u001a \u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b \u0010\u0019\u001a\"\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b!\u0010\u0019\u001a7\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%\u001aS\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0007¢\u0006\u0004\b*\u0010+\u001aS\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0000¢\u0006\u0004\b,\u0010+\u001ah\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"27\u0010#\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0012\u0004\u0018\u00010)0-H\u0007¢\u0006\u0004\b/\u00100\u001aS\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0007¢\u0006\u0004\b1\u0010+\u001a+\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020)*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0000¢\u0006\u0004\b2\u00103\u001a@\u00106\u001a\u00028\u0001\"\b\b\u0000\u0010\u0000*\u00020)\"\u0010\b\u0001\u00105*\n\u0012\u0006\b\u0000\u0012\u00028\u000004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0087@¢\u0006\u0004\b6\u00107\u001a>\u00106\u001a\u00028\u0001\"\b\b\u0000\u0010\u0000*\u00020)\"\u000e\b\u0001\u00105*\b\u0012\u0004\u0012\u00028\u000008*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0087@¢\u0006\u0004\b6\u00109\u001a7\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b:\u0010%\u001aS\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0007¢\u0006\u0004\b;\u0010+\u001a8\u0010<\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u00105*\b\u0012\u0004\u0012\u00028\u000008*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0080@¢\u0006\u0004\b<\u00109\u001a:\u0010=\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u00105*\n\u0012\u0006\b\u0000\u0012\u00028\u000004*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0080@¢\u0006\u0004\b=\u00107\u001a>\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010?*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@0\u0004H\u0087@¢\u0006\u0004\bB\u0010\u0019\u001aT\u0010B\u001a\u00028\u0002\"\u0004\b\u0000\u0010>\"\u0004\b\u0001\u0010?\"\u0018\b\u0002\u0010D*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010C*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@0\u00042\u0006\u0010\u0006\u001a\u00028\u0002H\u0080@¢\u0006\u0004\bB\u0010E\u001a&\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000F\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\bG\u0010\u0019\u001a&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\bI\u0010\u0019\u001a_\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"2(\u0010#\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040'\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0007¢\u0006\u0004\bJ\u0010+\u001aY\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010'\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0000¢\u0006\u0004\bK\u0010+\u001an\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"27\u0010#\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010'\u0012\u0006\u0012\u0004\u0018\u00010)0-H\u0000¢\u0006\u0004\bL\u00100\u001at\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00020)*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"29\u0010#\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010'\u0012\u0006\u0012\u0004\u0018\u00010)0-H\u0007¢\u0006\u0004\bM\u00100\u001a_\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00020)*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"2$\u0010#\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010'\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0007¢\u0006\u0004\bN\u0010+\u001a5\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000O0\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"H\u0007¢\u0006\u0004\bP\u0010Q\u001a%\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bR\u00103\u001aY\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010>*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0006\u001a\u00020\"2\"\u0010#\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010'\u0012\u0006\u0012\u0004\u0018\u00010)0&H\u0000¢\u0006\u0004\bS\u0010+\u001a&\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000T\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080@¢\u0006\u0004\bU\u0010\u0019\u001a \u0010V\u001a\u00020(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\bV\u0010\u0019\u001a \u0010W\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\bW\u0010\u0019\u001a>\u0010Z\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Xj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`YH\u0087@¢\u0006\u0004\bZ\u0010[\u001a>\u0010\\\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Xj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`YH\u0087@¢\u0006\u0004\b\\\u0010[\u001a \u0010]\u001a\u00020(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@¢\u0006\u0004\b]\u0010\u0019\u001a+\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020)*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0007¢\u0006\u0004\b^\u00103\u001aF\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@0\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0004¢\u0006\u0004\b_\u0010`\u001a\u0081\u0001\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010?*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\b\u0002\u0010#\u001a\u00020\"26\u0010c\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(a\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(b\u0012\u0004\u0012\u00028\u00020&H\u0000¢\u0006\u0004\b_\u0010d\u001a8\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\u0011*\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\be\u0010f"}, d2 = {"E", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/ExtensionFunctionType;", "p0", "consume", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "consumeEach", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "consumesAll", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", "", "elementAt", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "first", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "indexOf", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "single", "singleOrNull", "Lkotlin/coroutines/CoroutineContext;", "p1", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "dropWhile", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "Lkotlin/Function3;", "index", "filterIndexed", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlinx/coroutines/channels/ReceiveChannel;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "filterNotNullTo", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "take", "takeWhile", "toChannel", "toCollection", "K", "V", "Lkotlin/Pair;", "", "toMap", "", "M", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toMutableList", "", "toSet", "flatMap", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "Lkotlin/collections/IndexedValue;", "withIndex", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/channels/ReceiveChannel;", "distinct", "distinctBy", "", "toMutableSet", "any", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "maxWith", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "zip", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlinx/coroutines/channels/ReceiveChannel;", "a", util.h.xy.cb.b.f1091, "p2", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "consumes", "(Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
final /* synthetic */ class ChannelsKt__DeprecatedKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> function1) {
        kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
        try {
            return function1.invoke(openSubscription);
        } finally {
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) openSubscription, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x0078), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x0078), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:13:0x0039). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 channelsKt__DeprecatedKt$consumeEach$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannel;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannel2;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1) {
            channelsKt__DeprecatedKt$consumeEach$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1) continuation;
            if ((channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
                    try {
                        receiveChannel2 = openSubscription;
                        it = openSubscription.iterator();
                        channelsKt__DeprecatedKt$consumeEach$1.Camera2StreamConfigurationMap = function1;
                        channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoSizes = receiveChannel2;
                        channelsKt__DeprecatedKt$consumeEach$1.getHighResolutionOutputSizeshNQ4ISI = it;
                        channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoFpsRangesFor = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$consumeEach$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel = openSubscription;
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$consumeEach$1.getHighResolutionOutputSizeshNQ4ISI;
                    receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) channelsKt__DeprecatedKt$consumeEach$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 channelsKt__DeprecatedKt$consumeEach$12 = channelsKt__DeprecatedKt$consumeEach$1;
                        kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannel3 = receiveChannel;
                        function1 = function12;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 channelsKt__DeprecatedKt$consumeEach$13 = channelsKt__DeprecatedKt$consumeEach$12;
                        try {
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                function1.invoke((java.lang.Object) it.next());
                                receiveChannel2 = receiveChannel3;
                                channelsKt__DeprecatedKt$consumeEach$1 = channelsKt__DeprecatedKt$consumeEach$13;
                                try {
                                    channelsKt__DeprecatedKt$consumeEach$1.Camera2StreamConfigurationMap = function1;
                                    channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoSizes = receiveChannel2;
                                    channelsKt__DeprecatedKt$consumeEach$1.getHighResolutionOutputSizeshNQ4ISI = it;
                                    channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoFpsRangesFor = 1;
                                    hasNext = it.hasNext(channelsKt__DeprecatedKt$consumeEach$1);
                                    if (hasNext != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    channelsKt__DeprecatedKt$consumeEach$12 = channelsKt__DeprecatedKt$consumeEach$1;
                                    receiveChannel3 = receiveChannel2;
                                    obj = hasNext;
                                    kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1 channelsKt__DeprecatedKt$consumeEach$132 = channelsKt__DeprecatedKt$consumeEach$12;
                                    if (!((java.lang.Boolean) obj).booleanValue()) {
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    receiveChannel = receiveChannel2;
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            receiveChannel = receiveChannel3;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                    }
                }
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                throw th;
            }
        }
        channelsKt__DeprecatedKt$consumeEach$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$consumeEach$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        throw th;
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(final kotlinx.coroutines.channels.ReceiveChannel<?>... receiveChannelArr) {
        return new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.getHighSpeedVideoSizes(receiveChannelArr, (java.lang.Throwable) obj);
                return highSpeedVideoSizes;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlinx.coroutines.channels.ReceiveChannel[] receiveChannelArr, java.lang.Throwable th) {
        java.lang.Throwable th2 = null;
        for (kotlinx.coroutines.channels.ReceiveChannel receiveChannel : receiveChannelArr) {
            try {
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
            } catch (java.lang.Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    kotlin.ExceptionsKt.addSuppressed(th2, th3);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #2 {all -> 0x0099, blocks: (B:15:0x0069, B:17:0x0071, B:27:0x0081, B:28:0x0098), top: B:14:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #2 {all -> 0x0099, blocks: (B:15:0x0069, B:17:0x0071, B:27:0x0081, B:28:0x0098), top: B:14:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0065 -> B:14:0x0069). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 channelsKt__DeprecatedKt$elementAt$1;
        int i2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ChannelIterator it;
        int i3;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1) {
                channelsKt__DeprecatedKt$elementAt$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1) continuation;
                if ((channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$elementAt$1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRanges;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (i < 0) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiveChannel doesn't contain element at index ");
                            sb.append(i);
                            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                            throw new java.lang.IndexOutOfBoundsException(sb.toString());
                        }
                        it = receiveChannel.iterator();
                        i3 = 0;
                        channelsKt__DeprecatedKt$elementAt$1.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                        channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoSizes = it;
                        channelsKt__DeprecatedKt$elementAt$1.Camera2StreamConfigurationMap = i;
                        channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRangesFor = i3;
                        channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRanges = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAt$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRangesFor;
                        i = channelsKt__DeprecatedKt$elementAt$1.Camera2StreamConfigurationMap;
                        kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoSizes;
                        receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$elementAt$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            i3 = i4;
                            receiveChannel = receiveChannel2;
                            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 channelsKt__DeprecatedKt$elementAt$12 = channelsKt__DeprecatedKt$elementAt$1;
                            kotlinx.coroutines.channels.ChannelIterator channelIterator2 = channelIterator;
                            try {
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    java.lang.Object next = channelIterator2.next();
                                    if (i == i3) {
                                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                        return next;
                                    }
                                    i3++;
                                    it = channelIterator2;
                                    channelsKt__DeprecatedKt$elementAt$1 = channelsKt__DeprecatedKt$elementAt$12;
                                    channelsKt__DeprecatedKt$elementAt$1.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                                    channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoSizes = it;
                                    channelsKt__DeprecatedKt$elementAt$1.Camera2StreamConfigurationMap = i;
                                    channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRangesFor = i3;
                                    channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRanges = 1;
                                    hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAt$1);
                                    if (hasNext != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 channelsKt__DeprecatedKt$elementAt$13 = channelsKt__DeprecatedKt$elementAt$1;
                                    channelIterator2 = it;
                                    obj = hasNext;
                                    channelsKt__DeprecatedKt$elementAt$12 = channelsKt__DeprecatedKt$elementAt$13;
                                    if (!((java.lang.Boolean) obj).booleanValue()) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        sb2.append("ReceiveChannel doesn't contain element at index ");
                                        sb2.append(i);
                                        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                                        throw new java.lang.IndexOutOfBoundsException(sb2.toString());
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                receiveChannel2 = receiveChannel;
                                th = th2;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                    throw th3;
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            receiveChannel2 = receiveChannel;
        }
        channelsKt__DeprecatedKt$elementAt$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$elementAt$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = channelsKt__DeprecatedKt$elementAt$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:13:0x0069, B:15:0x0071, B:21:0x0054, B:45:0x004f), top: B:44:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:13:0x0069). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$1;
        int i2;
        kotlinx.coroutines.channels.ChannelIterator it;
        int i3;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1) {
            channelsKt__DeprecatedKt$elementAtOrNull$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRangesFor;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i >= 0) {
                        try {
                            it = receiveChannel.iterator();
                            i3 = 0;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRanges = receiveChannel;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.getHighResolutionOutputSizeshNQ4ISI = it;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoSizes = i;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.Camera2StreamConfigurationMap = i3;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRangesFor = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAtOrNull$1);
                            if (hasNext != coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th2) {
                            kotlinx.coroutines.channels.ReceiveChannel receiveChannel3 = receiveChannel;
                            th = th2;
                            receiveChannel2 = receiveChannel3;
                            throw th;
                        }
                    } else {
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                        return null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = channelsKt__DeprecatedKt$elementAtOrNull$1.Camera2StreamConfigurationMap;
                    i = channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoSizes;
                    kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$elementAtOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i3 = i4;
                        receiveChannel = receiveChannel2;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                        kotlinx.coroutines.channels.ChannelIterator channelIterator2 = channelIterator;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            java.lang.Object next = channelIterator2.next();
                            if (i == i3) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return next;
                            }
                            i3++;
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$elementAtOrNull$1 = channelsKt__DeprecatedKt$elementAtOrNull$12;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRanges = receiveChannel;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.getHighResolutionOutputSizeshNQ4ISI = it;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoSizes = i;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.Camera2StreamConfigurationMap = i3;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRangesFor = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAtOrNull$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$13 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                            channelIterator2 = it;
                            obj = hasNext;
                            channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$13;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return null;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$elementAtOrNull$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = channelsKt__DeprecatedKt$elementAtOrNull$1.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #2 {all -> 0x006d, blocks: (B:13:0x0054, B:15:0x005c, B:19:0x0065, B:20:0x006c, B:33:0x0043), top: B:32:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #2 {all -> 0x006d, blocks: (B:13:0x0054, B:15:0x005c, B:19:0x0065, B:20:0x006c, B:33:0x0043), top: B:32:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 channelsKt__DeprecatedKt$first$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1) {
            channelsKt__DeprecatedKt$first$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1) continuation;
            if ((channelsKt__DeprecatedKt$first$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$first$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = channelsKt__DeprecatedKt$first$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$first$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$first$1.getHighSpeedVideoSizes = receiveChannel;
                        channelsKt__DeprecatedKt$first$1.getHighResolutionOutputSizeshNQ4ISI = it;
                        channelsKt__DeprecatedKt$first$1.getHighSpeedVideoFpsRangesFor = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$first$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$first$1.getHighResolutionOutputSizeshNQ4ISI;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$first$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = channelIterator;
                        receiveChannel = receiveChannel2;
                        hasNext = obj;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (((java.lang.Boolean) hasNext).booleanValue()) {
                    throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                }
                java.lang.Object next = it.next();
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                return next;
            }
        }
        channelsKt__DeprecatedKt$first$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$first$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$first$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (((java.lang.Boolean) hasNext).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: all -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:13:0x0054, B:19:0x0061, B:37:0x0043), top: B:36:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 channelsKt__DeprecatedKt$firstOrNull$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1) {
            channelsKt__DeprecatedKt$firstOrNull$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = channelsKt__DeprecatedKt$firstOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                        channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoSizes = it;
                        channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoFpsRanges = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$firstOrNull$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoSizes;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = channelIterator;
                        receiveChannel = receiveChannel2;
                        hasNext = obj;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (!((java.lang.Boolean) hasNext).booleanValue()) {
                    java.lang.Object next = it.next();
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                    return next;
                }
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                return null;
            }
        }
        channelsKt__DeprecatedKt$firstOrNull$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$firstOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$firstOrNull$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) hasNext).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x0067, B:15:0x0070, B:17:0x007a, B:21:0x0084, B:22:0x0052, B:26:0x008c, B:41:0x004e), top: B:40:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x0067, B:15:0x0070, B:17:0x007a, B:21:0x0084, B:22:0x0052, B:26:0x008c, B:41:0x004e), top: B:40:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0063 -> B:13:0x0067). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 channelsKt__DeprecatedKt$indexOf$1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1) {
                channelsKt__DeprecatedKt$indexOf$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1) continuation;
                if ((channelsKt__DeprecatedKt$indexOf$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$indexOf$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj2 = channelsKt__DeprecatedKt$indexOf$1.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$indexOf$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        intRef = new kotlin.jvm.internal.Ref.IntRef();
                        try {
                            it = receiveChannel.iterator();
                            channelsKt__DeprecatedKt$indexOf$1.getHighResolutionOutputSizeshNQ4ISI = obj;
                            channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoSizes = intRef;
                            channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                            channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoFpsRanges = it;
                            channelsKt__DeprecatedKt$indexOf$1.Camera2StreamConfigurationMap = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$indexOf$1);
                            if (hasNext != coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th2) {
                            receiveChannel2 = receiveChannel;
                            th = th2;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoFpsRanges;
                        receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.internal.Ref.IntRef intRef2 = (kotlin.jvm.internal.Ref.IntRef) channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoSizes;
                        java.lang.Object obj3 = channelsKt__DeprecatedKt$indexOf$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            kotlinx.coroutines.channels.ChannelIterator channelIterator2 = channelIterator;
                            receiveChannel = receiveChannel2;
                            obj = obj3;
                            if (((java.lang.Boolean) obj2).booleanValue()) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, channelIterator2.next())) {
                                    java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef2.element);
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                    return boxInt;
                                }
                                intRef2.element++;
                                intRef = intRef2;
                                it = channelIterator2;
                                channelsKt__DeprecatedKt$indexOf$1.getHighResolutionOutputSizeshNQ4ISI = obj;
                                channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoSizes = intRef;
                                channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                                channelsKt__DeprecatedKt$indexOf$1.getHighSpeedVideoFpsRanges = it;
                                channelsKt__DeprecatedKt$indexOf$1.Camera2StreamConfigurationMap = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$indexOf$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                kotlinx.coroutines.channels.ChannelIterator channelIterator3 = it;
                                intRef2 = intRef;
                                obj2 = hasNext;
                                channelIterator2 = channelIterator3;
                                if (((java.lang.Boolean) obj2).booleanValue()) {
                                }
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return kotlin.coroutines.jvm.internal.Boxing.boxInt(-1);
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                        }
                    }
                    throw th;
                }
            }
            throw th;
        } catch (java.lang.Throwable th4) {
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
            throw th4;
        }
        channelsKt__DeprecatedKt$indexOf$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1(continuation);
        java.lang.Object obj22 = channelsKt__DeprecatedKt$indexOf$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$indexOf$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x006a, code lost:
    
        if (r2 != r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #5 {all -> 0x009f, blocks: (B:15:0x008b, B:17:0x0093), top: B:14:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0074 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #3 {all -> 0x00ab, blocks: (B:47:0x006c, B:49:0x0074, B:50:0x00a3, B:51:0x00aa), top: B:46:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3 A[Catch: all -> 0x00ab, TRY_ENTER, TryCatch #3 {all -> 0x00ab, blocks: (B:47:0x006c, B:49:0x0074, B:50:0x00a3, B:51:0x00aa), top: B:46:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0087 -> B:14:0x008b). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 channelsKt__DeprecatedKt$last$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object next;
        java.lang.Object hasNext2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 channelsKt__DeprecatedKt$last$12;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1) {
                channelsKt__DeprecatedKt$last$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1) continuation;
                if ((channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$last$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            channelsKt__DeprecatedKt$last$1.Camera2StreamConfigurationMap = receiveChannel;
                            channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRanges = it;
                            channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRangesFor = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$last$1);
                        } catch (java.lang.Throwable th2) {
                            kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = receiveChannel;
                            th = th2;
                            receiveChannel3 = receiveChannel4;
                            throw th;
                        }
                    } else if (i == 1) {
                        kotlinx.coroutines.channels.ChannelIterator channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRanges;
                        receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$last$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            it = channelIterator2;
                            receiveChannel = receiveChannel2;
                            hasNext = obj;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            receiveChannel3 = receiveChannel2;
                            throw th;
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj2 = channelsKt__DeprecatedKt$last$1.getHighSpeedVideoSizes;
                        kotlinx.coroutines.channels.ChannelIterator channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRanges;
                        receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$last$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            next = obj2;
                            receiveChannel = receiveChannel3;
                            channelsKt__DeprecatedKt$last$12 = channelsKt__DeprecatedKt$last$1;
                            channelIterator = channelIterator3;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th5) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, th);
                                throw th5;
                            }
                        }
                        try {
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                next = channelIterator.next();
                                it = channelIterator;
                                channelsKt__DeprecatedKt$last$1 = channelsKt__DeprecatedKt$last$12;
                                channelsKt__DeprecatedKt$last$1.Camera2StreamConfigurationMap = receiveChannel;
                                channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRanges = it;
                                channelsKt__DeprecatedKt$last$1.getHighSpeedVideoSizes = next;
                                channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRangesFor = 2;
                                hasNext2 = it.hasNext(channelsKt__DeprecatedKt$last$1);
                                if (hasNext2 != coroutine_suspended) {
                                    kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 channelsKt__DeprecatedKt$last$13 = channelsKt__DeprecatedKt$last$1;
                                    channelIterator = it;
                                    obj = hasNext2;
                                    channelsKt__DeprecatedKt$last$12 = channelsKt__DeprecatedKt$last$13;
                                    if (!((java.lang.Boolean) obj).booleanValue()) {
                                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                        return next;
                                    }
                                }
                                return coroutine_suspended;
                            }
                        } catch (java.lang.Throwable th6) {
                            receiveChannel3 = receiveChannel;
                            th = th6;
                            throw th;
                        }
                    }
                    if (((java.lang.Boolean) hasNext).booleanValue()) {
                        throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                    }
                    next = it.next();
                    channelsKt__DeprecatedKt$last$1.Camera2StreamConfigurationMap = receiveChannel;
                    channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRanges = it;
                    channelsKt__DeprecatedKt$last$1.getHighSpeedVideoSizes = next;
                    channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRangesFor = 2;
                    hasNext2 = it.hasNext(channelsKt__DeprecatedKt$last$1);
                    if (hasNext2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
            if (((java.lang.Boolean) hasNext).booleanValue()) {
            }
        } catch (java.lang.Throwable th7) {
            receiveChannel2 = receiveChannel;
            th = th7;
            receiveChannel3 = receiveChannel2;
            throw th;
        }
        channelsKt__DeprecatedKt$last$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1(continuation);
        java.lang.Object obj3 = channelsKt__DeprecatedKt$last$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$last$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:13:0x0075, B:15:0x007d, B:17:0x0087, B:18:0x008b, B:19:0x005e, B:24:0x0093, B:42:0x005a), top: B:41:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:13:0x0075, B:15:0x007d, B:17:0x0087, B:18:0x008b, B:19:0x005e, B:24:0x0093, B:42:0x005a), top: B:41:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:13:0x0075). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 channelsKt__DeprecatedKt$lastIndexOf$1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1) {
            channelsKt__DeprecatedKt$lastIndexOf$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1) continuation;
            if ((channelsKt__DeprecatedKt$lastIndexOf$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastIndexOf$1.getInputFormats -= 2147483648;
                java.lang.Object obj2 = channelsKt__DeprecatedKt$lastIndexOf$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$lastIndexOf$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    intRef = new kotlin.jvm.internal.Ref.IntRef();
                    intRef.element = -1;
                    intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                    try {
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$lastIndexOf$1.Camera2StreamConfigurationMap = obj;
                        channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoFpsRangesFor = intRef;
                        channelsKt__DeprecatedKt$lastIndexOf$1.getHighResolutionOutputSizeshNQ4ISI = intRef2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoFpsRanges = receiveChannel;
                        channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoSizes = it;
                        channelsKt__DeprecatedKt$lastIndexOf$1.getInputFormats = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$lastIndexOf$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoSizes;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoFpsRanges;
                    intRef2 = (kotlin.jvm.internal.Ref.IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Ref.IntRef intRef3 = (kotlin.jvm.internal.Ref.IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object obj3 = channelsKt__DeprecatedKt$lastIndexOf$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.channels.ChannelIterator channelIterator2 = channelIterator;
                        receiveChannel = receiveChannel2;
                        obj = obj3;
                        if (((java.lang.Boolean) obj2).booleanValue()) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, channelIterator2.next())) {
                                intRef3.element = intRef2.element;
                            }
                            intRef2.element++;
                            intRef = intRef3;
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$lastIndexOf$1.Camera2StreamConfigurationMap = obj;
                            channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoFpsRangesFor = intRef;
                            channelsKt__DeprecatedKt$lastIndexOf$1.getHighResolutionOutputSizeshNQ4ISI = intRef2;
                            channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoFpsRanges = receiveChannel;
                            channelsKt__DeprecatedKt$lastIndexOf$1.getHighSpeedVideoSizes = it;
                            channelsKt__DeprecatedKt$lastIndexOf$1.getInputFormats = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$lastIndexOf$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            kotlinx.coroutines.channels.ChannelIterator channelIterator3 = it;
                            intRef3 = intRef;
                            obj2 = hasNext;
                            channelIterator2 = channelIterator3;
                            if (((java.lang.Boolean) obj2).booleanValue()) {
                            }
                        } else {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                            return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef3.element);
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$lastIndexOf$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1(continuation);
        java.lang.Object obj22 = channelsKt__DeprecatedKt$lastIndexOf$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$lastIndexOf$1.getInputFormats;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x006b, code lost:
    
        if (r2 != r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:15:0x0090, B:17:0x0098), top: B:14:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079 A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a7, blocks: (B:47:0x006d, B:51:0x0079), top: B:46:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008c -> B:14:0x0090). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 channelsKt__DeprecatedKt$lastOrNull$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object next;
        java.lang.Object hasNext2;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1) {
                channelsKt__DeprecatedKt$lastOrNull$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1) continuation;
                if ((channelsKt__DeprecatedKt$lastOrNull$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$lastOrNull$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$lastOrNull$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoSizes = receiveChannel;
                            channelsKt__DeprecatedKt$lastOrNull$1.getHighResolutionOutputSizeshNQ4ISI = it;
                            channelsKt__DeprecatedKt$lastOrNull$1.Camera2StreamConfigurationMap = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                        } catch (java.lang.Throwable th2) {
                            kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = receiveChannel;
                            th = th2;
                            receiveChannel3 = receiveChannel4;
                            throw th;
                        }
                    } else if (i == 1) {
                        kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
                        receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            it = channelIterator;
                            receiveChannel = receiveChannel2;
                            hasNext = obj;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            receiveChannel3 = receiveChannel2;
                            throw th;
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj2 = channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoFpsRangesFor;
                        kotlinx.coroutines.channels.ChannelIterator channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
                        receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            next = obj2;
                            receiveChannel = receiveChannel3;
                            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 channelsKt__DeprecatedKt$lastOrNull$12 = channelsKt__DeprecatedKt$lastOrNull$1;
                            kotlinx.coroutines.channels.ChannelIterator channelIterator3 = channelIterator2;
                            try {
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    next = channelIterator3.next();
                                    it = channelIterator3;
                                    channelsKt__DeprecatedKt$lastOrNull$1 = channelsKt__DeprecatedKt$lastOrNull$12;
                                    channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoSizes = receiveChannel;
                                    channelsKt__DeprecatedKt$lastOrNull$1.getHighResolutionOutputSizeshNQ4ISI = it;
                                    channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoFpsRangesFor = next;
                                    channelsKt__DeprecatedKt$lastOrNull$1.Camera2StreamConfigurationMap = 2;
                                    hasNext2 = it.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                                    if (hasNext2 != coroutine_suspended) {
                                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 channelsKt__DeprecatedKt$lastOrNull$13 = channelsKt__DeprecatedKt$lastOrNull$1;
                                        channelIterator3 = it;
                                        obj = hasNext2;
                                        channelsKt__DeprecatedKt$lastOrNull$12 = channelsKt__DeprecatedKt$lastOrNull$13;
                                        if (!((java.lang.Boolean) obj).booleanValue()) {
                                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                            return next;
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                            } catch (java.lang.Throwable th4) {
                                receiveChannel3 = receiveChannel;
                                th = th4;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th5) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, th);
                                    throw th5;
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            throw th;
                        }
                    }
                    if (!((java.lang.Boolean) hasNext).booleanValue()) {
                        next = it.next();
                        channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoSizes = receiveChannel;
                        channelsKt__DeprecatedKt$lastOrNull$1.getHighResolutionOutputSizeshNQ4ISI = it;
                        channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoFpsRangesFor = next;
                        channelsKt__DeprecatedKt$lastOrNull$1.Camera2StreamConfigurationMap = 2;
                        hasNext2 = it.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                        if (hasNext2 != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                    return null;
                }
            }
            if (!((java.lang.Boolean) hasNext).booleanValue()) {
            }
        } catch (java.lang.Throwable th7) {
            receiveChannel2 = receiveChannel;
            th = th7;
            receiveChannel3 = receiveChannel2;
            throw th;
        }
        channelsKt__DeprecatedKt$lastOrNull$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1(continuation);
        java.lang.Object obj3 = channelsKt__DeprecatedKt$lastOrNull$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$lastOrNull$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0061, code lost:
    
        if (r2 != r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:13:0x007e, B:18:0x008b, B:19:0x0092), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #3 {all -> 0x009b, blocks: (B:35:0x0063, B:37:0x006b, B:41:0x0093, B:42:0x009a), top: B:34:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #3 {all -> 0x009b, blocks: (B:35:0x0063, B:37:0x006b, B:41:0x0093, B:42:0x009a), top: B:34:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 channelsKt__DeprecatedKt$single$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object obj;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1) {
                channelsKt__DeprecatedKt$single$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1) continuation;
                if ((channelsKt__DeprecatedKt$single$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$single$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj2 = channelsKt__DeprecatedKt$single$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$single$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        try {
                            it = receiveChannel.iterator();
                            channelsKt__DeprecatedKt$single$1.getHighSpeedVideoFpsRanges = receiveChannel;
                            channelsKt__DeprecatedKt$single$1.getHighSpeedVideoSizes = it;
                            channelsKt__DeprecatedKt$single$1.Camera2StreamConfigurationMap = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$single$1);
                        } catch (java.lang.Throwable th2) {
                            receiveChannel2 = receiveChannel;
                            th = th2;
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = channelsKt__DeprecatedKt$single$1.getHighSpeedVideoSizes;
                            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$single$1.getHighSpeedVideoFpsRanges;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                if (!((java.lang.Boolean) obj2).booleanValue()) {
                                    throw new java.lang.IllegalArgumentException("ReceiveChannel has more than one element.");
                                }
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                return obj;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th4) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                    throw th4;
                                }
                            }
                        }
                        kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$single$1.getHighSpeedVideoSizes;
                        receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$single$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            it = channelIterator;
                            receiveChannel = receiveChannel3;
                            hasNext = obj2;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            receiveChannel2 = receiveChannel3;
                            throw th;
                        }
                    }
                    if (((java.lang.Boolean) hasNext).booleanValue()) {
                        throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                    }
                    java.lang.Object next = it.next();
                    channelsKt__DeprecatedKt$single$1.getHighSpeedVideoFpsRanges = receiveChannel;
                    channelsKt__DeprecatedKt$single$1.getHighSpeedVideoSizes = next;
                    channelsKt__DeprecatedKt$single$1.Camera2StreamConfigurationMap = 2;
                    obj2 = it.hasNext(channelsKt__DeprecatedKt$single$1);
                    if (obj2 != coroutine_suspended) {
                        receiveChannel2 = receiveChannel;
                        obj = next;
                        if (!((java.lang.Boolean) obj2).booleanValue()) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (((java.lang.Boolean) hasNext).booleanValue()) {
            }
        } catch (java.lang.Throwable th6) {
            receiveChannel3 = receiveChannel;
            th = th6;
            receiveChannel2 = receiveChannel3;
            throw th;
        }
        channelsKt__DeprecatedKt$single$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1(continuation);
        java.lang.Object obj22 = channelsKt__DeprecatedKt$single$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$single$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0062, code lost:
    
        if (r2 != r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:35:0x0064, B:39:0x0070), top: B:34:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 channelsKt__DeprecatedKt$singleOrNull$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object obj;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1) {
                channelsKt__DeprecatedKt$singleOrNull$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1) continuation;
                if ((channelsKt__DeprecatedKt$singleOrNull$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$singleOrNull$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj2 = channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$singleOrNull$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        try {
                            it = receiveChannel.iterator();
                            channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoFpsRanges = receiveChannel;
                            channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoFpsRangesFor = it;
                            channelsKt__DeprecatedKt$singleOrNull$1.Camera2StreamConfigurationMap = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$singleOrNull$1);
                        } catch (java.lang.Throwable th2) {
                            receiveChannel2 = receiveChannel;
                            th = th2;
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoFpsRangesFor;
                            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoFpsRanges;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                if (((java.lang.Boolean) obj2).booleanValue()) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                    return obj;
                                }
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                return null;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th4) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                    throw th4;
                                }
                            }
                        }
                        kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoFpsRangesFor;
                        receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoFpsRanges;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            it = channelIterator;
                            receiveChannel = receiveChannel3;
                            hasNext = obj2;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            receiveChannel2 = receiveChannel3;
                            throw th;
                        }
                    }
                    if (!((java.lang.Boolean) hasNext).booleanValue()) {
                        java.lang.Object next = it.next();
                        channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoFpsRanges = receiveChannel;
                        channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoFpsRangesFor = next;
                        channelsKt__DeprecatedKt$singleOrNull$1.Camera2StreamConfigurationMap = 2;
                        obj2 = it.hasNext(channelsKt__DeprecatedKt$singleOrNull$1);
                        if (obj2 != coroutine_suspended) {
                            receiveChannel2 = receiveChannel;
                            obj = next;
                            if (((java.lang.Boolean) obj2).booleanValue()) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                    return null;
                }
            }
            if (!((java.lang.Boolean) hasNext).booleanValue()) {
            }
        } catch (java.lang.Throwable th6) {
            receiveChannel3 = receiveChannel;
            th = th6;
            receiveChannel2 = receiveChannel3;
            throw th;
        }
        channelsKt__DeprecatedKt$singleOrNull$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1(continuation);
        java.lang.Object obj22 = channelsKt__DeprecatedKt$singleOrNull$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$singleOrNull$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return drop(receiveChannel, i, coroutineContext);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel drop(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return dropWhile(receiveChannel, coroutineContext, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel dropWhile(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filter$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.filter(receiveChannel, coroutineContext, function2);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filter(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return filterIndexed(receiveChannel, coroutineContext, function3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterIndexed(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return filterNot(receiveChannel, coroutineContext, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel filterNot(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ChannelsKt.filter(receiveChannel, coroutineContext, new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1(function2, null));
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNotNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel) {
        kotlinx.coroutines.channels.ReceiveChannel<E> filter$default = filter$default(receiveChannel, null, new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1(null), 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(filter$default, "");
        return filter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:14:0x005f, B:16:0x0067, B:18:0x006d, B:20:0x004c, B:25:0x0073, B:43:0x0048), top: B:42:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:14:0x005f, B:16:0x0067, B:18:0x006d, B:20:0x004c, B:25:0x0073, B:43:0x0048), top: B:42:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:13:0x0039). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.util.Collection collection, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 channelsKt__DeprecatedKt$filterNotNullTo$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1) {
            channelsKt__DeprecatedKt$filterNotNullTo$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1) continuation;
            if ((channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$filterNotNullTo$1.Camera2StreamConfigurationMap = collection;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRanges = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRangesFor = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRanges;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.Collection collection2 = (java.util.Collection) channelsKt__DeprecatedKt$filterNotNullTo$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 channelsKt__DeprecatedKt$filterNotNullTo$12 = channelsKt__DeprecatedKt$filterNotNullTo$1;
                        kotlinx.coroutines.channels.ChannelIterator channelIterator2 = channelIterator;
                        receiveChannel = receiveChannel2;
                        collection = collection2;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 channelsKt__DeprecatedKt$filterNotNullTo$13 = channelsKt__DeprecatedKt$filterNotNullTo$12;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                            return collection;
                        }
                        java.lang.Object next = channelIterator2.next();
                        if (next != null) {
                            collection.add(next);
                        }
                        it = channelIterator2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1 = channelsKt__DeprecatedKt$filterNotNullTo$13;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.Camera2StreamConfigurationMap = collection;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.getHighResolutionOutputSizeshNQ4ISI = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRanges = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRangesFor = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$1);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        channelsKt__DeprecatedKt$filterNotNullTo$12 = channelsKt__DeprecatedKt$filterNotNullTo$1;
                        channelIterator2 = it;
                        obj = hasNext;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 channelsKt__DeprecatedKt$filterNotNullTo$132 = channelsKt__DeprecatedKt$filterNotNullTo$12;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$filterNotNullTo$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$filterNotNullTo$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x0035, B:17:0x0070, B:19:0x0078, B:21:0x007e, B:24:0x008d, B:42:0x0050), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x0035, B:17:0x0070, B:19:0x0078, B:21:0x007e, B:24:0x008d, B:42:0x0050), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007c -> B:13:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:13:0x0038). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlinx.coroutines.channels.SendChannel sendChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3 channelsKt__DeprecatedKt$filterNotNullTo$3;
        int i;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.SendChannel sendChannel2;
        kotlinx.coroutines.channels.SendChannel sendChannel3;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3) {
                channelsKt__DeprecatedKt$filterNotNullTo$3 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3) continuation;
                if ((channelsKt__DeprecatedKt$filterNotNullTo$3.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$filterNotNullTo$3.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$filterNotNullTo$3.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$filterNotNullTo$3.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            sendChannel3 = sendChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRangesFor = sendChannel3;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoSizes = receiveChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRanges = it;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.getHighResolutionOutputSizeshNQ4ISI = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                            if (hasNext != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th) {
                            sendChannel = receiveChannel;
                            th = th;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(sendChannel, th);
                                throw th2;
                            }
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRanges;
                        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoSizes;
                        sendChannel2 = (kotlinx.coroutines.channels.SendChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3 = receiveChannel2;
                        it = channelIterator;
                        receiveChannel = receiveChannel3;
                        sendChannel3 = sendChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRangesFor = sendChannel3;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoSizes = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRanges = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.getHighResolutionOutputSizeshNQ4ISI = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                        if (hasNext != coroutine_suspended) {
                            kotlinx.coroutines.channels.SendChannel sendChannel4 = sendChannel3;
                            sendChannel = receiveChannel;
                            channelIterator = it;
                            obj = hasNext;
                            sendChannel2 = sendChannel4;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(sendChannel, null);
                                return sendChannel2;
                            }
                            java.lang.Object next = channelIterator.next();
                            receiveChannel3 = sendChannel;
                            if (next != null) {
                                channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRangesFor = sendChannel2;
                                channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoSizes = sendChannel;
                                channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRanges = channelIterator;
                                channelsKt__DeprecatedKt$filterNotNullTo$3.getHighResolutionOutputSizeshNQ4ISI = 2;
                                receiveChannel3 = sendChannel;
                                if (sendChannel2.send(next, channelsKt__DeprecatedKt$filterNotNullTo$3) == coroutine_suspended) {
                                }
                            }
                            it = channelIterator;
                            receiveChannel = receiveChannel3;
                            sendChannel3 = sendChannel2;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRangesFor = sendChannel3;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoSizes = receiveChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRanges = it;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.getHighResolutionOutputSizeshNQ4ISI = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                            if (hasNext != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRanges;
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoSizes;
                    sendChannel2 = (kotlinx.coroutines.channels.SendChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    sendChannel = receiveChannel4;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        channelsKt__DeprecatedKt$filterNotNullTo$3 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$3.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$filterNotNullTo$3.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return take(receiveChannel, i, coroutineContext);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel take(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1(i, receiveChannel, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return takeWhile(receiveChannel, coroutineContext, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel takeWhile(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1(receiveChannel, function2, null), 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:12:0x0035, B:17:0x0070, B:19:0x0078, B:22:0x008b, B:40:0x0050), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:12:0x0035, B:17:0x0070, B:19:0x0078, B:22:0x008b, B:40:0x0050), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0088 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.Continuation<? super C> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1 channelsKt__DeprecatedKt$toChannel$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<? extends E> it;
        kotlinx.coroutines.channels.ChannelIterator<? extends E> channelIterator;
        kotlinx.coroutines.channels.SendChannel sendChannel;
        kotlinx.coroutines.channels.SendChannel sendChannel2;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) {
                channelsKt__DeprecatedKt$toChannel$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1) continuation;
                if ((channelsKt__DeprecatedKt$toChannel$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$toChannel$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$toChannel$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            sendChannel2 = c;
                            channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoFpsRangesFor = sendChannel2;
                            channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoSizes = receiveChannel;
                            channelsKt__DeprecatedKt$toChannel$1.Camera2StreamConfigurationMap = it;
                            channelsKt__DeprecatedKt$toChannel$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                            if (hasNext != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th) {
                            c = receiveChannel;
                            th = th;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(c, th);
                                throw th2;
                            }
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.Camera2StreamConfigurationMap;
                        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2 = (C) ((kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoSizes);
                        sendChannel = (kotlinx.coroutines.channels.SendChannel) channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel3 = receiveChannel2;
                        it = channelIterator;
                        receiveChannel = receiveChannel3;
                        sendChannel2 = (C) sendChannel;
                        channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoFpsRangesFor = sendChannel2;
                        channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoSizes = receiveChannel;
                        channelsKt__DeprecatedKt$toChannel$1.Camera2StreamConfigurationMap = it;
                        channelsKt__DeprecatedKt$toChannel$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                        if (hasNext != coroutine_suspended) {
                            kotlinx.coroutines.channels.SendChannel sendChannel3 = sendChannel2;
                            boolean z = (C) receiveChannel;
                            channelIterator = it;
                            obj = hasNext;
                            sendChannel = sendChannel3;
                            c = z;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                E next = channelIterator.next();
                                channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoFpsRangesFor = sendChannel;
                                channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoSizes = (java.lang.Object) c;
                                channelsKt__DeprecatedKt$toChannel$1.Camera2StreamConfigurationMap = channelIterator;
                                channelsKt__DeprecatedKt$toChannel$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                                receiveChannel3 = c;
                                if (sendChannel.send(next, channelsKt__DeprecatedKt$toChannel$1) == coroutine_suspended) {
                                }
                                it = channelIterator;
                                receiveChannel = receiveChannel3;
                                sendChannel2 = (C) sendChannel;
                                channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoFpsRangesFor = sendChannel2;
                                channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoSizes = receiveChannel;
                                channelsKt__DeprecatedKt$toChannel$1.Camera2StreamConfigurationMap = it;
                                channelsKt__DeprecatedKt$toChannel$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                                if (hasNext != coroutine_suspended) {
                                }
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed((kotlinx.coroutines.channels.ReceiveChannel) c, null);
                                return sendChannel;
                            }
                        }
                        return coroutine_suspended;
                    }
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.Camera2StreamConfigurationMap;
                    boolean z2 = (C) ((kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoSizes);
                    sendChannel = (kotlinx.coroutines.channels.SendChannel) channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    c = z2;
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        channelsKt__DeprecatedKt$toChannel$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$toChannel$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toChannel$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:14:0x005f, B:16:0x0067, B:17:0x004c, B:22:0x0071, B:40:0x0048), top: B:39:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:14:0x005f, B:16:0x0067, B:17:0x004c, B:22:0x0071, B:40:0x0048), top: B:39:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.Continuation<? super C> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 channelsKt__DeprecatedKt$toCollection$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<? extends E> it;
        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2;
        java.lang.Throwable th;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1) {
            channelsKt__DeprecatedKt$toCollection$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1) continuation;
            if ((channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$toCollection$1.getHighResolutionOutputSizeshNQ4ISI = c;
                        channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoSizes = receiveChannel;
                        channelsKt__DeprecatedKt$toCollection$1.Camera2StreamConfigurationMap = it;
                        channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoFpsRanges = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toCollection$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator<? extends E> channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$toCollection$1.Camera2StreamConfigurationMap;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoSizes;
                    ?? r2 = (java.util.Collection) channelsKt__DeprecatedKt$toCollection$1.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 channelsKt__DeprecatedKt$toCollection$12 = channelsKt__DeprecatedKt$toCollection$1;
                        kotlinx.coroutines.channels.ChannelIterator<? extends E> channelIterator2 = channelIterator;
                        receiveChannel = receiveChannel2;
                        c = r2;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 channelsKt__DeprecatedKt$toCollection$13 = channelsKt__DeprecatedKt$toCollection$12;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            c.add(channelIterator2.next());
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$toCollection$1 = channelsKt__DeprecatedKt$toCollection$13;
                            channelsKt__DeprecatedKt$toCollection$1.getHighResolutionOutputSizeshNQ4ISI = c;
                            channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoSizes = receiveChannel;
                            channelsKt__DeprecatedKt$toCollection$1.Camera2StreamConfigurationMap = it;
                            channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoFpsRanges = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toCollection$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__DeprecatedKt$toCollection$12 = channelsKt__DeprecatedKt$toCollection$1;
                            channelIterator2 = it;
                            obj = hasNext;
                            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 channelsKt__DeprecatedKt$toCollection$132 = channelsKt__DeprecatedKt$toCollection$12;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return c;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$toCollection$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toCollection$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:14:0x005f, B:16:0x0067, B:17:0x004c, B:22:0x007b, B:40:0x0048), top: B:39:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:14:0x005f, B:16:0x0067, B:17:0x004c, B:22:0x007b, B:40:0x0048), top: B:39:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> receiveChannel, M m, kotlin.coroutines.Continuation<? super M> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 channelsKt__DeprecatedKt$toMap$2;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<? extends kotlin.Pair<? extends K, ? extends V>> it;
        kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> receiveChannel2;
        java.lang.Throwable th;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2) {
            channelsKt__DeprecatedKt$toMap$2 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2) continuation;
            if ((channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRangesFor = m;
                        channelsKt__DeprecatedKt$toMap$2.Camera2StreamConfigurationMap = receiveChannel;
                        channelsKt__DeprecatedKt$toMap$2.getHighResolutionOutputSizeshNQ4ISI = it;
                        channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRanges = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toMap$2);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator<? extends kotlin.Pair<? extends K, ? extends V>> channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$toMap$2.getHighResolutionOutputSizeshNQ4ISI;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$toMap$2.Camera2StreamConfigurationMap;
                    java.lang.Object obj2 = (java.util.Map) channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 channelsKt__DeprecatedKt$toMap$22 = channelsKt__DeprecatedKt$toMap$2;
                        kotlinx.coroutines.channels.ChannelIterator<? extends kotlin.Pair<? extends K, ? extends V>> channelIterator2 = channelIterator;
                        receiveChannel = receiveChannel2;
                        m = (M) obj2;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 channelsKt__DeprecatedKt$toMap$23 = channelsKt__DeprecatedKt$toMap$22;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            kotlin.Pair<? extends K, ? extends V> next = channelIterator2.next();
                            m.put(next.getFirst(), next.getSecond());
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$toMap$2 = channelsKt__DeprecatedKt$toMap$23;
                            channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRangesFor = m;
                            channelsKt__DeprecatedKt$toMap$2.Camera2StreamConfigurationMap = receiveChannel;
                            channelsKt__DeprecatedKt$toMap$2.getHighResolutionOutputSizeshNQ4ISI = it;
                            channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRanges = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toMap$2);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__DeprecatedKt$toMap$22 = channelsKt__DeprecatedKt$toMap$2;
                            channelIterator2 = it;
                            obj = hasNext;
                            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 channelsKt__DeprecatedKt$toMap$232 = channelsKt__DeprecatedKt$toMap$22;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return m;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$toMap$2 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2(continuation);
        java.lang.Object obj3 = channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toMap$2.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return flatMap(receiveChannel, coroutineContext, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel flatMap(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel map$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.map(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> map(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1(receiveChannel, function2, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexed$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3);
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1(receiveChannel, function3, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return mapIndexedNotNull(receiveChannel, coroutineContext, function3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapIndexedNotNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3 function3) {
        return kotlinx.coroutines.channels.ChannelsKt.filterNotNull(kotlinx.coroutines.channels.ChannelsKt.mapIndexed(receiveChannel, coroutineContext, function3));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return mapNotNull(receiveChannel, coroutineContext, function2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel mapNotNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2) {
        return kotlinx.coroutines.channels.ChannelsKt.filterNotNull(kotlinx.coroutines.channels.ChannelsKt.map(receiveChannel, coroutineContext, function2));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return withIndex(receiveChannel, coroutineContext);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel withIndex(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1(receiveChannel, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel distinctBy$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.distinctBy(receiveChannel, coroutineContext, function2);
    }

    public static final <E, K> kotlinx.coroutines.channels.ReceiveChannel<E> distinctBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumes(receiveChannel), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1(receiveChannel, function2, null), 6, null);
    }

    public static final <E> java.lang.Object toMutableSet(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.Set<E>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt.toCollection(receiveChannel, new java.util.LinkedHashSet(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1 channelsKt__DeprecatedKt$any$1;
        int i;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1) {
                channelsKt__DeprecatedKt$any$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1) continuation;
                if ((channelsKt__DeprecatedKt$any$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$any$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$any$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$any$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$any$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                        channelsKt__DeprecatedKt$any$1.Camera2StreamConfigurationMap = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$any$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$any$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                    return obj;
                }
            }
            if (i != 0) {
            }
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
            return obj;
        } finally {
        }
        channelsKt__DeprecatedKt$any$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$any$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$any$1.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[Catch: all -> 0x007d, TryCatch #2 {all -> 0x007d, blocks: (B:13:0x005f, B:15:0x0067, B:16:0x0050, B:20:0x0070, B:38:0x004b), top: B:37:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:13:0x005f, B:15:0x0067, B:16:0x0050, B:20:0x0070, B:38:0x004b), top: B:37:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:13:0x005f). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 channelsKt__DeprecatedKt$count$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlin.jvm.internal.Ref.IntRef intRef;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1) {
            channelsKt__DeprecatedKt$count$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1) continuation;
            if ((channelsKt__DeprecatedKt$count$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$count$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = channelsKt__DeprecatedKt$count$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$count$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                    try {
                        it = receiveChannel.iterator();
                        intRef = intRef2;
                        channelsKt__DeprecatedKt$count$1.getHighSpeedVideoSizes = intRef;
                        channelsKt__DeprecatedKt$count$1.Camera2StreamConfigurationMap = receiveChannel;
                        channelsKt__DeprecatedKt$count$1.getHighSpeedVideoFpsRangesFor = it;
                        channelsKt__DeprecatedKt$count$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$count$1);
                        if (obj == coroutine_suspended) {
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$count$1.getHighSpeedVideoFpsRangesFor;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$count$1.Camera2StreamConfigurationMap;
                    intRef = (kotlin.jvm.internal.Ref.IntRef) channelsKt__DeprecatedKt$count$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = channelIterator;
                        receiveChannel = receiveChannel2;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            it.next();
                            intRef.element++;
                            channelsKt__DeprecatedKt$count$1.getHighSpeedVideoSizes = intRef;
                            channelsKt__DeprecatedKt$count$1.Camera2StreamConfigurationMap = receiveChannel;
                            channelsKt__DeprecatedKt$count$1.getHighSpeedVideoFpsRangesFor = it;
                            channelsKt__DeprecatedKt$count$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = it.hasNext(channelsKt__DeprecatedKt$count$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$count$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$count$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$count$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0074, code lost:
    
        if (r2 != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:14:0x0099, B:16:0x00a1, B:18:0x0088, B:58:0x0064), top: B:57:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082 A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:45:0x0076, B:49:0x0082), top: B:44:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0096 -> B:14:0x0099). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.util.Comparator comparator, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        java.lang.Object next;
        java.util.Comparator comparator2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1) {
                channelsKt__DeprecatedKt$maxWith$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1) continuation;
                if ((channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$maxWith$1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            channelsKt__DeprecatedKt$maxWith$1.Camera2StreamConfigurationMap = comparator;
                            channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                            channelsKt__DeprecatedKt$maxWith$1.getHighResolutionOutputSizeshNQ4ISI = it;
                            channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRanges = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                        } catch (java.lang.Throwable th2) {
                            receiveChannel3 = receiveChannel;
                            th = th2;
                            receiveChannel2 = receiveChannel3;
                            throw th;
                        }
                    } else if (i == 1) {
                        kotlinx.coroutines.channels.ChannelIterator channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.getHighResolutionOutputSizeshNQ4ISI;
                        receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRangesFor;
                        java.util.Comparator comparator3 = (java.util.Comparator) channelsKt__DeprecatedKt$maxWith$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            it = channelIterator2;
                            receiveChannel = receiveChannel3;
                            comparator = comparator3;
                            hasNext = obj;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            receiveChannel2 = receiveChannel3;
                            throw th;
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj2 = channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoSizes;
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.getHighResolutionOutputSizeshNQ4ISI;
                        receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRangesFor;
                        comparator2 = (java.util.Comparator) channelsKt__DeprecatedKt$maxWith$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            next = obj2;
                            receiveChannel = receiveChannel2;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                java.lang.Object next2 = channelIterator.next();
                                if (comparator2.compare(next, next2) < 0) {
                                    next = next2;
                                }
                                channelsKt__DeprecatedKt$maxWith$1.Camera2StreamConfigurationMap = comparator2;
                                channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                                channelsKt__DeprecatedKt$maxWith$1.getHighResolutionOutputSizeshNQ4ISI = channelIterator;
                                channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoSizes = next;
                                channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRanges = 2;
                                obj = channelIterator.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                    return next;
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th5) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                throw th5;
                            }
                        }
                    }
                    if (!((java.lang.Boolean) hasNext).booleanValue()) {
                        next = it.next();
                        comparator2 = comparator;
                        channelIterator = it;
                        channelsKt__DeprecatedKt$maxWith$1.Camera2StreamConfigurationMap = comparator2;
                        channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                        channelsKt__DeprecatedKt$maxWith$1.getHighResolutionOutputSizeshNQ4ISI = channelIterator;
                        channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoSizes = next;
                        channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRanges = 2;
                        obj = channelIterator.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                        if (obj == coroutine_suspended) {
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                        return null;
                    }
                }
            }
            if (!((java.lang.Boolean) hasNext).booleanValue()) {
            }
        } catch (java.lang.Throwable th6) {
            receiveChannel2 = receiveChannel;
            th = th6;
            throw th;
        }
        channelsKt__DeprecatedKt$maxWith$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1(continuation);
        java.lang.Object obj3 = channelsKt__DeprecatedKt$maxWith$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$maxWith$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0074, code lost:
    
        if (r2 != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:14:0x0099, B:16:0x00a1, B:18:0x0088, B:58:0x0064), top: B:57:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082 A[Catch: all -> 0x00b1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:45:0x0076, B:49:0x0082), top: B:44:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0096 -> B:14:0x0099). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.util.Comparator comparator, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        java.lang.Object next;
        java.util.Comparator comparator2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1) {
                channelsKt__DeprecatedKt$minWith$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1) continuation;
                if ((channelsKt__DeprecatedKt$minWith$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$minWith$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$minWith$1.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$minWith$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoSizes = comparator;
                            channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRanges = receiveChannel;
                            channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRangesFor = it;
                            channelsKt__DeprecatedKt$minWith$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$minWith$1);
                        } catch (java.lang.Throwable th2) {
                            receiveChannel3 = receiveChannel;
                            th = th2;
                            receiveChannel2 = receiveChannel3;
                            throw th;
                        }
                    } else if (i == 1) {
                        kotlinx.coroutines.channels.ChannelIterator channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRangesFor;
                        receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRanges;
                        java.util.Comparator comparator3 = (java.util.Comparator) channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            it = channelIterator2;
                            receiveChannel = receiveChannel3;
                            comparator = comparator3;
                            hasNext = obj;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            receiveChannel2 = receiveChannel3;
                            throw th;
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj2 = channelsKt__DeprecatedKt$minWith$1.Camera2StreamConfigurationMap;
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRangesFor;
                        receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRanges;
                        comparator2 = (java.util.Comparator) channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            next = obj2;
                            receiveChannel = receiveChannel2;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                java.lang.Object next2 = channelIterator.next();
                                if (comparator2.compare(next, next2) > 0) {
                                    next = next2;
                                }
                                channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoSizes = comparator2;
                                channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRanges = receiveChannel;
                                channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRangesFor = channelIterator;
                                channelsKt__DeprecatedKt$minWith$1.Camera2StreamConfigurationMap = next;
                                channelsKt__DeprecatedKt$minWith$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                                obj = channelIterator.hasNext(channelsKt__DeprecatedKt$minWith$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                    return next;
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th5) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                throw th5;
                            }
                        }
                    }
                    if (!((java.lang.Boolean) hasNext).booleanValue()) {
                        next = it.next();
                        comparator2 = comparator;
                        channelIterator = it;
                        channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoSizes = comparator2;
                        channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRanges = receiveChannel;
                        channelsKt__DeprecatedKt$minWith$1.getHighSpeedVideoFpsRangesFor = channelIterator;
                        channelsKt__DeprecatedKt$minWith$1.Camera2StreamConfigurationMap = next;
                        channelsKt__DeprecatedKt$minWith$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        obj = channelIterator.hasNext(channelsKt__DeprecatedKt$minWith$1);
                        if (obj == coroutine_suspended) {
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                        return null;
                    }
                }
            }
            if (!((java.lang.Boolean) hasNext).booleanValue()) {
            }
        } catch (java.lang.Throwable th6) {
            receiveChannel2 = receiveChannel;
            th = th6;
            throw th;
        }
        channelsKt__DeprecatedKt$minWith$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1(continuation);
        java.lang.Object obj3 = channelsKt__DeprecatedKt$minWith$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$minWith$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1 channelsKt__DeprecatedKt$none$1;
        int i;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1) {
                channelsKt__DeprecatedKt$none$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1) continuation;
                if ((channelsKt__DeprecatedKt$none$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$none$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = channelsKt__DeprecatedKt$none$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$none$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$none$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                        channelsKt__DeprecatedKt$none$1.Camera2StreamConfigurationMap = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$none$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$none$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!((java.lang.Boolean) obj).booleanValue());
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                    return boxBoolean;
                }
            }
            if (i != 0) {
            }
            java.lang.Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!((java.lang.Boolean) obj).booleanValue());
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
            return boxBoolean2;
        } finally {
        }
        channelsKt__DeprecatedKt$none$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$none$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$none$1.Camera2StreamConfigurationMap;
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel zip$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlinx.coroutines.channels.ReceiveChannel receiveChannel2, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getUnconfined();
        }
        return kotlinx.coroutines.channels.ChannelsKt.zip(receiveChannel, receiveChannel2, coroutineContext, function2);
    }

    public static final <E, R, V> kotlinx.coroutines.channels.ReceiveChannel<V> zip(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlinx.coroutines.channels.ReceiveChannel<? extends R> receiveChannel2, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> function2) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, 0, null, kotlinx.coroutines.channels.ChannelsKt.consumesAll(receiveChannel, receiveChannel2), new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2(receiveChannel2, receiveChannel, function2, null), 6, null);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumes(final kotlinx.coroutines.channels.ReceiveChannel<?> receiveChannel) {
        return new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.getHighSpeedVideoSizes(kotlinx.coroutines.channels.ReceiveChannel.this, (java.lang.Throwable) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.lang.Throwable th) {
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
        return kotlin.Unit.INSTANCE;
    }
}
