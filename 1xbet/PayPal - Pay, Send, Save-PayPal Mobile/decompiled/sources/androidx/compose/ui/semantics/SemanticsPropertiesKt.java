package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000è\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aD\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u001e\b\b\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bH\u0080\b¢\u0006\u0004\b\u0006\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u0011\u0010\u0012\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u0011\u0010\u0013\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000e\u001a\u0011\u0010\u0014\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000e\u001a\u0019\u0010\u0016\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001c\u001a\u00020\f*\u00020\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u000e\u001a9\u0010$\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u001a\u0010#\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\"\u0018\u00010\u0018¢\u0006\u0004\b$\u0010%\u001a-\u0010'\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\b'\u0010(\u001a-\u0010)\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\b)\u0010(\u001aC\u0010,\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032$\u0010#\u001a \u0012\t\u0012\u00070*¢\u0006\u0002\b+\u0012\t\u0012\u00070*¢\u0006\u0002\b+\u0012\u0004\u0012\u00020\"\u0018\u00010\b¢\u0006\u0004\b,\u0010-\u001a:\u00100\u001a\u00020\f*\u00020\u000b2'\u0010#\u001a#\b\u0001\u0012\t\u0012\u00070.¢\u0006\u0002\b+\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0/\u0012\u0006\u0012\u0004\u0018\u00010\u00190\b¢\u0006\u0004\b0\u00101\u001a1\u00102\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\"0\u0018¢\u0006\u0004\b2\u0010%\u001a5\u00104\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\"\u0018\u00010\u0018H\u0007¢\u0006\u0004\b4\u0010%\u001a3\u00106\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\"\u0018\u00010\u0018¢\u0006\u0004\b6\u0010%\u001a3\u00107\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\"\u0018\u00010\u0018¢\u0006\u0004\b7\u0010%\u001a3\u00108\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\"\u0018\u00010\u0018¢\u0006\u0004\b8\u0010%\u001a3\u00109\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\"\u0018\u00010\u0018¢\u0006\u0004\b9\u0010%\u001a3\u0010:\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010\u0018¢\u0006\u0004\b:\u0010%\u001a-\u0010;\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\b;\u0010(\u001a3\u0010<\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\"\u0018\u00010\u0018¢\u0006\u0004\b<\u0010%\u001a5\u0010A\u001a\u00020\f*\u00020\u000b2\u0006\u0010>\u001a\u00020=2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\b?\u0010@\u001a/\u0010B\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&H\u0007¢\u0006\u0004\bB\u0010(\u001aN\u0010D\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032/\u0010#\u001a+\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b+\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b+\u0012\t\u0012\u00070\"¢\u0006\u0002\b+\u0012\u0004\u0012\u00020\"\u0018\u00010C¢\u0006\u0004\bD\u0010E\u001a-\u0010F\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bF\u0010(\u001a-\u0010G\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bG\u0010(\u001a-\u0010H\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bH\u0010(\u001a-\u0010I\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bI\u0010(\u001a-\u0010J\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bJ\u0010(\u001a-\u0010K\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bK\u0010(\u001a-\u0010L\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bL\u0010(\u001a-\u0010M\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bM\u0010(\u001a-\u0010N\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bN\u0010(\u001a-\u0010O\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bO\u0010(\u001a-\u0010P\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010&¢\u0006\u0004\bP\u0010(\u001a-\u0010Q\u001a\u00020\f*\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0&¢\u0006\u0004\bQ\u0010(\"(\u0010V\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010R\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u0017\")\u0010Z\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010W\u001a\u00020\u00038G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\bX\u0010T\"\u0004\bY\u0010\u0017\")\u0010`\u001a\u00020[*\u00020\u000b2\u0006\u0010W\u001a\u00020[8G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_\")\u0010c\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010W\u001a\u00020\u00038G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\ba\u0010T\"\u0004\bb\u0010\u0017\")\u0010i\u001a\u00020d*\u00020\u000b2\u0006\u0010W\u001a\u00020d8G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\be\u0010f\"\u0004\bg\u0010h\")\u0010n\u001a\u00020\"*\u00020\u000b2\u0006\u0010W\u001a\u00020\"8G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m\"/\u0010o\u001a\u00020\"*\u00020\u000b2\u0006\u0010W\u001a\u00020\"8G@GX\u0087\u008e\u0002¢\u0006\u0012\u0012\u0004\bq\u0010\u000e\u001a\u0004\bo\u0010k\"\u0004\bp\u0010m\")\u0010r\u001a\u00020\"*\u00020\u000b2\u0006\u0010W\u001a\u00020\"8G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\br\u0010k\"\u0004\bs\u0010m\")\u0010t\u001a\u00020\"*\u00020\u000b2\u0006\u0010W\u001a\u00020\"8G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\bt\u0010k\"\u0004\bu\u0010m\")\u0010{\u001a\u00020v*\u00020\u000b2\u0006\u0010W\u001a\u00020v8G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010z\"+\u0010\u0081\u0001\u001a\u00020|*\u00020\u000b2\u0006\u0010W\u001a\u00020|8G@GX\u0086\u008e\u0002¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001\".\u0010\u0086\u0001\u001a\u000205*\u00020\u000b2\u0006\u0010W\u001a\u0002058G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001\".\u0010\u008b\u0001\u001a\u00020**\u00020\u000b2\u0006\u0010W\u001a\u00020*8G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001\"0\u0010\u0091\u0001\u001a\u00030\u008c\u0001*\u00020\u000b2\u0007\u0010W\u001a\u00030\u008c\u00018G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001\"0\u0010\u0094\u0001\u001a\u00030\u008c\u0001*\u00020\u000b2\u0007\u0010W\u001a\u00030\u008c\u00018G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u008e\u0001\"\u0006\b\u0093\u0001\u0010\u0090\u0001\".\u0010\u0098\u0001\u001a\u00030\u0095\u0001*\u00020\u000b2\u0007\u0010W\u001a\u00030\u0095\u00018G@GX\u0086\u008e\u0002¢\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010f\"\u0005\b\u0097\u0001\u0010h\",\u0010\u009b\u0001\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010W\u001a\u00020\u00038G@GX\u0086\u008e\u0002¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010T\"\u0005\b\u009a\u0001\u0010\u0017\",\u0010\u009f\u0001\u001a\u000203*\u00020\u000b2\u0006\u0010R\u001a\u0002038G@GX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0005\b8\u0010\u009e\u0001\"-\u0010¡\u0001\u001a\u000203*\u00020\u000b2\u0006\u0010W\u001a\u0002038G@GX\u0086\u008e\u0002¢\u0006\u000f\u001a\u0006\b \u0001\u0010\u009d\u0001\"\u0005\b9\u0010\u009e\u0001\",\u0010¢\u0001\u001a\u00020\"*\u00020\u000b2\u0006\u0010W\u001a\u00020\"8G@GX\u0086\u008e\u0002¢\u0006\u000e\u001a\u0005\b¢\u0001\u0010k\"\u0005\b£\u0001\u0010m\".\u0010¦\u0001\u001a\u000203*\u00020\u000b2\u0006\u0010W\u001a\u0002038G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010\u009d\u0001\"\u0006\b¥\u0001\u0010\u009e\u0001\".\u0010©\u0001\u001a\u000203*\u00020\u000b2\u0006\u0010W\u001a\u0002038G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b§\u0001\u0010\u009d\u0001\"\u0006\b¨\u0001\u0010\u009e\u0001\"0\u0010¯\u0001\u001a\u00030ª\u0001*\u00020\u000b2\u0007\u0010W\u001a\u00030ª\u00018G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001\"3\u0010³\u0001\u001a\u00020=*\u00020\u000b2\u0006\u0010W\u001a\u00020=8G@GX\u0087\u008e\u0002¢\u0006\u0015\u0012\u0005\b²\u0001\u0010\u000e\u001a\u0005\b°\u0001\u0010f\"\u0005\b±\u0001\u0010h\",\u0010¶\u0001\u001a\u00020\"*\u00020\u000b2\u0006\u0010W\u001a\u00020\"8G@GX\u0086\u008e\u0002¢\u0006\u000e\u001a\u0005\b´\u0001\u0010k\"\u0005\bµ\u0001\u0010m\"0\u0010¼\u0001\u001a\u00030·\u0001*\u00020\u000b2\u0007\u0010W\u001a\u00030·\u00018G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001\"0\u0010Â\u0001\u001a\u00030½\u0001*\u00020\u000b2\u0007\u0010W\u001a\u00030½\u00018G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001\"0\u0010È\u0001\u001a\u00030Ã\u0001*\u00020\u000b2\u0007\u0010W\u001a\u00030Ã\u00018G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001\",\u0010É\u0001\u001a\u00020\"*\u00020\u000b2\u0006\u0010W\u001a\u00020\"8G@GX\u0086\u008e\u0002¢\u0006\u000e\u001a\u0005\bÉ\u0001\u0010k\"\u0005\bÊ\u0001\u0010m\",\u0010Í\u0001\u001a\u00020\u001a*\u00020\u000b2\u0006\u0010W\u001a\u00020\u001a8G@GX\u0086\u008e\u0002¢\u0006\u000e\u001a\u0005\bË\u0001\u0010f\"\u0005\bÌ\u0001\u0010h\"0\u0010Ó\u0001\u001a\u00030Î\u0001*\u00020\u000b2\u0007\u0010W\u001a\u00030Î\u00018G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001\">\u0010Ú\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010Ô\u0001*\u00020\u000b2\u000e\u0010W\u001a\n\u0012\u0005\u0012\u00030Õ\u00010Ô\u00018G@GX\u0086\u008e\u0002¢\u0006\u0010\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001"}, d2 = {"T", "getHighSpeedVideoSizes", "()Ljava/lang/Object;", "", "name", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "AccessibilityKey", "(Ljava/lang/String;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function2;", "mergePolicy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "heading", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "disabled", "invisibleToUser", "hideFromAccessibility", "popup", androidx.view.compose.DialogNavigator.NAME, "password", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "error", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "indexForKey", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function1;)V", "selectableGroup", "label", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "action", "getTextLayoutResult", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onClick", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onLongClick", "", "Lkotlin/ParameterName;", "scrollBy", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "scrollByOffset", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lkotlin/jvm/functions/Function2;)V", "scrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "onAutofillText", "Landroidx/compose/ui/autofill/FillableData;", "onFillData", "setProgress", "setText", "setTextSubstitution", "showTextSubstitution", "clearTextSubstitution", "insertTextAtCursor", "Landroidx/compose/ui/text/input/ImeAction;", "imeActionType", "onImeAction-9UiTYpY", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onImeAction", "performImeAction", "Lkotlin/Function3;", "setSelection", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "copyText", "cutText", "pasteText", "expand", "collapse", "dismiss", "requestFocus", "pageUp", "pageDown", "pageLeft", "pageRight", "getScrollViewportLength", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getContentDescription", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", "setContentDescription", "contentDescription", "<set-?>", "getStateDescription", "setStateDescription", "stateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "setProgressBarRangeInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ProgressBarRangeInfo;)V", "progressBarRangeInfo", "getPaneTitle", "setPaneTitle", "paneTitle", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", "setLiveRegion-hR3wRGc", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;I)V", "liveRegion", "getFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", "setFocused", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V", "focused", "isContainer", "setContainer", "isContainer$annotations", "isTraversalGroup", "setTraversalGroup", "isSensitiveData", "setSensitiveData", "Landroidx/compose/ui/autofill/ContentType;", "getContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", "setContentType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentType;)V", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Landroidx/compose/ui/autofill/ContentDataType;", "getContentDataType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", "setContentDataType", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentDataType;)V", "contentDataType", "getFillableData", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", "setFillableData", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/FillableData;)V", "fillableData", "getTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", "setTraversalIndex", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;F)V", "traversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "getRole", "setRole-kuIjeqM", "role", "getTestTag", "setTestTag", "testTag", "getText", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V", "text", "getTextSubstitution", "textSubstitution", "isShowingTextSubstitution", "setShowingTextSubstitution", "getInputText", "setInputText", "inputText", "getEditableText", "setEditableText", "editableText", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", "setTextSelectionRange-FDrldGo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V", "textSelectionRange", "getImeAction", "setImeAction-4L7nppU", "getImeAction$annotations", "imeAction", "getSelected", "setSelected", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", "setCollectionInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionInfo;)V", "collectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", "setCollectionItemInfo", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/semantics/CollectionItemInfo;)V", "collectionItemInfo", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", "setToggleableState", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/state/ToggleableState;)V", "toggleableState", "isEditable", "setEditable", "getMaxTextLength", "setMaxTextLength", "maxTextLength", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/graphics/Shape;)V", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "getCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", "setCustomActions", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/util/List;)V", "customActions"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertiesKt {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(androidx.compose.ui.semantics.SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    @kotlin.Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static /* synthetic */ void getImeAction$annotations(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @kotlin.Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @kotlin.ReplaceWith(expression = "isTraversalGroup", imports = {}))
    public static /* synthetic */ void isContainer$annotations(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getHighSpeedVideoSizes() {
        throw new java.lang.UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final <T> androidx.compose.ui.semantics.SemanticsPropertyKey<T> AccessibilityKey(java.lang.String str) {
        return new androidx.compose.ui.semantics.SemanticsPropertyKey<>(str, true);
    }

    public static final <T> androidx.compose.ui.semantics.SemanticsPropertyKey<T> AccessibilityKey(java.lang.String str, kotlin.jvm.functions.Function2<? super T, ? super T, ? extends T> function2) {
        return new androidx.compose.ui.semantics.SemanticsPropertyKey<>(str, true, function2, null, 8, null);
    }

    public static final java.lang.String getContentDescription(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (java.lang.String) getHighSpeedVideoSizes();
    }

    public static final void setContentDescription(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDescription(), kotlin.collections.CollectionsKt.listOf(str));
    }

    public static final java.lang.String getStateDescription(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[0]);
    }

    public static final void setStateDescription(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[0], str);
    }

    public static final androidx.compose.ui.semantics.ProgressBarRangeInfo getProgressBarRangeInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[1]);
    }

    public static final void setProgressBarRangeInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.ProgressBarRangeInfo progressBarRangeInfo) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[1], progressBarRangeInfo);
    }

    public static final void heading(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHeading(), kotlin.Unit.INSTANCE);
    }

    public static final java.lang.String getPaneTitle(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[2]);
    }

    public static final void setPaneTitle(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[2], str);
    }

    public static final void disabled(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getDisabled(), kotlin.Unit.INSTANCE);
    }

    public static final int getLiveRegion(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[3]).getCamera2StreamConfigurationMap();
    }

    /* renamed from: setLiveRegion-hR3wRGc, reason: not valid java name */
    public static final void m7814setLiveRegionhR3wRGc(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLiveRegion().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[3], androidx.compose.ui.semantics.LiveRegionMode.m7784boximpl(i));
    }

    public static final boolean getFocused(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[4]).booleanValue();
    }

    public static final void setFocused(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[4], java.lang.Boolean.valueOf(z));
    }

    public static final boolean isContainer(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsContainer().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[5]).booleanValue();
    }

    public static final void setContainer(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsContainer().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[5], java.lang.Boolean.valueOf(z));
    }

    public static final boolean isTraversalGroup(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[6]).booleanValue();
    }

    public static final void setTraversalGroup(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[6], java.lang.Boolean.valueOf(z));
    }

    public static final boolean isSensitiveData(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsSensitiveData().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[7]).booleanValue();
    }

    public static final void setSensitiveData(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsSensitiveData().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[7], java.lang.Boolean.valueOf(z));
    }

    @kotlin.Deprecated(message = "Use `hideFromAccessibility()` instead.", replaceWith = @kotlin.ReplaceWith(expression = "hideFromAccessibility()", imports = {}))
    public static final void invisibleToUser(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInvisibleToUser(), kotlin.Unit.INSTANCE);
    }

    public static final void hideFromAccessibility(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHideFromAccessibility(), kotlin.Unit.INSTANCE);
    }

    public static final androidx.compose.ui.autofill.ContentType getContentType(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentType().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[8]);
    }

    public static final void setContentType(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType contentType) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentType().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[8], contentType);
    }

    public static final androidx.compose.ui.autofill.ContentDataType getContentDataType(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDataType().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[9]);
    }

    public static final void setContentDataType(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentDataType contentDataType) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDataType().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[9], contentDataType);
    }

    public static final androidx.compose.ui.autofill.FillableData getFillableData(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFillableData().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[10]);
    }

    public static final void setFillableData(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.autofill.FillableData fillableData) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFillableData().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[10], fillableData);
    }

    public static final float getTraversalIndex(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[11]).floatValue();
    }

    public static final void setTraversalIndex(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, float f) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[11], java.lang.Float.valueOf(f));
    }

    public static final androidx.compose.ui.semantics.ScrollAxisRange getHorizontalScrollAxisRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[12]);
    }

    public static final void setHorizontalScrollAxisRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[12], scrollAxisRange);
    }

    public static final androidx.compose.ui.semantics.ScrollAxisRange getVerticalScrollAxisRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[13]);
    }

    public static final void setVerticalScrollAxisRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[13], scrollAxisRange);
    }

    public static final void popup(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsPopup(), kotlin.Unit.INSTANCE);
    }

    public static final void dialog(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsDialog(), kotlin.Unit.INSTANCE);
    }

    public static final int getRole(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[14]).getGetHighSpeedVideoSizes();
    }

    /* renamed from: setRole-kuIjeqM, reason: not valid java name */
    public static final void m7815setRolekuIjeqM(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[14], androidx.compose.ui.semantics.Role.m7792boximpl(i));
    }

    public static final java.lang.String getTestTag(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[15]);
    }

    public static final void setTestTag(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[15], str);
    }

    public static final androidx.compose.ui.text.AnnotatedString getText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (androidx.compose.ui.text.AnnotatedString) getHighSpeedVideoSizes();
    }

    public static final void setText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.text.AnnotatedString annotatedString) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getText(), kotlin.collections.CollectionsKt.listOf(annotatedString));
    }

    public static final androidx.compose.ui.text.AnnotatedString getTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSubstitution().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[16]);
    }

    public static final void setTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.text.AnnotatedString annotatedString) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSubstitution().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[16], annotatedString);
    }

    public static final boolean isShowingTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[17]).booleanValue();
    }

    public static final void setShowingTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[17], java.lang.Boolean.valueOf(z));
    }

    public static final androidx.compose.ui.text.AnnotatedString getInputText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInputText().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[18]);
    }

    public static final void setInputText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.text.AnnotatedString annotatedString) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInputText().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[18], annotatedString);
    }

    public static final androidx.compose.ui.text.AnnotatedString getEditableText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[19]);
    }

    public static final void setEditableText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.text.AnnotatedString annotatedString) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[19], annotatedString);
    }

    public static final long getTextSelectionRange(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[20]).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: setTextSelectionRange-FDrldGo, reason: not valid java name */
    public static final void m7816setTextSelectionRangeFDrldGo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, long j) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[20], androidx.compose.ui.text.TextRange.m8027boximpl(j));
    }

    @kotlin.Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    public static final int getImeAction(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[21]).getGetHighSpeedVideoFpsRanges();
    }

    @kotlin.Deprecated(message = "Pass the ImeAction to onImeAction instead.")
    /* renamed from: setImeAction-4L7nppU, reason: not valid java name */
    public static final void m7813setImeAction4L7nppU(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getImeAction().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[21], androidx.compose.ui.text.input.ImeAction.m8198boximpl(i));
    }

    public static final boolean getSelected(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[22]).booleanValue();
    }

    public static final void setSelected(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[22], java.lang.Boolean.valueOf(z));
    }

    public static final androidx.compose.ui.semantics.CollectionInfo getCollectionInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[23]);
    }

    public static final void setCollectionInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.CollectionInfo collectionInfo) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[23], collectionInfo);
    }

    public static final androidx.compose.ui.semantics.CollectionItemInfo getCollectionItemInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[24]);
    }

    public static final void setCollectionItemInfo(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.semantics.CollectionItemInfo collectionItemInfo) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[24], collectionItemInfo);
    }

    public static final androidx.compose.ui.state.ToggleableState getToggleableState(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[25]);
    }

    public static final void setToggleableState(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.state.ToggleableState toggleableState) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[25], toggleableState);
    }

    public static final boolean isEditable(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsEditable().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[26]).booleanValue();
    }

    public static final void setEditable(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsEditable().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[26], java.lang.Boolean.valueOf(z));
    }

    public static final void password(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPassword(), kotlin.Unit.INSTANCE);
    }

    public static final void error(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getError(), str);
    }

    public static final void indexForKey(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Integer> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIndexForKey(), function1);
    }

    public static final int getMaxTextLength(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getMaxTextLength().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[27]).intValue();
    }

    public static final void setMaxTextLength(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getMaxTextLength().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[27], java.lang.Integer.valueOf(i));
    }

    public static final androidx.compose.ui.graphics.Shape getShape(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getShape().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[28]);
    }

    public static final void setShape(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, androidx.compose.ui.graphics.Shape shape) {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getShape().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[28], shape);
    }

    public static final void selectableGroup(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelectableGroup(), kotlin.Unit.INSTANCE);
    }

    public static final java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> getCustomActions(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[29]);
    }

    public static final void setCustomActions(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.util.List<androidx.compose.ui.semantics.CustomAccessibilityAction> list) {
        androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, getHighSpeedVideoFpsRangesFor[29], list);
    }

    public static /* synthetic */ void getTextLayoutResult$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, function1);
    }

    public static final void getTextLayoutResult(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super java.util.List<androidx.compose.ui.text.TextLayoutResult>, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetTextLayoutResult(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void onClick$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onClick(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnClick(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void onLongClick$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onLongClick(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnLongClick(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void scrollBy$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, function2);
    }

    public static final void scrollBy(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> function2) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy(), new androidx.compose.ui.semantics.AccessibilityAction(str, function2));
    }

    public static final void scrollByOffset(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, ? extends java.lang.Object> function2) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollByOffset(), function2);
    }

    public static /* synthetic */ void scrollToIndex$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, function1);
    }

    public static final void scrollToIndex(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollToIndex(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void onAutofillText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onAutofillText(semanticsPropertyReceiver, str, function1);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use onFillData instead", replaceWith = @kotlin.ReplaceWith(expression = "onFillData", imports = {}))
    public static final void onAutofillText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnAutofillText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void onFillData$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        onFillData(semanticsPropertyReceiver, str, function1);
    }

    public static final void onFillData(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.autofill.FillableData, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnFillData(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setProgress$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, function1);
    }

    public static final void setProgress(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetProgress(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, function1);
    }

    public static final void setText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setTextSubstitution$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setTextSubstitution(semanticsPropertyReceiver, str, function1);
    }

    public static final void setTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetTextSubstitution(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void showTextSubstitution$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        showTextSubstitution(semanticsPropertyReceiver, str, function1);
    }

    public static final void showTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Boolean, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getShowTextSubstitution(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void clearTextSubstitution$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        clearTextSubstitution(semanticsPropertyReceiver, str, function0);
    }

    public static final void clearTextSubstitution(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getClearTextSubstitution(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void insertTextAtCursor$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        insertTextAtCursor(semanticsPropertyReceiver, str, function1);
    }

    public static final void insertTextAtCursor(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, java.lang.Boolean> function1) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getInsertTextAtCursor(), new androidx.compose.ui.semantics.AccessibilityAction(str, function1));
    }

    /* renamed from: onImeAction-9UiTYpY$default, reason: not valid java name */
    public static /* synthetic */ void m7812onImeAction9UiTYpY$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        m7811onImeAction9UiTYpY(semanticsPropertyReceiver, i, str, function0);
    }

    /* renamed from: onImeAction-9UiTYpY, reason: not valid java name */
    public static final void m7811onImeAction9UiTYpY(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, int i, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getImeAction(), androidx.compose.ui.text.input.ImeAction.m8198boximpl(i));
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnImeAction(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void performImeAction$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        performImeAction(semanticsPropertyReceiver, str, function0);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use `SemanticsPropertyReceiver.onImeAction` instead.", replaceWith = @kotlin.ReplaceWith(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    public static final void performImeAction(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnImeAction(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void setSelection$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function3 function3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, function3);
    }

    public static final void setSelection(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Boolean, java.lang.Boolean> function3) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getSetSelection(), new androidx.compose.ui.semantics.AccessibilityAction(str, function3));
    }

    public static /* synthetic */ void copyText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, function0);
    }

    public static final void copyText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCopyText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void cutText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, function0);
    }

    public static final void cutText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCutText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pasteText$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, function0);
    }

    public static final void pasteText(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPasteText(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void expand$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, function0);
    }

    public static final void expand(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getExpand(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void collapse$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, function0);
    }

    public static final void collapse(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCollapse(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void dismiss$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, function0);
    }

    public static final void dismiss(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getDismiss(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void requestFocus$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, function0);
    }

    public static final void requestFocus(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getRequestFocus(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageUp$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageUp(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageUp(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageDown$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageDown(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageDown(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageLeft$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageLeft(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageLeft(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageRight$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageRight(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getPageRight(), new androidx.compose.ui.semantics.AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void getScrollViewportLength$default(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        getScrollViewportLength(semanticsPropertyReceiver, str, function0);
    }

    public static final void getScrollViewportLength(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, java.lang.String str, final kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        semanticsPropertyReceiver.set(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getGetScrollViewportLength(), new androidx.compose.ui.semantics.AccessibilityAction(str, new kotlin.jvm.functions.Function1<java.util.List<java.lang.Float>, java.lang.Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(java.util.List<java.lang.Float> list) {
                boolean z;
                java.lang.Float invoke = function0.invoke();
                if (invoke == null) {
                    z = false;
                } else {
                    list.add(invoke);
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }));
    }

    static {
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getStateDescription();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getProgressBarRangeInfo();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getPaneTitle();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLiveRegion();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFocused();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsContainer();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsTraversalGroup();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsSensitiveData();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentType();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDataType();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFillableData();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTraversalIndex();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTestTag();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSubstitution();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsShowingTextSubstitution();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInputText();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getEditableText();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getTextSelectionRange();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getImeAction();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionInfo();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getCollectionItemInfo();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getIsEditable();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getMaxTextLength();
        androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getShape();
        androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getCustomActions();
    }
}
