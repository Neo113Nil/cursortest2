package kotlinx.coroutines.channels;

/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000¸\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aC\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u001d\u0010\u0004\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u0002H\u00010\u0005¢\u0006\u0002\b\u0007H\u0087\b¢\u0006\u0002\u0010\b\u001a2\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\u0005H\u0087H¢\u0006\u0002\u0010\f\u001aJ\u0010\r\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u00122\u001a\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0014\"\u0006\u0012\u0002\b\u00030\u0006H\u0001¢\u0006\u0002\u0010\u0015\u001a&\u0010\u0016\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0087@¢\u0006\u0002\u0010\u0019\u001a(\u0010\u001a\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0087@¢\u0006\u0002\u0010\u0019\u001a\u001e\u0010\u001b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a \u0010\u001d\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a&\u0010\u001e\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u001f\u001a\u0002H\u0002H\u0087@¢\u0006\u0002\u0010 \u001a\u001e\u0010!\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a&\u0010\"\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u001f\u001a\u0002H\u0002H\u0087@¢\u0006\u0002\u0010 \u001a \u0010#\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010$\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a \u0010%\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a0\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020)H\u0007\u001aQ\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0007¢\u0006\u0002\u00100\u001aQ\u00101\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0001¢\u0006\u0002\u00100\u001af\u00102\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)27\u0010+\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010/03H\u0007¢\u0006\u0002\u00104\u001aQ\u00105\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0007¢\u0006\u0002\u00100\u001a$\u00106\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0006H\u0001\u001a>\u00107\u001a\u0002H8\"\b\b\u0000\u0010\u0002*\u00020/\"\u0010\b\u0001\u00108*\n\u0012\u0006\b\u0000\u0012\u0002H\u000209*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\u0006\u0010:\u001a\u0002H8H\u0087@¢\u0006\u0002\u0010;\u001a<\u00107\u001a\u0002H8\"\b\b\u0000\u0010\u0002*\u00020/\"\u000e\b\u0001\u00108*\b\u0012\u0004\u0012\u0002H\u00020<*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\u0006\u0010:\u001a\u0002H8H\u0087@¢\u0006\u0002\u0010=\u001a0\u0010>\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020)H\u0007\u001aQ\u0010?\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)2\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0007¢\u0006\u0002\u00100\u001a6\u0010@\u001a\u0002H8\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u00108*\b\u0012\u0004\u0012\u0002H\u00020<*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010:\u001a\u0002H8H\u0081@¢\u0006\u0002\u0010=\u001a8\u0010A\u001a\u0002H8\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u00108*\n\u0012\u0006\b\u0000\u0012\u0002H\u000209*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010:\u001a\u0002H8H\u0081@¢\u0006\u0002\u0010;\u001a<\u0010B\u001a\u000e\u0012\u0004\u0012\u0002HD\u0012\u0004\u0012\u0002HE0C\"\u0004\b\u0000\u0010D\"\u0004\b\u0001\u0010E*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002HD\u0012\u0004\u0012\u0002HE0F0\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001aR\u0010B\u001a\u0002HG\"\u0004\b\u0000\u0010D\"\u0004\b\u0001\u0010E\"\u0018\b\u0002\u0010G*\u0012\u0012\u0006\b\u0000\u0012\u0002HD\u0012\u0006\b\u0000\u0012\u0002HE0H*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002HD\u0012\u0004\u0012\u0002HE0F0\u00062\u0006\u0010:\u001a\u0002HGH\u0081@¢\u0006\u0002\u0010I\u001a$\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00020K\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a$\u0010L\u001a\b\u0012\u0004\u0012\u0002H\u00020M\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a]\u0010N\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)2(\u0010O\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00060-\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0007¢\u0006\u0002\u00100\u001aW\u0010P\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)2\"\u0010O\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010-\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0001¢\u0006\u0002\u00100\u001al\u0010Q\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)27\u0010O\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010-\u0012\u0006\u0012\u0004\u0018\u00010/03H\u0001¢\u0006\u0002\u00104\u001ar\u0010R\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0001*\u00020/*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)29\u0010O\u001a5\b\u0001\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010-\u0012\u0006\u0012\u0004\u0018\u00010/03H\u0007¢\u0006\u0002\u00104\u001a]\u0010S\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0001*\u00020/*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)2$\u0010O\u001a \b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010-\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0007¢\u0006\u0002\u00100\u001a.\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020U0\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)H\u0007\u001a\u001e\u0010V\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0007\u001aW\u0010W\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010D*\b\u0012\u0004\u0012\u0002H\u00020\u00062\b\b\u0002\u0010(\u001a\u00020)2\"\u0010X\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002HD0-\u0012\u0006\u0012\u0004\u0018\u00010/0,H\u0001¢\u0006\u0002\u00100\u001a$\u0010Y\u001a\b\u0012\u0004\u0012\u0002H\u00020Z\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0081@¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010[\u001a\u00020.\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010\\\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a<\u0010]\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u001a\u0010^\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020_j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002``H\u0087@¢\u0006\u0002\u0010a\u001a<\u0010b\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u001a\u0010^\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020_j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002``H\u0087@¢\u0006\u0002\u0010a\u001a\u001e\u0010c\u001a\u00020.\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087@¢\u0006\u0002\u0010\u001c\u001a$\u0010d\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0006H\u0007\u001a?\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010F0\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00062\f\u0010f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0087\u0004\u001az\u0010e\u001a\b\u0012\u0004\u0012\u0002HE0\u0006\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010E*\b\u0012\u0004\u0012\u0002H\u00020\u00062\f\u0010f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00062\b\b\u0002\u0010(\u001a\u00020)26\u0010O\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(g\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(h\u0012\u0004\u0012\u0002HE0,H\u0001\u001a1\u0010i\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u0012*\u0006\u0012\u0002\b\u00030\u0006H\u0001¨\u0006j"}, d2 = {"consume", "R", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/BroadcastChannel;", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "", "action", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumesAll", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", "elementAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "first", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", com.ironsource.Ad.d, "singleOrNull", "drop", com.ironsource.B5.q, "context", "Lkotlin/coroutines/CoroutineContext;", "dropWhile", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", "destination", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toSet", "", "flatMap", "transform", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "withIndex", "Lkotlin/collections/IndexedValue;", "distinct", "distinctBy", "selector", "toMutableSet", "", "any", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "zip", "other", "a", "b", "consumes", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes6.dex */
final /* synthetic */ class ChannelsKt__DeprecatedKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> function1) {
        kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
        try {
            return function1.invoke(openSubscription);
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) openSubscription, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x0078), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x0078), top: B:14:0x0066 }] */
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
            if ((channelsKt__DeprecatedKt$consumeEach$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$consumeEach$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = channelsKt__DeprecatedKt$consumeEach$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$consumeEach$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
                    try {
                        receiveChannel2 = openSubscription;
                        it = openSubscription.iterator();
                        channelsKt__DeprecatedKt$consumeEach$1.L$0 = function1;
                        channelsKt__DeprecatedKt$consumeEach$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$consumeEach$1.L$2 = it;
                        channelsKt__DeprecatedKt$consumeEach$1.label = 1;
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$consumeEach$1.L$2;
                    receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$consumeEach$1.L$1;
                    kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) channelsKt__DeprecatedKt$consumeEach$1.L$0;
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
                                    channelsKt__DeprecatedKt$consumeEach$1.L$0 = function1;
                                    channelsKt__DeprecatedKt$consumeEach$1.L$1 = receiveChannel2;
                                    channelsKt__DeprecatedKt$consumeEach$1.L$2 = it;
                                    channelsKt__DeprecatedKt$consumeEach$1.label = 1;
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
                                        kotlin.jvm.internal.InlineMarker.finallyStart(1);
                                        kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
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
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        channelsKt__DeprecatedKt$consumeEach$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$consumeEach$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$consumeEach$1.label;
        if (i != 0) {
        }
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        throw th;
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(final kotlinx.coroutines.channels.ReceiveChannel<?>... receiveChannelArr) {
        return new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit consumesAll$lambda$2$ChannelsKt__DeprecatedKt;
                consumesAll$lambda$2$ChannelsKt__DeprecatedKt = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumesAll$lambda$2$ChannelsKt__DeprecatedKt(receiveChannelArr, (java.lang.Throwable) obj);
                return consumesAll$lambda$2$ChannelsKt__DeprecatedKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit consumesAll$lambda$2$ChannelsKt__DeprecatedKt(kotlinx.coroutines.channels.ReceiveChannel[] receiveChannelArr, java.lang.Throwable th) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0037, B:13:0x0066, B:15:0x006e, B:26:0x007e, B:27:0x0095), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0037, B:13:0x0066, B:15:0x006e, B:26:0x007e, B:27:0x0095), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:13:0x0066). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, int i, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1 channelsKt__DeprecatedKt$elementAt$1;
        int i2;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        int i3;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1) {
                channelsKt__DeprecatedKt$elementAt$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1) continuation;
                if ((channelsKt__DeprecatedKt$elementAt$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$elementAt$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = channelsKt__DeprecatedKt$elementAt$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = channelsKt__DeprecatedKt$elementAt$1.label;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (i < 0) {
                            throw new java.lang.IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + '.');
                        }
                        it = receiveChannel.iterator();
                        i3 = 0;
                        channelsKt__DeprecatedKt$elementAt$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$elementAt$1.L$1 = it;
                        channelsKt__DeprecatedKt$elementAt$1.I$0 = i;
                        channelsKt__DeprecatedKt$elementAt$1.I$1 = i3;
                        channelsKt__DeprecatedKt$elementAt$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAt$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = channelsKt__DeprecatedKt$elementAt$1.I$1;
                        i = channelsKt__DeprecatedKt$elementAt$1.I$0;
                        kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$elementAt$1.L$1;
                        receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$elementAt$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                java.lang.Object next = channelIterator.next();
                                int i5 = i4 + 1;
                                if (i == i4) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                    return next;
                                }
                                it = channelIterator;
                                receiveChannel = receiveChannel2;
                                i3 = i5;
                                channelsKt__DeprecatedKt$elementAt$1.L$0 = receiveChannel;
                                channelsKt__DeprecatedKt$elementAt$1.L$1 = it;
                                channelsKt__DeprecatedKt$elementAt$1.I$0 = i;
                                channelsKt__DeprecatedKt$elementAt$1.I$1 = i3;
                                channelsKt__DeprecatedKt$elementAt$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAt$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel2 = receiveChannel;
                                i4 = i3;
                                channelIterator = it;
                                obj = hasNext;
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    throw new java.lang.IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i + '.');
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th3) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (java.lang.Throwable th4) {
            receiveChannel2 = receiveChannel;
            th = th4;
        }
        channelsKt__DeprecatedKt$elementAt$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$elementAt$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = channelsKt__DeprecatedKt$elementAt$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:13:0x006c, B:15:0x0074, B:22:0x0056, B:46:0x0050), top: B:45:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0067 -> B:13:0x006c). Please report as a decompilation issue!!! */
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
        java.lang.Throwable th2;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1) {
            channelsKt__DeprecatedKt$elementAtOrNull$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$elementAtOrNull$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$elementAtOrNull$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = channelsKt__DeprecatedKt$elementAtOrNull$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = channelsKt__DeprecatedKt$elementAtOrNull$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i >= 0) {
                        try {
                            it = receiveChannel.iterator();
                            i3 = 0;
                            th = null;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$1 = it;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$0 = i;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$1 = i3;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAtOrNull$1);
                            if (hasNext != coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th3) {
                            receiveChannel2 = receiveChannel;
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                        return null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = channelsKt__DeprecatedKt$elementAtOrNull$1.I$1;
                    i = channelsKt__DeprecatedKt$elementAtOrNull$1.I$0;
                    kotlinx.coroutines.channels.ChannelIterator channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$elementAtOrNull$1.L$1;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$elementAtOrNull$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.Throwable th4 = null;
                        i3 = i4;
                        receiveChannel = receiveChannel2;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                        kotlinx.coroutines.channels.ChannelIterator channelIterator2 = channelIterator;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            java.lang.Object next = channelIterator2.next();
                            int i5 = i3 + 1;
                            if (i == i3) {
                                return next;
                            }
                            it = channelIterator2;
                            channelsKt__DeprecatedKt$elementAtOrNull$1 = channelsKt__DeprecatedKt$elementAtOrNull$12;
                            th = th2;
                            i3 = i5;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.L$1 = it;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$0 = i;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.I$1 = i3;
                            channelsKt__DeprecatedKt$elementAtOrNull$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$elementAtOrNull$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$13 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                            channelIterator2 = it;
                            obj = hasNext;
                            th4 = th;
                            channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$13;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                return null;
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        th2 = th5;
                        try {
                            throw th2;
                        } finally {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th2);
                        }
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$elementAtOrNull$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$elementAtOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = channelsKt__DeprecatedKt$elementAtOrNull$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x0054, B:14:0x005c, B:18:0x0065, B:19:0x006c), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x0054, B:14:0x005c, B:18:0x0065, B:19:0x006c), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1 channelsKt__DeprecatedKt$first$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1) {
            channelsKt__DeprecatedKt$first$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1) continuation;
            if ((channelsKt__DeprecatedKt$first$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$first$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$first$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$first$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$first$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$first$1.L$1 = it;
                        channelsKt__DeprecatedKt$first$1.label = 1;
                        java.lang.Object hasNext = it.hasNext(channelsKt__DeprecatedKt$first$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$first$1.L$1;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$first$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
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
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                }
                java.lang.Object next = channelIterator.next();
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                return next;
            }
        }
        channelsKt__DeprecatedKt$first$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1(continuation);
        obj = channelsKt__DeprecatedKt$first$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$first$1.label;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x0054, B:18:0x0061), top: B:10:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1 channelsKt__DeprecatedKt$firstOrNull$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1) {
            channelsKt__DeprecatedKt$firstOrNull$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$firstOrNull$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$firstOrNull$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$firstOrNull$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$firstOrNull$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$firstOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$firstOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$firstOrNull$1.label = 1;
                        java.lang.Object hasNext = it.hasNext(channelsKt__DeprecatedKt$firstOrNull$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$firstOrNull$1.L$1;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$firstOrNull$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
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
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object next = channelIterator.next();
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return next;
                }
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                return null;
            }
        }
        channelsKt__DeprecatedKt$firstOrNull$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$firstOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$firstOrNull$1.label;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0068, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0054, B:25:0x008b), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0068, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0054, B:25:0x008b), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:12:0x0068). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1 channelsKt__DeprecatedKt$indexOf$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlin.jvm.internal.Ref.IntRef intRef;
        java.lang.Object obj2;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1) {
                channelsKt__DeprecatedKt$indexOf$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1) continuation;
                if ((channelsKt__DeprecatedKt$indexOf$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$indexOf$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj3 = channelsKt__DeprecatedKt$indexOf$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$indexOf$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                        try {
                            receiveChannel2 = receiveChannel;
                            it = receiveChannel.iterator();
                            intRef = intRef2;
                            obj2 = obj;
                            channelsKt__DeprecatedKt$indexOf$1.L$0 = obj2;
                            channelsKt__DeprecatedKt$indexOf$1.L$1 = intRef;
                            channelsKt__DeprecatedKt$indexOf$1.L$2 = receiveChannel2;
                            channelsKt__DeprecatedKt$indexOf$1.L$3 = it;
                            channelsKt__DeprecatedKt$indexOf$1.label = 1;
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
                        it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$indexOf$1.L$3;
                        receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$indexOf$1.L$2;
                        intRef = (kotlin.jvm.internal.Ref.IntRef) channelsKt__DeprecatedKt$indexOf$1.L$1;
                        java.lang.Object obj4 = channelsKt__DeprecatedKt$indexOf$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj3);
                            if (((java.lang.Boolean) obj3).booleanValue()) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(obj4, it.next())) {
                                    java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                    return boxInt;
                                }
                                intRef.element++;
                                obj2 = obj4;
                                channelsKt__DeprecatedKt$indexOf$1.L$0 = obj2;
                                channelsKt__DeprecatedKt$indexOf$1.L$1 = intRef;
                                channelsKt__DeprecatedKt$indexOf$1.L$2 = receiveChannel2;
                                channelsKt__DeprecatedKt$indexOf$1.L$3 = it;
                                channelsKt__DeprecatedKt$indexOf$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$indexOf$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj4 = obj2;
                                obj3 = hasNext;
                                if (((java.lang.Boolean) obj3).booleanValue()) {
                                }
                            } else {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
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
        java.lang.Object obj32 = channelsKt__DeprecatedKt$indexOf$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$indexOf$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:12:0x0034, B:13:0x008c, B:15:0x0094), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x004c, B:41:0x006a, B:43:0x0072, B:45:0x009e, B:46:0x00a5), top: B:39:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x004c, B:41:0x006a, B:43:0x0072, B:45:0x009e, B:46:0x00a5), top: B:39:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0088 -> B:13:0x008c). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1 channelsKt__DeprecatedKt$last$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        java.lang.Object next;
        kotlinx.coroutines.channels.ChannelIterator channelIterator2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1) {
            channelsKt__DeprecatedKt$last$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1) continuation;
            if ((channelsKt__DeprecatedKt$last$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$last$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$last$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$last$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$last$1.L$1 = it;
                        channelsKt__DeprecatedKt$last$1.label = 1;
                        java.lang.Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$last$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                    } catch (java.lang.Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i == 1) {
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$last$1.L$1;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$last$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj2 = channelsKt__DeprecatedKt$last$1.L$2;
                    channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$last$1.L$1;
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$last$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            receiveChannel = receiveChannel3;
                            channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$last$1.L$1 = channelIterator2;
                            channelsKt__DeprecatedKt$last$1.L$2 = next;
                            channelsKt__DeprecatedKt$last$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$last$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            receiveChannel3 = receiveChannel;
                            obj2 = next;
                            obj = hasNext;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                }
                next = channelIterator.next();
                kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$last$1.L$0 = receiveChannel;
                channelsKt__DeprecatedKt$last$1.L$1 = channelIterator2;
                channelsKt__DeprecatedKt$last$1.L$2 = next;
                channelsKt__DeprecatedKt$last$1.label = 2;
                hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$last$1);
                if (hasNext != coroutine_suspended) {
                }
            }
        }
        channelsKt__DeprecatedKt$last$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1(continuation);
        obj = channelsKt__DeprecatedKt$last$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$last$1.label;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:11:0x0039, B:12:0x0077, B:14:0x007f, B:16:0x0089, B:17:0x008d, B:18:0x0061, B:23:0x0094), top: B:10:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #2 {all -> 0x003d, blocks: (B:11:0x0039, B:12:0x0077, B:14:0x007f, B:16:0x0089, B:17:0x008d, B:18:0x0061, B:23:0x0094), top: B:10:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:12:0x0077). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1 channelsKt__DeprecatedKt$lastIndexOf$1;
        int i;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        java.lang.Object obj2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1) {
            channelsKt__DeprecatedKt$lastIndexOf$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1) continuation;
            if ((channelsKt__DeprecatedKt$lastIndexOf$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastIndexOf$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj3 = channelsKt__DeprecatedKt$lastIndexOf$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$lastIndexOf$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    kotlin.jvm.internal.Ref.IntRef intRef3 = new kotlin.jvm.internal.Ref.IntRef();
                    intRef3.element = -1;
                    intRef = new kotlin.jvm.internal.Ref.IntRef();
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        intRef2 = intRef3;
                        obj2 = obj;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$0 = obj2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$1 = intRef2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$2 = intRef;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$3 = receiveChannel2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.L$4 = it;
                        channelsKt__DeprecatedKt$lastIndexOf$1.label = 1;
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$lastIndexOf$1.L$4;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$lastIndexOf$1.L$3;
                    intRef = (kotlin.jvm.internal.Ref.IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.L$2;
                    intRef2 = (kotlin.jvm.internal.Ref.IntRef) channelsKt__DeprecatedKt$lastIndexOf$1.L$1;
                    java.lang.Object obj4 = channelsKt__DeprecatedKt$lastIndexOf$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        if (((java.lang.Boolean) obj3).booleanValue()) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(obj4, it.next())) {
                                intRef2.element = intRef.element;
                            }
                            intRef.element++;
                            obj2 = obj4;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$0 = obj2;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$1 = intRef2;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$2 = intRef;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$3 = receiveChannel2;
                            channelsKt__DeprecatedKt$lastIndexOf$1.L$4 = it;
                            channelsKt__DeprecatedKt$lastIndexOf$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$lastIndexOf$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj4 = obj2;
                            obj3 = hasNext;
                            if (((java.lang.Boolean) obj3).booleanValue()) {
                            }
                        } else {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                            return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef2.element);
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
        java.lang.Object obj32 = channelsKt__DeprecatedKt$lastIndexOf$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$lastIndexOf$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #3 {all -> 0x0038, blocks: (B:12:0x0034, B:13:0x0090, B:15:0x0098), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[Catch: all -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x004c, B:41:0x006a, B:45:0x0076), top: B:39:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008c -> B:13:0x0090). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1 channelsKt__DeprecatedKt$lastOrNull$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        java.lang.Object next;
        kotlinx.coroutines.channels.ChannelIterator channelIterator2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1) {
            channelsKt__DeprecatedKt$lastOrNull$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$lastOrNull$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastOrNull$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$lastOrNull$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$lastOrNull$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$lastOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$lastOrNull$1.label = 1;
                        java.lang.Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                    } catch (java.lang.Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i == 1) {
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.L$1;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj2 = channelsKt__DeprecatedKt$lastOrNull$1.L$2;
                    channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.L$1;
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            receiveChannel = receiveChannel3;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$1 = channelIterator2;
                            channelsKt__DeprecatedKt$lastOrNull$1.L$2 = next;
                            channelsKt__DeprecatedKt$lastOrNull$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            receiveChannel3 = receiveChannel;
                            obj2 = next;
                            obj = hasNext;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    next = channelIterator.next();
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = receiveChannel2;
                    channelIterator2 = channelIterator;
                    receiveChannel = receiveChannel4;
                    channelsKt__DeprecatedKt$lastOrNull$1.L$0 = receiveChannel;
                    channelsKt__DeprecatedKt$lastOrNull$1.L$1 = channelIterator2;
                    channelsKt__DeprecatedKt$lastOrNull$1.L$2 = next;
                    channelsKt__DeprecatedKt$lastOrNull$1.label = 2;
                    hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$lastOrNull$1);
                    if (hasNext != coroutine_suspended) {
                    }
                } else {
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return null;
                }
            }
        }
        channelsKt__DeprecatedKt$lastOrNull$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$lastOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$lastOrNull$1.label;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:13:0x0082, B:18:0x008f, B:19:0x0096), top: B:11:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:33:0x0047, B:34:0x0065, B:36:0x006d, B:40:0x0097, B:41:0x009e), top: B:32:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #2 {all -> 0x004b, blocks: (B:33:0x0047, B:34:0x0065, B:36:0x006d, B:40:0x0097, B:41:0x009e), top: B:32:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1 channelsKt__DeprecatedKt$single$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object obj2;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1) {
            channelsKt__DeprecatedKt$single$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1) continuation;
            if ((channelsKt__DeprecatedKt$single$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$single$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$single$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$single$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$single$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$single$1.L$1 = it;
                        channelsKt__DeprecatedKt$single$1.label = 1;
                        java.lang.Object hasNext = it.hasNext(channelsKt__DeprecatedKt$single$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
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
                        obj2 = channelsKt__DeprecatedKt$single$1.L$1;
                        receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$single$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                throw new java.lang.IllegalArgumentException("ReceiveChannel has more than one element.");
                            }
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                            return obj2;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            receiveChannel2 = receiveChannel3;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th4) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                throw th4;
                            }
                        }
                    }
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$single$1.L$1;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$single$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw new java.util.NoSuchElementException("ReceiveChannel is empty.");
                }
                java.lang.Object next = channelIterator.next();
                channelsKt__DeprecatedKt$single$1.L$0 = receiveChannel2;
                channelsKt__DeprecatedKt$single$1.L$1 = next;
                channelsKt__DeprecatedKt$single$1.label = 2;
                java.lang.Object hasNext2 = channelIterator.hasNext(channelsKt__DeprecatedKt$single$1);
                if (hasNext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                receiveChannel3 = receiveChannel2;
                obj = hasNext2;
                obj2 = next;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                }
            }
        }
        channelsKt__DeprecatedKt$single$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1(continuation);
        obj = channelsKt__DeprecatedKt$single$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$single$1.label;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:33:0x0048, B:34:0x0066, B:38:0x0072), top: B:32:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1 channelsKt__DeprecatedKt$singleOrNull$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object obj2;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1) {
            channelsKt__DeprecatedKt$singleOrNull$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1) continuation;
            if ((channelsKt__DeprecatedKt$singleOrNull$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$singleOrNull$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$singleOrNull$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$singleOrNull$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$singleOrNull$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$singleOrNull$1.L$1 = it;
                        channelsKt__DeprecatedKt$singleOrNull$1.label = 1;
                        java.lang.Object hasNext = it.hasNext(channelsKt__DeprecatedKt$singleOrNull$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
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
                        obj2 = channelsKt__DeprecatedKt$singleOrNull$1.L$1;
                        receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                                return obj2;
                            }
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                            return null;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            receiveChannel2 = receiveChannel3;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th4) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                throw th4;
                            }
                        }
                    }
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$singleOrNull$1.L$1;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object next = channelIterator.next();
                    channelsKt__DeprecatedKt$singleOrNull$1.L$0 = receiveChannel2;
                    channelsKt__DeprecatedKt$singleOrNull$1.L$1 = next;
                    channelsKt__DeprecatedKt$singleOrNull$1.label = 2;
                    java.lang.Object hasNext2 = channelIterator.hasNext(channelsKt__DeprecatedKt$singleOrNull$1);
                    if (hasNext2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    receiveChannel3 = receiveChannel2;
                    obj = hasNext2;
                    obj2 = next;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                    }
                } else {
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return null;
                }
            }
        }
        channelsKt__DeprecatedKt$singleOrNull$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$singleOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$singleOrNull$1.label;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
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
        kotlin.jvm.internal.Intrinsics.checkNotNull(filter$default, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return filter$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x005e, B:14:0x0066, B:16:0x006c, B:18:0x004c, B:23:0x0071), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x005e, B:14:0x0066, B:16:0x006c, B:18:0x004c, B:23:0x0071), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.util.Collection collection, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1 channelsKt__DeprecatedKt$filterNotNullTo$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.util.Collection collection2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1) {
            channelsKt__DeprecatedKt$filterNotNullTo$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1) continuation;
            if ((channelsKt__DeprecatedKt$filterNotNullTo$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$filterNotNullTo$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = channelsKt__DeprecatedKt$filterNotNullTo$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$filterNotNullTo$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        collection2 = collection;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$0 = collection2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.label = 1;
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$1.L$2;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$1.L$1;
                    java.util.Collection collection3 = (java.util.Collection) channelsKt__DeprecatedKt$filterNotNullTo$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                            return collection3;
                        }
                        java.lang.Object next = it.next();
                        if (next != null) {
                            collection3.add(next);
                        }
                        collection2 = collection3;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$0 = collection2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$1);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        collection3 = collection2;
                        obj = hasNext;
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
        java.lang.Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$filterNotNullTo$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:12:0x0036, B:19:0x006f, B:21:0x0077, B:23:0x007d, B:26:0x0090, B:42:0x004e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:12:0x0036, B:19:0x006f, B:21:0x0077, B:23:0x007d, B:26:0x0090, B:42:0x004e), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:13:0x008c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:13:0x008c). Please report as a decompilation issue!!! */
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
                if ((channelsKt__DeprecatedKt$filterNotNullTo$3.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$filterNotNullTo$3.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = channelsKt__DeprecatedKt$filterNotNullTo$3.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$filterNotNullTo$3.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            sendChannel3 = sendChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = sendChannel3;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                            if (hasNext == coroutine_suspended) {
                            }
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
                    } else if (i == 1) {
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.L$2;
                        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$1;
                        sendChannel2 = (kotlinx.coroutines.channels.SendChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        sendChannel = receiveChannel2;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.L$2;
                        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$1;
                        sendChannel2 = (kotlinx.coroutines.channels.SendChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = receiveChannel3;
                        it = channelIterator;
                        receiveChannel = receiveChannel4;
                        sendChannel3 = sendChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = sendChannel3;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
                        receiveChannel4 = sendChannel;
                        if (next != null) {
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = sendChannel2;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = sendChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = channelIterator;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.label = 2;
                            receiveChannel4 = sendChannel;
                            if (sendChannel2.send(next, channelsKt__DeprecatedKt$filterNotNullTo$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        it = channelIterator;
                        receiveChannel = receiveChannel4;
                        sendChannel3 = sendChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$0 = sendChannel3;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.L$2 = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$3.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$filterNotNullTo$3);
                        if (hasNext == coroutine_suspended) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        channelsKt__DeprecatedKt$filterNotNullTo$3 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$filterNotNullTo$3.label;
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
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:12:0x0036, B:19:0x0072, B:21:0x007a, B:24:0x008d, B:40:0x0051), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:12:0x0036, B:19:0x0072, B:21:0x007a, B:24:0x008d, B:40:0x0051), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v0, types: [C extends kotlinx.coroutines.channels.SendChannel<? super E>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:13:0x0039). Please report as a decompilation issue!!! */
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
                if ((channelsKt__DeprecatedKt$toChannel$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$toChannel$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = channelsKt__DeprecatedKt$toChannel$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$toChannel$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            it = receiveChannel.iterator();
                            sendChannel2 = c;
                            channelsKt__DeprecatedKt$toChannel$1.L$0 = sendChannel2;
                            channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                            channelsKt__DeprecatedKt$toChannel$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                            if (hasNext == coroutine_suspended) {
                            }
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
                    } else if (i == 1) {
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.L$2;
                        boolean z = (C) ((kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.L$1);
                        sendChannel = (kotlinx.coroutines.channels.SendChannel) channelsKt__DeprecatedKt$toChannel$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        c = z;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.L$2;
                        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2 = (C) ((kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.L$1);
                        sendChannel = (kotlinx.coroutines.channels.SendChannel) channelsKt__DeprecatedKt$toChannel$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel3 = receiveChannel2;
                        it = channelIterator;
                        receiveChannel = receiveChannel3;
                        sendChannel2 = (C) sendChannel;
                        channelsKt__DeprecatedKt$toChannel$1.L$0 = sendChannel2;
                        channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                        channelsKt__DeprecatedKt$toChannel$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kotlinx.coroutines.channels.SendChannel sendChannel3 = sendChannel2;
                        boolean z2 = (C) receiveChannel;
                        channelIterator = it;
                        obj = hasNext;
                        sendChannel = sendChannel3;
                        c = z2;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            E next = channelIterator.next();
                            channelsKt__DeprecatedKt$toChannel$1.L$0 = sendChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$1 = (java.lang.Object) c;
                            channelsKt__DeprecatedKt$toChannel$1.L$2 = channelIterator;
                            channelsKt__DeprecatedKt$toChannel$1.label = 2;
                            receiveChannel3 = c;
                            if (sendChannel.send(next, channelsKt__DeprecatedKt$toChannel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it = channelIterator;
                            receiveChannel = receiveChannel3;
                            sendChannel2 = (C) sendChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$0 = sendChannel2;
                            channelsKt__DeprecatedKt$toChannel$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$toChannel$1.L$2 = it;
                            channelsKt__DeprecatedKt$toChannel$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toChannel$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } else {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed((kotlinx.coroutines.channels.ReceiveChannel) c, null);
                            return sendChannel;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        channelsKt__DeprecatedKt$toChannel$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$toChannel$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toChannel$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.Continuation<? super C> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1 channelsKt__DeprecatedKt$toCollection$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        C c2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1) {
            channelsKt__DeprecatedKt$toCollection$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1) continuation;
            if ((channelsKt__DeprecatedKt$toCollection$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toCollection$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = channelsKt__DeprecatedKt$toCollection$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$toCollection$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        c2 = c;
                        channelsKt__DeprecatedKt$toCollection$1.L$0 = c2;
                        channelsKt__DeprecatedKt$toCollection$1.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$toCollection$1.L$2 = it;
                        channelsKt__DeprecatedKt$toCollection$1.label = 1;
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$toCollection$1.L$2;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$toCollection$1.L$1;
                    java.util.Collection collection = (java.util.Collection) channelsKt__DeprecatedKt$toCollection$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        ?? r2 = collection;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            r2.add(it.next());
                            c2 = r2;
                            channelsKt__DeprecatedKt$toCollection$1.L$0 = c2;
                            channelsKt__DeprecatedKt$toCollection$1.L$1 = receiveChannel2;
                            channelsKt__DeprecatedKt$toCollection$1.L$2 = it;
                            channelsKt__DeprecatedKt$toCollection$1.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toCollection$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2 = c2;
                            obj = hasNext;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                return r2;
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
        java.lang.Object obj2 = channelsKt__DeprecatedKt$toCollection$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toCollection$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x0079), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x0079), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> receiveChannel, M m, kotlin.coroutines.Continuation<? super M> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2 channelsKt__DeprecatedKt$toMap$2;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        M m2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2) {
            channelsKt__DeprecatedKt$toMap$2 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2) continuation;
            if ((channelsKt__DeprecatedKt$toMap$2.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toMap$2.label -= Integer.MIN_VALUE;
                java.lang.Object obj = channelsKt__DeprecatedKt$toMap$2.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$toMap$2.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        m2 = m;
                        channelsKt__DeprecatedKt$toMap$2.L$0 = m2;
                        channelsKt__DeprecatedKt$toMap$2.L$1 = receiveChannel2;
                        channelsKt__DeprecatedKt$toMap$2.L$2 = it;
                        channelsKt__DeprecatedKt$toMap$2.label = 1;
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$toMap$2.L$2;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$toMap$2.L$1;
                    java.util.Map map = (java.util.Map) channelsKt__DeprecatedKt$toMap$2.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        ?? r2 = map;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            kotlin.Pair pair = (kotlin.Pair) it.next();
                            r2.put(pair.getFirst(), pair.getSecond());
                            m2 = r2;
                            channelsKt__DeprecatedKt$toMap$2.L$0 = m2;
                            channelsKt__DeprecatedKt$toMap$2.L$1 = receiveChannel2;
                            channelsKt__DeprecatedKt$toMap$2.L$2 = it;
                            channelsKt__DeprecatedKt$toMap$2.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$toMap$2);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2 = m2;
                            obj = hasNext;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                return r2;
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
        java.lang.Object obj2 = channelsKt__DeprecatedKt$toMap$2.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$toMap$2.label;
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
                if ((channelsKt__DeprecatedKt$any$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$any$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = channelsKt__DeprecatedKt$any$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$any$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$any$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$any$1.label = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$any$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$any$1.L$0;
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
        java.lang.Object obj2 = channelsKt__DeprecatedKt$any$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$any$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0037, TryCatch #3 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0062, B:14:0x006a, B:30:0x0074), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #3 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0062, B:14:0x006a, B:30:0x0074), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005f -> B:12:0x0062). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1 channelsKt__DeprecatedKt$count$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th;
        kotlin.jvm.internal.Ref.IntRef intRef;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1) {
            channelsKt__DeprecatedKt$count$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1) continuation;
            if ((channelsKt__DeprecatedKt$count$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$count$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = channelsKt__DeprecatedKt$count$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$count$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        intRef = new kotlin.jvm.internal.Ref.IntRef();
                        receiveChannel3 = receiveChannel;
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$count$1.L$0 = intRef;
                        channelsKt__DeprecatedKt$count$1.L$1 = receiveChannel3;
                        channelsKt__DeprecatedKt$count$1.L$2 = it;
                        channelsKt__DeprecatedKt$count$1.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$count$1);
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$count$1.L$2;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$count$1.L$1;
                    intRef = (kotlin.jvm.internal.Ref.IntRef) channelsKt__DeprecatedKt$count$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            it.next();
                            intRef.element++;
                            receiveChannel3 = receiveChannel2;
                            try {
                                channelsKt__DeprecatedKt$count$1.L$0 = intRef;
                                channelsKt__DeprecatedKt$count$1.L$1 = receiveChannel3;
                                channelsKt__DeprecatedKt$count$1.L$2 = it;
                                channelsKt__DeprecatedKt$count$1.label = 1;
                                hasNext = it.hasNext(channelsKt__DeprecatedKt$count$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel2 = receiveChannel3;
                                obj = hasNext;
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                    return kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element);
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                receiveChannel2 = receiveChannel3;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th4) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                    throw th4;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        throw th;
                    }
                }
            }
        }
        channelsKt__DeprecatedKt$count$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1(continuation);
        java.lang.Object obj2 = channelsKt__DeprecatedKt$count$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$count$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #3 {all -> 0x00be, blocks: (B:15:0x00a4, B:17:0x00ac, B:21:0x008f, B:55:0x0063), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:44:0x0059, B:45:0x007b, B:49:0x0087), top: B:43:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a0 -> B:14:0x003e). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.util.Comparator comparator, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        java.util.Comparator comparator2;
        java.lang.Object next;
        java.util.Comparator comparator3;
        kotlinx.coroutines.channels.ChannelIterator channelIterator2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1) {
            channelsKt__DeprecatedKt$maxWith$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1) continuation;
            if ((channelsKt__DeprecatedKt$maxWith$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$maxWith$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$maxWith$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$maxWith$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator;
                        channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$maxWith$1.L$2 = it;
                        channelsKt__DeprecatedKt$maxWith$1.label = 1;
                        java.lang.Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                        comparator2 = comparator;
                    } catch (java.lang.Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i == 1) {
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.L$2;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.L$1;
                    comparator2 = (java.util.Comparator) channelsKt__DeprecatedKt$maxWith$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj2 = channelsKt__DeprecatedKt$maxWith$1.L$3;
                    channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.L$2;
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.L$1;
                    comparator3 = (java.util.Comparator) channelsKt__DeprecatedKt$maxWith$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$12 = channelsKt__DeprecatedKt$maxWith$1;
                        java.lang.Object obj3 = obj2;
                        receiveChannel = receiveChannel3;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$13 = channelsKt__DeprecatedKt$maxWith$12;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            if (comparator3.compare(obj3, next) >= 0) {
                                next = obj3;
                            }
                            channelsKt__DeprecatedKt$maxWith$1 = channelsKt__DeprecatedKt$maxWith$13;
                            channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator3;
                            channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$maxWith$1.L$2 = channelIterator2;
                            channelsKt__DeprecatedKt$maxWith$1.L$3 = next;
                            channelsKt__DeprecatedKt$maxWith$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__DeprecatedKt$maxWith$12 = channelsKt__DeprecatedKt$maxWith$1;
                            obj3 = next;
                            obj = hasNext;
                            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$132 = channelsKt__DeprecatedKt$maxWith$12;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return obj3;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    next = channelIterator.next();
                    comparator3 = comparator2;
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = receiveChannel2;
                    channelIterator2 = channelIterator;
                    receiveChannel = receiveChannel4;
                    channelsKt__DeprecatedKt$maxWith$1.L$0 = comparator3;
                    channelsKt__DeprecatedKt$maxWith$1.L$1 = receiveChannel;
                    channelsKt__DeprecatedKt$maxWith$1.L$2 = channelIterator2;
                    channelsKt__DeprecatedKt$maxWith$1.L$3 = next;
                    channelsKt__DeprecatedKt$maxWith$1.label = 2;
                    hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$maxWith$1);
                    if (hasNext != coroutine_suspended) {
                    }
                } else {
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return null;
                }
            }
        }
        channelsKt__DeprecatedKt$maxWith$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1(continuation);
        obj = channelsKt__DeprecatedKt$maxWith$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$maxWith$1.label;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #3 {all -> 0x00be, blocks: (B:15:0x00a4, B:17:0x00ac, B:21:0x008f, B:55:0x0063), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:44:0x0059, B:45:0x007b, B:49:0x0087), top: B:43:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a0 -> B:14:0x003e). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.util.Comparator comparator, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        java.util.Comparator comparator2;
        java.lang.Object next;
        java.util.Comparator comparator3;
        kotlinx.coroutines.channels.ChannelIterator channelIterator2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1) {
            channelsKt__DeprecatedKt$minWith$1 = (kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1) continuation;
            if ((channelsKt__DeprecatedKt$minWith$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$minWith$1.label -= Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$minWith$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__DeprecatedKt$minWith$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$minWith$1.L$0 = comparator;
                        channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                        channelsKt__DeprecatedKt$minWith$1.L$2 = it;
                        channelsKt__DeprecatedKt$minWith$1.label = 1;
                        java.lang.Object hasNext2 = it.hasNext(channelsKt__DeprecatedKt$minWith$1);
                        if (hasNext2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = hasNext2;
                        comparator2 = comparator;
                    } catch (java.lang.Throwable th) {
                        receiveChannel2 = receiveChannel;
                        th = th;
                        throw th;
                    }
                } else if (i == 1) {
                    channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$minWith$1.L$2;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.L$1;
                    comparator2 = (java.util.Comparator) channelsKt__DeprecatedKt$minWith$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj2 = channelsKt__DeprecatedKt$minWith$1.L$3;
                    channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__DeprecatedKt$minWith$1.L$2;
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.L$1;
                    comparator3 = (java.util.Comparator) channelsKt__DeprecatedKt$minWith$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$12 = channelsKt__DeprecatedKt$minWith$1;
                        java.lang.Object obj3 = obj2;
                        receiveChannel = receiveChannel3;
                        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$13 = channelsKt__DeprecatedKt$minWith$12;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            next = channelIterator2.next();
                            if (comparator3.compare(obj3, next) <= 0) {
                                next = obj3;
                            }
                            channelsKt__DeprecatedKt$minWith$1 = channelsKt__DeprecatedKt$minWith$13;
                            channelsKt__DeprecatedKt$minWith$1.L$0 = comparator3;
                            channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                            channelsKt__DeprecatedKt$minWith$1.L$2 = channelIterator2;
                            channelsKt__DeprecatedKt$minWith$1.L$3 = next;
                            channelsKt__DeprecatedKt$minWith$1.label = 2;
                            hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$minWith$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__DeprecatedKt$minWith$12 = channelsKt__DeprecatedKt$minWith$1;
                            obj3 = next;
                            obj = hasNext;
                            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$132 = channelsKt__DeprecatedKt$minWith$12;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return obj3;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        receiveChannel2 = receiveChannel3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    next = channelIterator.next();
                    comparator3 = comparator2;
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = receiveChannel2;
                    channelIterator2 = channelIterator;
                    receiveChannel = receiveChannel4;
                    channelsKt__DeprecatedKt$minWith$1.L$0 = comparator3;
                    channelsKt__DeprecatedKt$minWith$1.L$1 = receiveChannel;
                    channelsKt__DeprecatedKt$minWith$1.L$2 = channelIterator2;
                    channelsKt__DeprecatedKt$minWith$1.L$3 = next;
                    channelsKt__DeprecatedKt$minWith$1.label = 2;
                    hasNext = channelIterator2.hasNext(channelsKt__DeprecatedKt$minWith$1);
                    if (hasNext != coroutine_suspended) {
                    }
                } else {
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return null;
                }
            }
        }
        channelsKt__DeprecatedKt$minWith$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1(continuation);
        obj = channelsKt__DeprecatedKt$minWith$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$minWith$1.label;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
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
                if ((channelsKt__DeprecatedKt$none$1.label & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$none$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = channelsKt__DeprecatedKt$none$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelsKt__DeprecatedKt$none$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$none$1.L$0 = receiveChannel;
                        channelsKt__DeprecatedKt$none$1.label = 1;
                        obj = it.hasNext(channelsKt__DeprecatedKt$none$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__DeprecatedKt$none$1.L$0;
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
        java.lang.Object obj2 = channelsKt__DeprecatedKt$none$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__DeprecatedKt$none$1.label;
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
                kotlin.Unit consumes$lambda$24$ChannelsKt__DeprecatedKt;
                consumes$lambda$24$ChannelsKt__DeprecatedKt = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.consumes$lambda$24$ChannelsKt__DeprecatedKt(kotlinx.coroutines.channels.ReceiveChannel.this, (java.lang.Throwable) obj);
                return consumes$lambda$24$ChannelsKt__DeprecatedKt;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit consumes$lambda$24$ChannelsKt__DeprecatedKt(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.lang.Throwable th) {
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
        try {
            kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannel = openSubscription;
            kotlinx.coroutines.channels.ChannelIterator<E> it = openSubscription.iterator();
            while (true) {
                kotlin.jvm.internal.InlineMarker.mark(3);
                kotlin.jvm.internal.InlineMarker.mark(0);
                java.lang.Object hasNext = it.hasNext(null);
                kotlin.jvm.internal.InlineMarker.mark(1);
                if (!((java.lang.Boolean) hasNext).booleanValue()) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) openSubscription, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    return kotlin.Unit.INSTANCE;
                }
                function1.invoke(it.next());
            }
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) openSubscription, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
