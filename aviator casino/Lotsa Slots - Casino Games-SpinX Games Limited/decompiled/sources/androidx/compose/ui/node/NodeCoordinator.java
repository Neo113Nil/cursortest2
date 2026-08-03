package androidx.compose.ui.node;

/* compiled from: NodeCoordinator.kt */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b#\b \u0018\u0000 \u0092\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0092\u0002\u0093\u0002B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u0089\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020\u000b2\u0007\u0010\u008c\u0001\u001a\u00020#H\u0002J)\u0010\u0089\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u00002\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001d\u0010\u0091\u0001\u001a\u00020T2\u0006\u0010S\u001a\u00020TH\u0004ø\u0001\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J'\u0010\u0094\u0001\u001a\u00020\u00172\b\u0010\u0095\u0001\u001a\u00030\u008d\u00012\u0006\u0010S\u001a\u00020TH\u0004ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0010\u0010\u0098\u0001\u001a\u00020\u001d2\u0007\u0010\u0099\u0001\u001a\u00020\u001cJ\u001c\u0010\u009a\u0001\u001a\u00020\u001d2\u0007\u0010\u0099\u0001\u001a\u00020\u001c2\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0004J\u0012\u0010\u009d\u0001\u001a\u00020\u001d2\u0007\u0010\u0099\u0001\u001a\u00020\u001cH\u0002J\t\u0010\u009e\u0001\u001a\u00020\u001dH&J\u0018\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010 \u0001\u001a\u00020\u0000H\u0000¢\u0006\u0003\b¡\u0001J\u001f\u0010¢\u0001\u001a\u00030\u008d\u00012\u0007\u0010e\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010\u0093\u0001J\u001b\u0010¤\u0001\u001a\u00020\u001d2\u0007\u0010¥\u0001\u001a\u00020\u000b2\u0007\u0010\u008c\u0001\u001a\u00020#H\u0002J#\u0010¦\u0001\u001a\u00020#2\f\u0010§\u0001\u001a\u0007\u0012\u0002\b\u00030¨\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J#\u0010«\u0001\u001a\u0004\u0018\u00010z2\f\u0010§\u0001\u001a\u0007\u0012\u0002\b\u00030¨\u0001ø\u0001\u0000¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0014\u0010®\u0001\u001a\u0004\u0018\u00010z2\u0007\u0010¯\u0001\u001a\u00020#H\u0002JC\u0010°\u0001\u001a\u00020\u001d2\b\u0010±\u0001\u001a\u00030²\u00012\b\u0010\u0095\u0001\u001a\u00030\u008d\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u00020#2\u0007\u0010¶\u0001\u001a\u00020#ø\u0001\u0000¢\u0006\u0006\b·\u0001\u0010¸\u0001JE\u0010¹\u0001\u001a\u00020\u001d2\b\u0010±\u0001\u001a\u00030²\u00012\b\u0010\u0095\u0001\u001a\u00030\u008d\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u00020#2\u0007\u0010¶\u0001\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0006\bº\u0001\u0010¸\u0001J\t\u0010»\u0001\u001a\u00020\u001dH\u0016J\u001f\u0010¼\u0001\u001a\u00020#2\b\u0010\u0095\u0001\u001a\u00030\u008d\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0007\u0010¿\u0001\u001a\u00020#J\u001c\u0010À\u0001\u001a\u00030Á\u00012\u0007\u0010Â\u0001\u001a\u00020\u00032\u0007\u0010\u008c\u0001\u001a\u00020#H\u0016J)\u0010Ã\u0001\u001a\u00030\u008d\u00012\u0007\u0010Â\u0001\u001a\u00020\u00032\b\u0010Ä\u0001\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J \u0010Ç\u0001\u001a\u00030\u008d\u00012\b\u0010È\u0001\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÉ\u0001\u0010\u0093\u0001J \u0010Ê\u0001\u001a\u00030\u008d\u00012\b\u0010È\u0001\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bË\u0001\u0010\u0093\u0001J \u0010Ì\u0001\u001a\u00030\u008d\u00012\b\u0010\u0095\u0001\u001a\u00030\u008d\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\bÍ\u0001\u0010\u0093\u0001J\u000f\u0010Î\u0001\u001a\u00020\u001dH\u0000¢\u0006\u0003\bÏ\u0001J\t\u0010Ð\u0001\u001a\u00020\u001dH\u0016J\u0007\u0010Ñ\u0001\u001a\u00020\u001dJ\u001b\u0010Ò\u0001\u001a\u00020\u001d2\u0007\u0010Ó\u0001\u001a\u00020Y2\u0007\u0010Ô\u0001\u001a\u00020YH\u0014J\u0007\u0010Õ\u0001\u001a\u00020\u001dJ\u0007\u0010Ö\u0001\u001a\u00020\u001dJ\u0007\u0010×\u0001\u001a\u00020\u001dJ\u0012\u0010Ø\u0001\u001a\u00020\u001d2\u0007\u0010\u0099\u0001\u001a\u00020\u001cH\u0016J2\u0010Ù\u0001\u001a\u00030Ú\u00012\u0007\u0010Û\u0001\u001a\u0002002\u0010\b\u0004\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030Ú\u00010'H\u0084\bø\u0001\u0000¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001JA\u0010ß\u0001\u001a\u00020\u001d2\u0006\u0010e\u001a\u00020d2\u0007\u0010\u0085\u0001\u001a\u00020\u00172\u0019\u00109\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0002\b8H\u0014ø\u0001\u0000¢\u0006\u0006\bà\u0001\u0010á\u0001JA\u0010â\u0001\u001a\u00020\u001d2\u0006\u0010e\u001a\u00020d2\u0007\u0010\u0085\u0001\u001a\u00020\u00172\u0019\u00109\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0002\b8H\u0002ø\u0001\u0000¢\u0006\u0006\bã\u0001\u0010á\u0001J?\u0010ä\u0001\u001a\u00020\u001d2\u0006\u0010e\u001a\u00020d2\u0007\u0010\u0085\u0001\u001a\u00020\u00172\u0019\u00109\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0002\b8ø\u0001\u0000¢\u0006\u0006\bå\u0001\u0010á\u0001J,\u0010æ\u0001\u001a\u00020\u001d2\u0007\u0010¥\u0001\u001a\u00020\u000b2\u0007\u0010\u008c\u0001\u001a\u00020#2\t\b\u0002\u0010ç\u0001\u001a\u00020#H\u0000¢\u0006\u0003\bè\u0001J\u000f\u0010é\u0001\u001a\u00020\u001dH\u0010¢\u0006\u0003\bê\u0001J\u0007\u0010ë\u0001\u001a\u00020#J\u001f\u0010ì\u0001\u001a\u00030\u008d\u00012\u0007\u0010e\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bí\u0001\u0010\u0093\u0001J\b\u0010î\u0001\u001a\u00030Á\u0001J(\u0010ï\u0001\u001a\u00020\u001d2\u0007\u0010Â\u0001\u001a\u00020\u00032\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bò\u0001\u0010ó\u0001J(\u0010ô\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u00002\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\bõ\u0001\u0010ö\u0001J(\u0010÷\u0001\u001a\u00020\u001d2\u0007\u0010\u008a\u0001\u001a\u00020\u00002\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\bø\u0001\u0010ö\u0001J-\u0010ù\u0001\u001a\u00020\u001d2\u0019\u00109\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0002\b82\t\b\u0002\u0010ú\u0001\u001a\u00020#J\u0014\u0010û\u0001\u001a\u00020\u001d2\t\b\u0002\u0010ü\u0001\u001a\u00020#H\u0002JF\u0010ý\u0001\u001a\u00020\u001d\"\u0007\b\u0000\u0010þ\u0001\u0018\u00012\u000f\u0010§\u0001\u001a\n\u0012\u0005\u0012\u0003Hþ\u00010¨\u00012\u0014\u0010Ü\u0001\u001a\u000f\u0012\u0005\u0012\u0003Hþ\u0001\u0012\u0004\u0012\u00020\u001d0\u001bH\u0086\bø\u0001\u0000¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J1\u0010ý\u0001\u001a\u00020\u001d2\u0007\u0010\u0081\u0002\u001a\u00020Y2\u0007\u0010¯\u0001\u001a\u00020#2\u0013\u0010Ü\u0001\u001a\u000e\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u001d0\u001bH\u0086\bJ \u0010\u0082\u0002\u001a\u00030\u008d\u00012\b\u0010\u0083\u0002\u001a\u00030\u008d\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0084\u0002\u0010\u0093\u0001J(\u0010\u0085\u0002\u001a\u00020\u001d2\u0007\u0010\u0099\u0001\u001a\u00020\u001c2\u0013\u0010Ü\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0084\bJ\u001f\u0010\u0086\u0002\u001a\u00020#2\b\u0010\u0095\u0001\u001a\u00030\u008d\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0087\u0002\u0010¾\u0001JK\u0010\u0088\u0002\u001a\u00020\u001d*\u0004\u0018\u00010z2\b\u0010±\u0001\u001a\u00030²\u00012\b\u0010\u0095\u0001\u001a\u00030\u008d\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u00020#2\u0007\u0010¶\u0001\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002JT\u0010\u008b\u0002\u001a\u00020\u001d*\u0004\u0018\u00010z2\b\u0010±\u0001\u001a\u00030²\u00012\b\u0010\u0095\u0001\u001a\u00030\u008d\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u00020#2\u0007\u0010¶\u0001\u001a\u00020#2\u0007\u0010\u008c\u0002\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002JT\u0010\u008f\u0002\u001a\u00020\u001d*\u0004\u0018\u00010z2\b\u0010±\u0001\u001a\u00030²\u00012\b\u0010\u0095\u0001\u001a\u00030\u008d\u00012\b\u0010³\u0001\u001a\u00030´\u00012\u0007\u0010µ\u0001\u001a\u00020#2\u0007\u0010¶\u0001\u001a\u00020#2\u0007\u0010\u008c\u0002\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0090\u0002\u0010\u008e\u0002J\r\u0010\u0091\u0002\u001a\u00020\u0000*\u00020\u0003H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%R\u000e\u0010)\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010%R\u000e\u0010+\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u00020#2\u0006\u0010,\u001a\u00020#@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u001a\u0010/\u001a\u0002008@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u00102R\"\u00104\u001a\u0004\u0018\u0001032\b\u0010,\u001a\u0004\u0018\u000103@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106RD\u00109\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0002\b82\u0019\u0010,\u001a\u0015\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0002\b8@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR&\u0010H\u001a\u0004\u0018\u00010G2\b\u0010,\u001a\u0004\u0018\u00010G@dX¦\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0017\u0010S\u001a\u00020T8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bU\u00102R\u001c\u0010V\u001a\u0010\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020Y\u0018\u00010WX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010Z\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0012R\u0013\u0010\\\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b]\u0010\u0015R\u0016\u0010^\u001a\u0004\u0018\u00010_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bc\u0010\u0015R,\u0010e\u001a\u00020d2\u0006\u0010,\u001a\u00020d@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010i\u001a\u0004\bf\u00102\"\u0004\bg\u0010hR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020X0k8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u000b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u000e\u0010q\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010r\u001a\u00020s8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bt\u00102R\u0014\u0010u\u001a\u00020v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0012\u0010y\u001a\u00020zX¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u001e\u0010}\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u007f\"\u0006\b\u0084\u0001\u0010\u0081\u0001R(\u0010\u0085\u0001\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0017@DX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0019\"\u0006\b\u0087\u0001\u0010\u0088\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0094\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "_measureResult", "Landroidx/compose/ui/layout/MeasureResult;", "_rectCache", "Landroidx/compose/ui/geometry/MutableRect;", "alignmentLinesOwner", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "getAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "child", "getChild", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", com.ironsource.Y3.f, "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "density", "", "getDensity", "()F", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "getDrawBlock$annotations", "()V", "fontScale", "getFontScale", "hasMeasureResult", "", "getHasMeasureResult", "()Z", "invalidateParentLayer", "Lkotlin/Function0;", "isAttached", "isClipping", "isValidOwnerScope", "lastLayerAlpha", "<set-?>", "lastLayerDrawingWasSkipped", "getLastLayerDrawingWasSkipped$ui_release", "lastMeasurementConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastMeasurementConstraints-msEJaDk$ui_release", "()J", "Landroidx/compose/ui/node/OwnedLayer;", "layer", "getLayer", "()Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "layerDensity", "Landroidx/compose/ui/unit/Density;", "layerLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "value", "measureResult", "getMeasureResult$ui_release", "()Landroidx/compose/ui/layout/MeasureResult;", "setMeasureResult$ui_release", "(Landroidx/compose/ui/layout/MeasureResult;)V", "minimumTouchTargetSize", "Landroidx/compose/ui/geometry/Size;", "getMinimumTouchTargetSize-NH-jbRc", "oldAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "parent", "getParent", "parentCoordinates", "getParentCoordinates", "parentData", "", "getParentData", "()Ljava/lang/Object;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "Landroidx/compose/ui/unit/IntOffset;", "position", "getPosition-nOcc-ac", "setPosition--gyyYBs", "(J)V", "J", "providedAlignmentLines", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "rectCache", "getRectCache", "()Landroidx/compose/ui/geometry/MutableRect;", "released", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "tail", "Landroidx/compose/ui/Modifier$Node;", "getTail", "()Landroidx/compose/ui/Modifier$Node;", "wrapped", "getWrapped$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "setWrapped$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrappedBy", "getWrappedBy$ui_release", "setWrappedBy$ui_release", "zIndex", "getZIndex", "setZIndex", "(F)V", "ancestorToLocal", "ancestor", "rect", "clipBounds", "Landroidx/compose/ui/geometry/Offset;", "offset", "ancestorToLocal-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculateMinimumTouchTargetPadding", "calculateMinimumTouchTargetPadding-E7KxVPU", "(J)J", "distanceInMinimumTouchTarget", "pointerPosition", "distanceInMinimumTouchTarget-tz77jQw", "(JJ)F", "draw", "canvas", "drawBorder", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawContainedDrawModifiers", "ensureLookaheadDelegateCreated", "findCommonAncestor", "other", "findCommonAncestor$ui_release", "fromParentPosition", "fromParentPosition-MK-Hz9U", "fromParentRect", "bounds", "hasNode", "type", "Landroidx/compose/ui/node/NodeKind;", "hasNode-H91voCI", "(I)Z", "head", "head-H91voCI", "(I)Landroidx/compose/ui/Modifier$Node;", "headNode", "includeTail", "hitTest", "hitTestSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "isInLayer", "hitTest-YqVAtuI", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestChild", "hitTestChild-YqVAtuI", "invalidateLayer", "isPointerInBounds", "isPointerInBounds-k-4lQ0M", "(J)Z", "isTransparent", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "localPositionOf", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "offsetFromEdge", "offsetFromEdge-MK-Hz9U", "onCoordinatesUsed", "onCoordinatesUsed$ui_release", "onLayoutModifierNodeChanged", "onLayoutNodeAttach", "onMeasureResultChanged", "width", "height", "onMeasured", "onPlaced", "onRelease", "performDraw", "performingMeasure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "block", "performingMeasure-K40F9xA", "(JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/layout/Placeable;", "placeAt", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeSelf", "placeSelf-f8xVGno", "placeSelfApparentToRealOffset", "placeSelfApparentToRealOffset-f8xVGno", "rectInParent", "clipToMinimumTouchTargetSize", "rectInParent$ui_release", "replace", "replace$ui_release", "shouldSharePointerInputWithSiblings", "toParentPosition", "toParentPosition-MK-Hz9U", "touchBoundsInRoot", "transformFrom", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFromAncestor", "transformFromAncestor-EL8BTi8", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "transformToAncestor", "transformToAncestor-EL8BTi8", "updateLayerBlock", "forceUpdateLayerParameters", "updateLayerParameters", "invokeOnLayoutChange", "visitNodes", "T", "visitNodes-aLcG6gQ", "(ILkotlin/jvm/functions/Function1;)V", "mask", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "withPositionTranslation", "withinLayerBounds", "withinLayerBounds-k-4lQ0M", "hit", "hit-1hIXUjU", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitNear", "distanceFromEdge", "hitNear-JHbHoSQ", "(Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;ZZF)V", "speculativeHit", "speculativeHit-JHbHoSQ", "toCoordinator", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "HitTestSource", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NodeCoordinator extends androidx.compose.ui.node.LookaheadCapablePlaceable implements androidx.compose.ui.layout.Measurable, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.node.OwnerScope {
    public static final int $stable = 0;
    public static final java.lang.String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final java.lang.String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private androidx.compose.ui.layout.MeasureResult _measureResult;
    private androidx.compose.ui.geometry.MutableRect _rectCache;
    private boolean isClipping;
    private boolean lastLayerDrawingWasSkipped;
    private androidx.compose.ui.node.OwnedLayer layer;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock;
    private androidx.compose.ui.node.LayerPositionalProperties layerPositionalProperties;
    private final androidx.compose.ui.node.LayoutNode layoutNode;
    private java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> oldAlignmentLines;
    private boolean released;
    private androidx.compose.ui.node.NodeCoordinator wrapped;
    private androidx.compose.ui.node.NodeCoordinator wrappedBy;
    private float zIndex;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.NodeCoordinator.Companion INSTANCE = new androidx.compose.ui.node.NodeCoordinator.Companion(null);
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.node.NodeCoordinator, kotlin.Unit> onCommitAffectingLayerParams = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.NodeCoordinator, kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
            androidx.compose.ui.node.LayerPositionalProperties layerPositionalProperties;
            androidx.compose.ui.node.LayerPositionalProperties layerPositionalProperties2;
            androidx.compose.ui.node.LayerPositionalProperties layerPositionalProperties3;
            if (nodeCoordinator.isValidOwnerScope()) {
                layerPositionalProperties = nodeCoordinator.layerPositionalProperties;
                if (layerPositionalProperties != null) {
                    layerPositionalProperties2 = androidx.compose.ui.node.NodeCoordinator.tmpLayerPositionalProperties;
                    layerPositionalProperties2.copyFrom(layerPositionalProperties);
                    androidx.compose.ui.node.NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
                    layerPositionalProperties3 = androidx.compose.ui.node.NodeCoordinator.tmpLayerPositionalProperties;
                    if (layerPositionalProperties3.hasSameValuesAs(layerPositionalProperties)) {
                        return;
                    }
                    androidx.compose.ui.node.LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                    androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                    if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                        if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                            androidx.compose.ui.node.LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                        }
                        layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
                    }
                    androidx.compose.ui.node.Owner owner = layoutNode.getOwner();
                    if (owner != null) {
                        owner.requestOnPositionedCallback(layoutNode);
                        return;
                    }
                    return;
                }
                androidx.compose.ui.node.NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
            }
        }
    };
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.node.NodeCoordinator, kotlin.Unit> onCommitAffectingLayer = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.NodeCoordinator, kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
            androidx.compose.ui.node.OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };
    private static final androidx.compose.ui.graphics.ReusableGraphicsLayerScope graphicsLayerScope = new androidx.compose.ui.graphics.ReusableGraphicsLayerScope();
    private static final androidx.compose.ui.node.LayerPositionalProperties tmpLayerPositionalProperties = new androidx.compose.ui.node.LayerPositionalProperties();
    private static final float[] tmpMatrix = androidx.compose.ui.graphics.Matrix.m2352constructorimpl$default(null, 1, null);
    private static final androidx.compose.ui.node.NodeCoordinator.HitTestSource PointerInputSource = new androidx.compose.ui.node.NodeCoordinator.HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(androidx.compose.ui.node.LayoutNode parentLayoutNode) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo3608childHitTestYqVAtuI(androidx.compose.ui.node.LayoutNode layoutNode, long pointerPosition, androidx.compose.ui.node.HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.m3536hitTestM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo3609entityTypeOLwlOKw() {
            return androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(androidx.compose.ui.Modifier.Node node) {
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
            androidx.compose.runtime.collection.MutableVector mutableVector = null;
            while (node != 0) {
                if (node instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                    if (((androidx.compose.ui.node.PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate = node.getDelegate();
                    int i = 0;
                    node = node;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                node = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (node != 0) {
                                    if (mutableVector != null) {
                                        mutableVector.add(node);
                                    }
                                    node = 0;
                                }
                                if (mutableVector != null) {
                                    mutableVector.add(delegate);
                                }
                            }
                        }
                        delegate = delegate.getChild();
                        node = node;
                    }
                    if (i == 1) {
                    }
                }
                node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
            }
            return false;
        }
    };
    private static final androidx.compose.ui.node.NodeCoordinator.HitTestSource SemanticsSource = new androidx.compose.ui.node.NodeCoordinator.HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(androidx.compose.ui.Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(androidx.compose.ui.node.LayoutNode parentLayoutNode) {
            androidx.compose.ui.semantics.SemanticsConfiguration collapsedSemantics$ui_release = parentLayoutNode.getCollapsedSemantics$ui_release();
            boolean z = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: childHitTest-YqVAtuI */
        public void mo3608childHitTestYqVAtuI(androidx.compose.ui.node.LayoutNode layoutNode, long pointerPosition, androidx.compose.ui.node.HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.m3537hitTestSemanticsM_7yMNQ$ui_release(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* renamed from: entityType-OLwlOKw */
        public int mo3609entityTypeOLwlOKw() {
            return androidx.compose.ui.node.NodeKind.m3613constructorimpl(8);
        }
    };
    private androidx.compose.ui.unit.Density layerDensity = getLayoutNode().getDensity();
    private androidx.compose.ui.unit.LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Canvas, kotlin.Unit> drawBlock = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Canvas, kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Canvas canvas) {
            invoke2(canvas);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final androidx.compose.ui.graphics.Canvas canvas) {
            androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver;
            kotlin.jvm.functions.Function1 function1;
            if (androidx.compose.ui.node.NodeCoordinator.this.getLayoutNode().isPlaced()) {
                snapshotObserver = androidx.compose.ui.node.NodeCoordinator.this.getSnapshotObserver();
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = androidx.compose.ui.node.NodeCoordinator.this;
                function1 = androidx.compose.ui.node.NodeCoordinator.onCommitAffectingLayer;
                final androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = androidx.compose.ui.node.NodeCoordinator.this;
                snapshotObserver.observeReads$ui_release(nodeCoordinator, function1, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.compose.ui.node.NodeCoordinator.this.drawContainedDrawModifiers(canvas);
                    }
                });
                androidx.compose.ui.node.NodeCoordinator.this.lastLayerDrawingWasSkipped = false;
                return;
            }
            androidx.compose.ui.node.NodeCoordinator.this.lastLayerDrawingWasSkipped = true;
        }
    };
    private final kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            invoke2();
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            androidx.compose.ui.node.NodeCoordinator wrappedBy = androidx.compose.ui.node.NodeCoordinator.this.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.invalidateLayer();
            }
        }
    };

    /* compiled from: NodeCoordinator.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005H&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "", "childHitTest", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "", "isInLayer", "childHitTest-YqVAtuI", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "entityType", "Landroidx/compose/ui/node/NodeKind;", "entityType-OLwlOKw", "()I", "interceptOutOfBoundsChildEvents", "node", "Landroidx/compose/ui/Modifier$Node;", "shouldHitTestChildren", "parentLayoutNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface HitTestSource {
        /* renamed from: childHitTest-YqVAtuI */
        void mo3608childHitTestYqVAtuI(androidx.compose.ui.node.LayoutNode layoutNode, long pointerPosition, androidx.compose.ui.node.HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer);

        /* renamed from: entityType-OLwlOKw */
        int mo3609entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(androidx.compose.ui.Modifier.Node node);

        boolean shouldHitTestChildren(androidx.compose.ui.node.LayoutNode parentLayoutNode);
    }

    private static /* synthetic */ void getDrawBlock$annotations() {
    }

    public abstract void ensureLookaheadDelegateCreated();

    public abstract androidx.compose.ui.node.LookaheadDelegate getLookaheadDelegate();

    public abstract androidx.compose.ui.Modifier.Node getTail();

    protected abstract void setLookaheadDelegate(androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate);

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public NodeCoordinator(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    /* renamed from: getWrapped$ui_release, reason: from getter */
    public final androidx.compose.ui.node.NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    public final void setWrapped$ui_release(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    /* renamed from: getWrappedBy$ui_release, reason: from getter */
    public final androidx.compose.ui.node.NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public final void setWrappedBy$ui_release(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.node.LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.LayoutCoordinates getCoordinates() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.Modifier.Node headNode(boolean includeTail) {
        androidx.compose.ui.Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null && (tail = nodeCoordinator.getTail()) != null) {
                return tail.getChild();
            }
        } else {
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = this.wrappedBy;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.getTail();
            }
        }
        return null;
    }

    public final void visitNodes(int mask, boolean includeTail, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> block) {
        androidx.compose.ui.Modifier.Node tail = getTail();
        if (!includeTail && (tail = tail.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.Modifier.Node headNode = headNode(includeTail); headNode != null && (headNode.getAggregateChildKindSet() & mask) != 0; headNode = headNode.getChild()) {
            if ((headNode.getKindSet() & mask) != 0) {
                block.invoke(headNode);
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m3606visitNodesaLcG6gQ(int type, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        boolean m3622getIncludeSelfInTraversalH91voCI = androidx.compose.ui.node.NodeKindKt.m3622getIncludeSelfInTraversalH91voCI(type);
        androidx.compose.ui.Modifier.Node tail = getTail();
        if (!m3622getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.Modifier.Node headNode = headNode(m3622getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & type) != 0; headNode = headNode.getChild()) {
            if ((headNode.getKindSet() & type) != 0) {
                androidx.compose.ui.Modifier.Node node = headNode;
                androidx.compose.runtime.collection.MutableVector mutableVector = null;
                while (node != null) {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                    if (node instanceof java.lang.Object) {
                        block.invoke(node);
                    } else if ((node.getKindSet() & type) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                        int i = 0;
                        for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & type) != 0) {
                                i++;
                                if (i == 1) {
                                    node = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        if (mutableVector != null) {
                                            mutableVector.add(node);
                                        }
                                        node = null;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m3586hasNodeH91voCI(int type) {
        androidx.compose.ui.Modifier.Node headNode = headNode(androidx.compose.ui.node.NodeKindKt.m3622getIncludeSelfInTraversalH91voCI(type));
        return headNode != null && androidx.compose.ui.node.DelegatableNodeKt.m3507has64DMado(headNode, type);
    }

    /* renamed from: head-H91voCI, reason: not valid java name */
    public final androidx.compose.ui.Modifier.Node m3599headH91voCI(int type) {
        boolean m3622getIncludeSelfInTraversalH91voCI = androidx.compose.ui.node.NodeKindKt.m3622getIncludeSelfInTraversalH91voCI(type);
        androidx.compose.ui.Modifier.Node tail = getTail();
        if (!m3622getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return null;
        }
        for (androidx.compose.ui.Modifier.Node headNode = headNode(m3622getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & type) != 0; headNode = headNode.getChild()) {
            if ((headNode.getKindSet() & type) != 0) {
                return headNode;
            }
            if (headNode == tail) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: getSize-YbymL2g */
    public final long mo3409getSizeYbymL2g() {
        return getMeasuredSize();
    }

    protected final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> getLayerBlock() {
        return this.layerBlock;
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.node.AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate().getAlignmentLinesOwner$ui_release();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.node.LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui_release() {
        mo3403placeAtf8xVGno(getPosition(), this.zIndex, this.layerBlock);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().getIsAttached();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.MeasureResult getMeasureResult$ui_release() {
        androidx.compose.ui.layout.MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new java.lang.IllegalStateException(UnmeasuredError.toString());
    }

    public void setMeasureResult$ui_release(androidx.compose.ui.layout.MeasureResult measureResult) {
        androidx.compose.ui.layout.MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && !(!measureResult.getAlignmentLines().isEmpty())) || kotlin.jvm.internal.Intrinsics.areEqual(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            java.util.LinkedHashMap linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(measureResult.getAlignmentLines());
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public java.util.Set<androidx.compose.ui.layout.AlignmentLine> getProvidedAlignmentLines() {
        java.util.LinkedHashSet linkedHashSet = null;
        for (androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            androidx.compose.ui.layout.MeasureResult measureResult = nodeCoordinator._measureResult;
            java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new java.util.LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? kotlin.collections.SetsKt.emptySet() : linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    protected void onMeasureResultChanged(int width, int height) {
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo3664resizeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(width, height));
        } else {
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                nodeCoordinator.invalidateLayer();
            }
        }
        m3454setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(width, height));
        updateLayerParameters(false);
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(4);
        boolean m3622getIncludeSelfInTraversalH91voCI = androidx.compose.ui.node.NodeKindKt.m3622getIncludeSelfInTraversalH91voCI(m3613constructorimpl);
        androidx.compose.ui.Modifier.Node tail = getTail();
        if (m3622getIncludeSelfInTraversalH91voCI || (tail = tail.getParent()) != null) {
            for (androidx.compose.ui.Modifier.Node headNode = headNode(m3622getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & m3613constructorimpl) != 0; headNode = headNode.getChild()) {
                if ((headNode.getKindSet() & m3613constructorimpl) != 0) {
                    androidx.compose.ui.node.DelegatingNode delegatingNode = headNode;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (delegatingNode != 0) {
                        if (delegatingNode instanceof androidx.compose.ui.node.DrawModifierNode) {
                            ((androidx.compose.ui.node.DrawModifierNode) delegatingNode).onMeasureResultChanged();
                        } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                            androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                            int i = 0;
                            delegatingNode = delegatingNode;
                            while (delegate != null) {
                                if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        delegatingNode = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (delegatingNode != 0) {
                                            if (mutableVector != null) {
                                                mutableVector.add(delegatingNode);
                                            }
                                            delegatingNode = 0;
                                        }
                                        if (mutableVector != null) {
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                delegate = delegate.getChild();
                                delegatingNode = delegatingNode;
                            }
                            if (i == 1) {
                            }
                        }
                        delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if (headNode == tail) {
                    break;
                }
            }
        }
        androidx.compose.ui.node.Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.onLayoutChange(getLayoutNode());
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* renamed from: getPosition-nOcc-ac, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    /* renamed from: setPosition--gyyYBs, reason: not valid java name */
    protected void m3604setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    protected final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public java.lang.Object getParentData() {
        if (!getLayoutNode().getNodes().m3576hasH91voCI$ui_release(androidx.compose.ui.node.NodeKind.m3613constructorimpl(64))) {
            return null;
        }
        getTail();
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        for (androidx.compose.ui.Modifier.Node tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(64) & tail.getKindSet()) != 0) {
                int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(64);
                androidx.compose.runtime.collection.MutableVector mutableVector = null;
                androidx.compose.ui.node.DelegatingNode delegatingNode = tail;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof androidx.compose.ui.node.ParentDataModifierNode) {
                        objectRef.element = ((androidx.compose.ui.node.ParentDataModifierNode) delegatingNode).modifyParentData(getLayoutNode().getDensity(), objectRef.element);
                    } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                        androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                        int i = 0;
                        delegatingNode = delegatingNode;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    delegatingNode = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode != 0) {
                                        if (mutableVector != null) {
                                            mutableVector.add(delegatingNode);
                                        }
                                        delegatingNode = 0;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                            delegate = delegate.getChild();
                            delegatingNode = delegatingNode;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                }
            }
        }
        return objectRef.element;
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate().onCoordinatesUsed();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final androidx.compose.ui.layout.LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            throw new java.lang.IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final androidx.compose.ui.layout.LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            throw new java.lang.IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        return this.wrappedBy;
    }

    protected final androidx.compose.ui.geometry.MutableRect getRectCache() {
        androidx.compose.ui.geometry.MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        androidx.compose.ui.geometry.MutableRect mutableRect2 = new androidx.compose.ui.geometry.MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.node.OwnerSnapshotObserver getSnapshotObserver() {
        return androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m3597getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return getMeasurementConstraints();
    }

    /* renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    protected final androidx.compose.ui.layout.Placeable m3602performingMeasureK40F9xA(long constraints, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.Placeable> block) {
        m3455setMeasurementConstraintsBRTryo0(constraints);
        return block.invoke();
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    protected void mo3403placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        m3590placeSelff8xVGno(position, zIndex, layerBlock);
    }

    /* renamed from: placeSelf-f8xVGno, reason: not valid java name */
    private final void m3590placeSelff8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        updateLayerBlock$default(this, layerBlock, false, 2, null);
        if (!androidx.compose.ui.unit.IntOffset.m4609equalsimpl0(getPosition(), position)) {
            m3604setPositiongyyYBs(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3663movegyyYBs(position);
            } else {
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            invalidateAlignmentLinesFromPositionChange(this);
            androidx.compose.ui.node.Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
    }

    /* renamed from: placeSelfApparentToRealOffset-f8xVGno, reason: not valid java name */
    public final void m3603placeSelfApparentToRealOffsetf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        long j = getApparentToRealOffset();
        m3590placeSelff8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(position) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(position) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j)), zIndex, layerBlock);
    }

    public final void draw(androidx.compose.ui.graphics.Canvas canvas) {
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas);
            return;
        }
        float m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(getPosition());
        float m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(getPosition());
        canvas.translate(m4610getXimpl, m4611getYimpl);
        drawContainedDrawModifiers(canvas);
        canvas.translate(-m4610getXimpl, -m4611getYimpl);
    }

    public void performDraw(androidx.compose.ui.graphics.Canvas canvas) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, kotlin.jvm.functions.Function1 function1, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.updateLayerBlock(function1, z);
    }

    public final void updateLayerBlock(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock, boolean forceUpdateLayerParameters) {
        androidx.compose.ui.node.Owner owner;
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        boolean z = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && kotlin.jvm.internal.Intrinsics.areEqual(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerBlock = layerBlock;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && layerBlock != null) {
            if (this.layer != null) {
                if (z) {
                    updateLayerParameters$default(this, false, 1, null);
                    return;
                }
                return;
            }
            androidx.compose.ui.node.OwnedLayer createLayer = androidx.compose.ui.node.LayoutNodeKt.requireOwner(layoutNode).createLayer(this.drawBlock, this.invalidateParentLayer);
            createLayer.mo3664resizeozmzZPI(getMeasuredSize());
            createLayer.mo3663movegyyYBs(getPosition());
            this.layer = createLayer;
            updateLayerParameters$default(this, false, 1, null);
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
            return;
        }
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
            layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && (owner = layoutNode.getOwner()) != null) {
                owner.onLayoutChange(layoutNode);
            }
        }
        this.layer = null;
        this.lastLayerDrawingWasSkipped = false;
    }

    static /* synthetic */ void updateLayerParameters$default(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.updateLayerParameters(z);
    }

    private final void updateLayerParameters(boolean invokeOnLayoutChange) {
        androidx.compose.ui.node.Owner owner;
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            final kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1 = this.layerBlock;
            if (function1 == null) {
                throw new java.lang.IllegalStateException("updateLayerParameters requires a non-null layerBlock".toString());
            }
            androidx.compose.ui.graphics.ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
            reusableGraphicsLayerScope.reset();
            reusableGraphicsLayerScope.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
            reusableGraphicsLayerScope.m2433setSizeuvyYCjk(androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(mo3409getSizeYbymL2g()));
            getSnapshotObserver().observeReads$ui_release(this, onCommitAffectingLayerParams, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.graphics.ReusableGraphicsLayerScope reusableGraphicsLayerScope2;
                    kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function12 = function1;
                    reusableGraphicsLayerScope2 = androidx.compose.ui.node.NodeCoordinator.graphicsLayerScope;
                    function12.invoke(reusableGraphicsLayerScope2);
                }
            });
            androidx.compose.ui.node.LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
            if (layerPositionalProperties == null) {
                layerPositionalProperties = new androidx.compose.ui.node.LayerPositionalProperties();
                this.layerPositionalProperties = layerPositionalProperties;
            }
            layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
            ownedLayer.updateLayerProperties(reusableGraphicsLayerScope, getLayoutNode().getLayoutDirection(), getLayoutNode().getDensity());
            this.isClipping = reusableGraphicsLayerScope.getClip();
            this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
            if (!invokeOnLayoutChange || (owner = getLayoutNode().getOwner()) == null) {
                return;
            }
            owner.onLayoutChange(getLayoutNode());
            return;
        }
        if (this.layerBlock != null) {
            throw new java.lang.IllegalStateException("null layer with a non-null layerBlock".toString());
        }
    }

    /* renamed from: getLastLayerDrawingWasSkipped$ui_release, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final androidx.compose.ui.node.OwnedLayer getLayer() {
        return this.layer;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    /* renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m3598getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo316toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo3540getMinimumTouchTargetSizeMYxV2XQ());
    }

    /* renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final void m3600hitTestYqVAtuI(androidx.compose.ui.node.NodeCoordinator.HitTestSource hitTestSource, long pointerPosition, androidx.compose.ui.node.HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        androidx.compose.ui.Modifier.Node m3599headH91voCI = m3599headH91voCI(hitTestSource.mo3609entityTypeOLwlOKw());
        if (!m3607withinLayerBoundsk4lQ0M(pointerPosition)) {
            if (isTouchEvent) {
                float m3595distanceInMinimumTouchTargettz77jQw = m3595distanceInMinimumTouchTargettz77jQw(pointerPosition, m3598getMinimumTouchTargetSizeNHjbRc());
                if (java.lang.Float.isInfinite(m3595distanceInMinimumTouchTargettz77jQw) || java.lang.Float.isNaN(m3595distanceInMinimumTouchTargettz77jQw) || !hitTestResult.isHitInMinimumTouchTargetBetter(m3595distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m3588hitNearJHbHoSQ(m3599headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, m3595distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (m3599headH91voCI == null) {
            mo3530hitTestChildYqVAtuI(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (m3601isPointerInBoundsk4lQ0M(pointerPosition)) {
            m3587hit1hIXUjU(m3599headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float m3595distanceInMinimumTouchTargettz77jQw2 = !isTouchEvent ? Float.POSITIVE_INFINITY : m3595distanceInMinimumTouchTargettz77jQw(pointerPosition, m3598getMinimumTouchTargetSizeNHjbRc());
        if (!java.lang.Float.isInfinite(m3595distanceInMinimumTouchTargettz77jQw2) && !java.lang.Float.isNaN(m3595distanceInMinimumTouchTargettz77jQw2)) {
            if (hitTestResult.isHitInMinimumTouchTargetBetter(m3595distanceInMinimumTouchTargettz77jQw2, isInLayer)) {
                m3588hitNearJHbHoSQ(m3599headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, m3595distanceInMinimumTouchTargettz77jQw2);
                return;
            }
        }
        m3591speculativeHitJHbHoSQ(m3599headH91voCI, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, m3595distanceInMinimumTouchTargettz77jQw2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hit-1hIXUjU, reason: not valid java name */
    public final void m3587hit1hIXUjU(final androidx.compose.ui.Modifier.Node node, final androidx.compose.ui.node.NodeCoordinator.HitTestSource hitTestSource, final long j, final androidx.compose.ui.node.HitTestResult hitTestResult, final boolean z, final boolean z2) {
        if (node == null) {
            mo3530hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hit(node, z2, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.Modifier.Node m3611nextUntilhw7D004;
                    androidx.compose.ui.node.NodeCoordinator nodeCoordinator = androidx.compose.ui.node.NodeCoordinator.this;
                    m3611nextUntilhw7D004 = androidx.compose.ui.node.NodeCoordinatorKt.m3611nextUntilhw7D004(node, hitTestSource.mo3609entityTypeOLwlOKw(), androidx.compose.ui.node.NodeKind.m3613constructorimpl(2));
                    nodeCoordinator.m3587hit1hIXUjU(m3611nextUntilhw7D004, hitTestSource, j, hitTestResult, z, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hitNear-JHbHoSQ, reason: not valid java name */
    public final void m3588hitNearJHbHoSQ(final androidx.compose.ui.Modifier.Node node, final androidx.compose.ui.node.NodeCoordinator.HitTestSource hitTestSource, final long j, final androidx.compose.ui.node.HitTestResult hitTestResult, final boolean z, final boolean z2, final float f) {
        if (node == null) {
            mo3530hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else {
            hitTestResult.hitInMinimumTouchTarget(node, f, z2, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.Modifier.Node m3611nextUntilhw7D004;
                    androidx.compose.ui.node.NodeCoordinator nodeCoordinator = androidx.compose.ui.node.NodeCoordinator.this;
                    m3611nextUntilhw7D004 = androidx.compose.ui.node.NodeCoordinatorKt.m3611nextUntilhw7D004(node, hitTestSource.mo3609entityTypeOLwlOKw(), androidx.compose.ui.node.NodeKind.m3613constructorimpl(2));
                    nodeCoordinator.m3588hitNearJHbHoSQ(m3611nextUntilhw7D004, hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: speculativeHit-JHbHoSQ, reason: not valid java name */
    public final void m3591speculativeHitJHbHoSQ(final androidx.compose.ui.Modifier.Node node, final androidx.compose.ui.node.NodeCoordinator.HitTestSource hitTestSource, final long j, final androidx.compose.ui.node.HitTestResult hitTestResult, final boolean z, final boolean z2, final float f) {
        androidx.compose.ui.Modifier.Node m3611nextUntilhw7D004;
        if (node == null) {
            mo3530hitTestChildYqVAtuI(hitTestSource, j, hitTestResult, z, z2);
        } else if (!hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            m3611nextUntilhw7D004 = androidx.compose.ui.node.NodeCoordinatorKt.m3611nextUntilhw7D004(node, hitTestSource.mo3609entityTypeOLwlOKw(), androidx.compose.ui.node.NodeKind.m3613constructorimpl(2));
            m3591speculativeHitJHbHoSQ(m3611nextUntilhw7D004, hitTestSource, j, hitTestResult, z, z2, f);
        } else {
            hitTestResult.speculativeHit(node, f, z2, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    androidx.compose.ui.Modifier.Node m3611nextUntilhw7D0042;
                    androidx.compose.ui.node.NodeCoordinator nodeCoordinator = androidx.compose.ui.node.NodeCoordinator.this;
                    m3611nextUntilhw7D0042 = androidx.compose.ui.node.NodeCoordinatorKt.m3611nextUntilhw7D004(node, hitTestSource.mo3609entityTypeOLwlOKw(), androidx.compose.ui.node.NodeKind.m3613constructorimpl(2));
                    nodeCoordinator.m3591speculativeHitJHbHoSQ(m3611nextUntilhw7D0042, hitTestSource, j, hitTestResult, z, z2, f);
                }
            });
        }
    }

    /* renamed from: hitTestChild-YqVAtuI */
    public void mo3530hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator.HitTestSource hitTestSource, long pointerPosition, androidx.compose.ui.node.HitTestResult hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m3600hitTestYqVAtuI(hitTestSource, nodeCoordinator.m3596fromParentPositionMKHz9U(pointerPosition), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    public final androidx.compose.ui.geometry.Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(this);
        androidx.compose.ui.geometry.MutableRect rectCache = getRectCache();
        long m3594calculateMinimumTouchTargetPaddingE7KxVPU = m3594calculateMinimumTouchTargetPaddingE7KxVPU(m3598getMinimumTouchTargetSizeNHjbRc());
        rectCache.setLeft(-androidx.compose.ui.geometry.Size.m1940getWidthimpl(m3594calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setTop(-androidx.compose.ui.geometry.Size.m1937getHeightimpl(m3594calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setRight(getMeasuredWidth() + androidx.compose.ui.geometry.Size.m1940getWidthimpl(m3594calculateMinimumTouchTargetPaddingE7KxVPU));
        rectCache.setBottom(getMeasuredHeight() + androidx.compose.ui.geometry.Size.m1937getHeightimpl(m3594calculateMinimumTouchTargetPaddingE7KxVPU));
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != findRootCoordinates) {
            nodeCoordinator.rectInParent$ui_release(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            kotlin.jvm.internal.Intrinsics.checkNotNull(nodeCoordinator);
        }
        return androidx.compose.ui.geometry.MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: windowToLocal-MK-Hz9U */
    public long mo3414windowToLocalMKHz9U(long relativeToWindow) {
        if (!isAttached()) {
            throw new java.lang.IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(this);
        return mo3410localPositionOfR5De75A(findRootCoordinates, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).mo3666calculateLocalPositionMKHz9U(relativeToWindow), androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(findRootCoordinates)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToWindow-MK-Hz9U */
    public long mo3412localToWindowMKHz9U(long relativeToLocal) {
        return androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).mo3667calculatePositionInWindowMKHz9U(mo3411localToRootMKHz9U(relativeToLocal));
    }

    private final androidx.compose.ui.node.NodeCoordinator toCoordinator(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.node.NodeCoordinator coordinator;
        androidx.compose.ui.layout.LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates ? (androidx.compose.ui.layout.LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (androidx.compose.ui.node.NodeCoordinator) layoutCoordinates;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localPositionOf-R5De75A */
    public long mo3410localPositionOfR5De75A(androidx.compose.ui.layout.LayoutCoordinates sourceCoordinates, long relativeToSource) {
        if (sourceCoordinates instanceof androidx.compose.ui.layout.LookaheadLayoutCoordinates) {
            return androidx.compose.ui.geometry.Offset.m1880unaryMinusF1C5BW0(sourceCoordinates.mo3410localPositionOfR5De75A(this, androidx.compose.ui.geometry.Offset.m1880unaryMinusF1C5BW0(relativeToSource)));
        }
        androidx.compose.ui.node.NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        androidx.compose.ui.node.NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != findCommonAncestor$ui_release) {
            relativeToSource = coordinator.m3605toParentPositionMKHz9U(relativeToSource);
            coordinator = coordinator.wrappedBy;
            kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
        }
        return m3585ancestorToLocalR5De75A(findCommonAncestor$ui_release, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: transformFrom-EL8BTi8 */
    public void mo3413transformFromEL8BTi8(androidx.compose.ui.layout.LayoutCoordinates sourceCoordinates, float[] matrix) {
        androidx.compose.ui.node.NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        androidx.compose.ui.node.NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        androidx.compose.ui.graphics.Matrix.m2361resetimpl(matrix);
        coordinator.m3593transformToAncestorEL8BTi8(findCommonAncestor$ui_release, matrix);
        m3592transformFromAncestorEL8BTi8(findCommonAncestor$ui_release, matrix);
    }

    /* renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m3593transformToAncestorEL8BTi8(androidx.compose.ui.node.NodeCoordinator ancestor, float[] matrix) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this;
        while (!kotlin.jvm.internal.Intrinsics.areEqual(nodeCoordinator, ancestor)) {
            androidx.compose.ui.node.OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.mo3665transform58bKbWc(matrix);
            }
            if (!androidx.compose.ui.unit.IntOffset.m4609equalsimpl0(nodeCoordinator.getPosition(), androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac())) {
                float[] fArr = tmpMatrix;
                androidx.compose.ui.graphics.Matrix.m2361resetimpl(fArr);
                androidx.compose.ui.graphics.Matrix.m2372translateimpl$default(fArr, androidx.compose.ui.unit.IntOffset.m4610getXimpl(r1), androidx.compose.ui.unit.IntOffset.m4611getYimpl(r1), 0.0f, 4, null);
                androidx.compose.ui.graphics.Matrix.m2369timesAssign58bKbWc(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            kotlin.jvm.internal.Intrinsics.checkNotNull(nodeCoordinator);
        }
    }

    /* renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m3592transformFromAncestorEL8BTi8(androidx.compose.ui.node.NodeCoordinator ancestor, float[] matrix) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(ancestor, this)) {
            return;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrappedBy;
        kotlin.jvm.internal.Intrinsics.checkNotNull(nodeCoordinator);
        nodeCoordinator.m3592transformFromAncestorEL8BTi8(ancestor, matrix);
        if (!androidx.compose.ui.unit.IntOffset.m4609equalsimpl0(getPosition(), androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac())) {
            float[] fArr = tmpMatrix;
            androidx.compose.ui.graphics.Matrix.m2361resetimpl(fArr);
            androidx.compose.ui.graphics.Matrix.m2372translateimpl$default(fArr, -androidx.compose.ui.unit.IntOffset.m4610getXimpl(getPosition()), -androidx.compose.ui.unit.IntOffset.m4611getYimpl(getPosition()), 0.0f, 4, null);
            androidx.compose.ui.graphics.Matrix.m2369timesAssign58bKbWc(matrix, fArr);
        }
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo3660inverseTransform58bKbWc(matrix);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public androidx.compose.ui.geometry.Rect localBoundingBoxOf(androidx.compose.ui.layout.LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        if (!isAttached()) {
            throw new java.lang.IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        if (!sourceCoordinates.isAttached()) {
            throw new java.lang.IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        androidx.compose.ui.node.NodeCoordinator coordinator = toCoordinator(sourceCoordinates);
        coordinator.onCoordinatesUsed$ui_release();
        androidx.compose.ui.node.NodeCoordinator findCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        androidx.compose.ui.geometry.MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(sourceCoordinates.mo3409getSizeYbymL2g()));
        rectCache.setBottom(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(sourceCoordinates.mo3409getSizeYbymL2g()));
        while (coordinator != findCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, rectCache, clipBounds, false, 4, null);
            if (rectCache.isEmpty()) {
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
            }
            coordinator = coordinator.wrappedBy;
            kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
        }
        ancestorToLocal(findCommonAncestor$ui_release, rectCache, clipBounds);
        return androidx.compose.ui.geometry.MutableRectKt.toRect(rectCache);
    }

    /* renamed from: ancestorToLocal-R5De75A, reason: not valid java name */
    private final long m3585ancestorToLocalR5De75A(androidx.compose.ui.node.NodeCoordinator ancestor, long offset) {
        if (ancestor == this) {
            return offset;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator == null || kotlin.jvm.internal.Intrinsics.areEqual(ancestor, nodeCoordinator)) {
            return m3596fromParentPositionMKHz9U(offset);
        }
        return m3596fromParentPositionMKHz9U(nodeCoordinator.m3585ancestorToLocalR5De75A(ancestor, offset));
    }

    private final void ancestorToLocal(androidx.compose.ui.node.NodeCoordinator ancestor, androidx.compose.ui.geometry.MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.ancestorToLocal(ancestor, rect, clipBounds);
        }
        fromParentRect(rect, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* renamed from: localToRoot-MK-Hz9U */
    public long mo3411localToRootMKHz9U(long relativeToLocal) {
        if (!isAttached()) {
            throw new java.lang.IllegalStateException(ExpectAttachedLayoutCoordinates.toString());
        }
        onCoordinatesUsed$ui_release();
        for (androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            relativeToLocal = nodeCoordinator.m3605toParentPositionMKHz9U(relativeToLocal);
        }
        return relativeToLocal;
    }

    protected final void withPositionTranslation(androidx.compose.ui.graphics.Canvas canvas, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Canvas, kotlin.Unit> block) {
        float m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(getPosition());
        float m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(getPosition());
        canvas.translate(m4610getXimpl, m4611getYimpl);
        block.invoke(canvas);
        canvas.translate(-m4610getXimpl, -m4611getYimpl);
    }

    /* renamed from: toParentPosition-MK-Hz9U, reason: not valid java name */
    public long m3605toParentPositionMKHz9U(long position) {
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.mo3662mapOffset8S9VItk(position, false);
        }
        return androidx.compose.ui.unit.IntOffsetKt.m4624plusNvtHpc(position, getPosition());
    }

    /* renamed from: fromParentPosition-MK-Hz9U, reason: not valid java name */
    public long m3596fromParentPositionMKHz9U(long position) {
        long m4622minusNvtHpc = androidx.compose.ui.unit.IntOffsetKt.m4622minusNvtHpc(position, getPosition());
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo3662mapOffset8S9VItk(m4622minusNvtHpc, true) : m4622minusNvtHpc;
    }

    protected final void drawBorder(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.Paint paint) {
        canvas.drawRect(new androidx.compose.ui.geometry.Rect(0.5f, 0.5f, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(getMeasuredSize()) - 0.5f, androidx.compose.ui.unit.IntSize.m4651getHeightimpl(getMeasuredSize()) - 0.5f), paint);
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.layerBlock, true);
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        if (this.layer != null) {
            updateLayerBlock$default(this, null, false, 2, null);
        }
    }

    public static /* synthetic */ void rectInParent$ui_release$default(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, androidx.compose.ui.geometry.MutableRect mutableRect, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.rectInParent$ui_release(mutableRect, z, z2);
    }

    public final void rectInParent$ui_release(androidx.compose.ui.geometry.MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long m3598getMinimumTouchTargetSizeNHjbRc = m3598getMinimumTouchTargetSizeNHjbRc();
                    float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(m3598getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(m3598getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    bounds.intersect(-m1940getWidthimpl, -m1937getHeightimpl, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(mo3409getSizeYbymL2g()) + m1940getWidthimpl, androidx.compose.ui.unit.IntSize.m4651getHeightimpl(mo3409getSizeYbymL2g()) + m1937getHeightimpl);
                } else if (clipBounds) {
                    bounds.intersect(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(mo3409getSizeYbymL2g()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(mo3409getSizeYbymL2g()));
                }
                if (bounds.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(bounds, false);
        }
        float m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() + m4610getXimpl);
        bounds.setRight(bounds.getRight() + m4610getXimpl);
        float m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(getPosition());
        bounds.setTop(bounds.getTop() + m4611getYimpl);
        bounds.setBottom(bounds.getBottom() + m4611getYimpl);
    }

    private final void fromParentRect(androidx.compose.ui.geometry.MutableRect bounds, boolean clipBounds) {
        float m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(getPosition());
        bounds.setLeft(bounds.getLeft() - m4610getXimpl);
        bounds.setRight(bounds.getRight() - m4610getXimpl);
        float m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(getPosition());
        bounds.setTop(bounds.getTop() - m4611getYimpl);
        bounds.setBottom(bounds.getBottom() - m4611getYimpl);
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.intersect(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(mo3409getSizeYbymL2g()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(mo3409getSizeYbymL2g()));
                bounds.isEmpty();
            }
        }
    }

    /* renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m3607withinLayerBoundsk4lQ0M(long pointerPosition) {
        if (!androidx.compose.ui.geometry.OffsetKt.m1888isFinitek4lQ0M(pointerPosition)) {
            return false;
        }
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo3661isInLayerk4lQ0M(pointerPosition);
    }

    /* renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    protected final boolean m3601isPointerInBoundsk4lQ0M(long pointerPosition) {
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(pointerPosition);
        float m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(pointerPosition);
        return m1871getXimpl >= 0.0f && m1872getYimpl >= 0.0f && m1871getXimpl < ((float) getMeasuredWidth()) && m1872getYimpl < ((float) getMeasuredHeight());
    }

    public void invalidateLayer() {
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    public void onLayoutModifierNodeChanged() {
        androidx.compose.ui.node.OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final androidx.compose.ui.node.NodeCoordinator findCommonAncestor$ui_release(androidx.compose.ui.node.NodeCoordinator other) {
        androidx.compose.ui.node.LayoutNode layoutNode = other.getLayoutNode();
        androidx.compose.ui.node.LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            androidx.compose.ui.Modifier.Node tail = other.getTail();
            androidx.compose.ui.Modifier.Node tail2 = getTail();
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(2);
            if (!tail2.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitLocalAncestors called on an unattached node".toString());
            }
            for (androidx.compose.ui.Modifier.Node parent = tail2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & m3613constructorimpl) != 0 && parent == tail) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new java.lang.IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == other.getLayoutNode() ? other : layoutNode.getInnerCoordinator$ui_release();
    }

    /* renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m3589offsetFromEdgeMKHz9U(long pointerPosition) {
        float m1871getXimpl = androidx.compose.ui.geometry.Offset.m1871getXimpl(pointerPosition);
        float max = java.lang.Math.max(0.0f, m1871getXimpl < 0.0f ? -m1871getXimpl : m1871getXimpl - getMeasuredWidth());
        float m1872getYimpl = androidx.compose.ui.geometry.Offset.m1872getYimpl(pointerPosition);
        return androidx.compose.ui.geometry.OffsetKt.Offset(max, java.lang.Math.max(0.0f, m1872getYimpl < 0.0f ? -m1872getYimpl : m1872getYimpl - getMeasuredHeight()));
    }

    /* renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    protected final long m3594calculateMinimumTouchTargetPaddingE7KxVPU(long minimumTouchTargetSize) {
        return androidx.compose.ui.geometry.SizeKt.Size(java.lang.Math.max(0.0f, (androidx.compose.ui.geometry.Size.m1940getWidthimpl(minimumTouchTargetSize) - getMeasuredWidth()) / 2.0f), java.lang.Math.max(0.0f, (androidx.compose.ui.geometry.Size.m1937getHeightimpl(minimumTouchTargetSize) - getMeasuredHeight()) / 2.0f));
    }

    /* renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    protected final float m3595distanceInMinimumTouchTargettz77jQw(long pointerPosition, long minimumTouchTargetSize) {
        if (getMeasuredWidth() >= androidx.compose.ui.geometry.Size.m1940getWidthimpl(minimumTouchTargetSize) && getMeasuredHeight() >= androidx.compose.ui.geometry.Size.m1937getHeightimpl(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long m3594calculateMinimumTouchTargetPaddingE7KxVPU = m3594calculateMinimumTouchTargetPaddingE7KxVPU(minimumTouchTargetSize);
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(m3594calculateMinimumTouchTargetPaddingE7KxVPU);
        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(m3594calculateMinimumTouchTargetPaddingE7KxVPU);
        long m3589offsetFromEdgeMKHz9U = m3589offsetFromEdgeMKHz9U(pointerPosition);
        if ((m1940getWidthimpl > 0.0f || m1937getHeightimpl > 0.0f) && androidx.compose.ui.geometry.Offset.m1871getXimpl(m3589offsetFromEdgeMKHz9U) <= m1940getWidthimpl && androidx.compose.ui.geometry.Offset.m1872getYimpl(m3589offsetFromEdgeMKHz9U) <= m1937getHeightimpl) {
            return androidx.compose.ui.geometry.Offset.m1870getDistanceSquaredimpl(m3589offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* compiled from: NodeCoordinator.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u0016X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$Companion;", "", "()V", "ExpectAttachedLayoutCoordinates", "", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "getPointerInputSource", "()Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "SemanticsSource", "getSemanticsSource", "UnmeasuredError", "graphicsLayerScope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "onCommitAffectingLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayerParams", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/LayerPositionalProperties;", "tmpMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.ui.node.NodeCoordinator.HitTestSource getPointerInputSource() {
            return androidx.compose.ui.node.NodeCoordinator.PointerInputSource;
        }

        public final androidx.compose.ui.node.NodeCoordinator.HitTestSource getSemanticsSource() {
            return androidx.compose.ui.node.NodeCoordinator.SemanticsSource;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void onMeasured() {
        androidx.compose.ui.Modifier.Node parent;
        if (m3586hasNodeH91voCI(androidx.compose.ui.node.NodeKind.m3613constructorimpl(128))) {
            androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(128);
                    boolean m3622getIncludeSelfInTraversalH91voCI = androidx.compose.ui.node.NodeKindKt.m3622getIncludeSelfInTraversalH91voCI(m3613constructorimpl);
                    if (m3622getIncludeSelfInTraversalH91voCI) {
                        parent = getTail();
                    } else {
                        parent = getTail().getParent();
                        if (parent == null) {
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        }
                    }
                    for (androidx.compose.ui.Modifier.Node headNode = headNode(m3622getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & m3613constructorimpl) != 0; headNode = headNode.getChild()) {
                        if ((headNode.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.ui.node.DelegatingNode delegatingNode = headNode;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.node.LayoutAwareModifierNode) {
                                    ((androidx.compose.ui.node.LayoutAwareModifierNode) delegatingNode).mo268onRemeasuredozmzZPI(getMeasuredSize());
                                } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                delegatingNode = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(delegatingNode);
                                                    }
                                                    delegatingNode = 0;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        if (headNode == parent) {
                            break;
                        }
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                createNonObservableSnapshot.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(androidx.compose.ui.graphics.Canvas canvas) {
        androidx.compose.ui.Modifier.Node m3599headH91voCI = m3599headH91voCI(androidx.compose.ui.node.NodeKind.m3613constructorimpl(4));
        if (m3599headH91voCI == null) {
            performDraw(canvas);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m3546drawx_KDEd0$ui_release(canvas, androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(mo3409getSizeYbymL2g()), this, m3599headH91voCI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void onPlaced() {
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(128);
        boolean m3622getIncludeSelfInTraversalH91voCI = androidx.compose.ui.node.NodeKindKt.m3622getIncludeSelfInTraversalH91voCI(m3613constructorimpl);
        androidx.compose.ui.Modifier.Node tail = getTail();
        if (!m3622getIncludeSelfInTraversalH91voCI && (tail = tail.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.Modifier.Node headNode = headNode(m3622getIncludeSelfInTraversalH91voCI); headNode != null && (headNode.getAggregateChildKindSet() & m3613constructorimpl) != 0; headNode = headNode.getChild()) {
            if ((headNode.getKindSet() & m3613constructorimpl) != 0) {
                androidx.compose.ui.node.DelegatingNode delegatingNode = headNode;
                androidx.compose.runtime.collection.MutableVector mutableVector = null;
                while (delegatingNode != 0) {
                    if (delegatingNode instanceof androidx.compose.ui.node.LayoutAwareModifierNode) {
                        ((androidx.compose.ui.node.LayoutAwareModifierNode) delegatingNode).onPlaced(this);
                    } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                        androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                        int i = 0;
                        delegatingNode = delegatingNode;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    delegatingNode = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                    }
                                    if (delegatingNode != 0) {
                                        if (mutableVector != null) {
                                            mutableVector.add(delegatingNode);
                                        }
                                        delegatingNode = 0;
                                    }
                                    if (mutableVector != null) {
                                        mutableVector.add(delegate);
                                    }
                                }
                            }
                            delegate = delegate.getChild();
                            delegatingNode = delegatingNode;
                        }
                        if (i == 1) {
                        }
                    }
                    delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                }
            }
            if (headNode == tail) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean shouldSharePointerInputWithSiblings() {
        androidx.compose.ui.Modifier.Node headNode = headNode(androidx.compose.ui.node.NodeKindKt.m3622getIncludeSelfInTraversalH91voCI(androidx.compose.ui.node.NodeKind.m3613constructorimpl(16)));
        if (headNode != null && headNode.getIsAttached()) {
            androidx.compose.ui.Modifier.Node node = headNode;
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
            if (!node.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitLocalDescendants called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node node2 = node.getNode();
            if ((node2.getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node child = node2.getChild(); child != null; child = child.getChild()) {
                    if ((child.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = child;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.PointerInputModifierNode) {
                                if (((androidx.compose.ui.node.PointerInputModifierNode) delegatingNode).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i == 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                }
            }
        }
        return false;
    }
}
